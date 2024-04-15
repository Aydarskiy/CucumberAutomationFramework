package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MagentoHomePage {

    WebDriver driver;

    public MagentoHomePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = " //span[contains(text(), 'Welcome, Amira Yata!')]")
    public WebElement loginGreetingTextHolder;

    @FindBy (id = "ui-id-4")
    public WebElement womenDropdown;

    @FindBy (id = "ui-id-10")
    public WebElement bottomsMenu;



    @FindBy (id = "ui-id-16")
    public WebElement shorts;

    @FindBy (id = "sorter")
    public WebElement sortByDropdown;

    @FindBy (xpath = "//ol[@class='products list items product-items']//span[@class='price']")
    public List<WebElement> priceHolder;




}
