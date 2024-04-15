package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MagentoSearchResultPage {

    WebDriver driver;

    public MagentoSearchResultPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ol[@class='products list items product-items']//a[@class='product-item-link']")
    public List<WebElement> productItemNameHolder;
}
