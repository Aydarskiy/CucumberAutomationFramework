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
    public void user_searches_fri_keyword(String searchedProduct) {
        magentoMainPage.searchField.sendKeys(searchedProduct + Keys.ENTER);
    }

    @Then("user validates search result contains")
    public void user_validates_search_result_contains(io.cucumber.datatable.DataTable dataTable) {
        List<String> keyWords = dataTable.asList();
        for (WebElement item : magentoSearchResultPage.productItemNameHolder) {
            String itemDescription = item.getText();
            boolean isFound = false;
            String wordNotFound = "";
            for (String keyWord : keyWords) {
                if (itemDescription.toLowerCase().contains(keyWord)) {
                    isFound = true;
                } else {
                    wordNotFound = keyWord;
                }
            }
            Assert.assertTrue("[" + itemDescription + "] does not contain keyword: [" + wordNotFound + "]", isFound);
        }
    }
}
