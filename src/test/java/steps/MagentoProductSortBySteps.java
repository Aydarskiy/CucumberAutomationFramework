package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MagentoHomePage;
import utilities.Driver;

import java.util.List;

public class MagentoProductSortBySteps {

    MagentoHomePage magentoHomePage = new MagentoHomePage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user hovers over woman drop-down menu")
    public void user_hovers_over_woman_drop_down_menu() throws InterruptedException {
        actions.moveToElement(magentoHomePage.womenDropdown).perform();


    }

    @When("user hover over bottom menu")
    public void user_hover_over_bottom_menu() {

        actions.moveToElement(magentoHomePage.bottomsMenu).perform();

    }

    @When("user selects shorts")
    public void user_selects_shorts() {

        actions.click(magentoHomePage.shorts).perform();

    }


    @When("user clicks on sort by drop-down and selects sort by price")
    public void user_clicks_on_sort_by_drop_down_and_selects_sort_by_price() {
        Select select = new Select(magentoHomePage.sortByDropdown);
        select.selectByValue("price");

    }


    @Then("user validates product prices are listed from low to high")
    public void user_validates_product_prices_are_listed_from_low_to_high() {
        WebDriver driver = Driver.getDriver();

        List<WebElement> itemPrices = magentoHomePage.priceHolder;

        for (int i = 0; i < itemPrices.size() - 1; i++) {
            double itemPrice1 = Double.parseDouble(itemPrices.get(i).getText().substring(1));
            double itemPrice2 = Double.parseDouble(itemPrices.get(i + 1).getText().substring(1));
            Assert.assertTrue(itemPrice1 <= itemPrice2);


        }
    }

}

