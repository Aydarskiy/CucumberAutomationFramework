package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MagentoLoginPage {

    WebDriver driver;

    public MagentoLoginPage(){
       driver = Driver.getDriver();
       PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement emailInputField;

    @FindBy(id = "pass")
    public WebElement passwordInputField;

    @FindBy(id = "send2")
    public WebElement signInBtn;







}
