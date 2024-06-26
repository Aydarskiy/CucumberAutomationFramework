package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MagentoMainPage {

    WebDriver driver;

    public MagentoMainPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(text(), 'Create an Account')]")
    public WebElement CreateAccountBtn;

    @FindBy (xpath = " //a[contains(text(), 'Sign In')]")
    public WebElement SignInBtn;


    @FindBy (id = "search")
    public WebElement searchField;





}
