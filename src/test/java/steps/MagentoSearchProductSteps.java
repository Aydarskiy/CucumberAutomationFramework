package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.MagentoMainPage;
import pages.MagentoSearchResultPage;
import java.util.List;

public class MagentoSearchProductSteps {
    MagentoMainPage magentoMainPage = new MagentoMainPage();
    MagentoSearchResultPage magentoSearchResultPage = new MagentoSearchResultPage();
    @When("user searches fri keyword {string}")
    public void user_searches_fri_keyword(String searchedProduct) throws InterruptedException {
        magentoMainPage.searchField.sendKeys(searchedProduct + Keys.ENTER);
    }

    @Then("user validates search result contains")
    public void user_validates_search_result_contains(io.cucumber.datatable.DataTable dataTable) {
        List<String> keyWords = dataTable.asList();
        for (WebElement item : magentoSearchResultPage.productItemNameHolder) {
            String itemDescription = item.getText();
            Boolean isFound = false;
            String wordNotFound = "";
            for (int i = 0; i < keyWords.size(); i++) {
                if (itemDescription.toLowerCase().contains(keyWords.get(i))) {
                    isFound = true;
                } else {
                    wordNotFound = keyWords.get(i);
                }
            }
            Assert.assertTrue("[" + itemDescription + "] does not contain keyword: [" + wordNotFound + "]", isFound);
        }
    }
}
