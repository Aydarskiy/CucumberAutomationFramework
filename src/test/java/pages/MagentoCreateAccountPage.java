package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MagentoCreateAccountPage {

    WebDriver driver;

    public MagentoCreateAccountPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstNameInputField;

    @FindBy (xpath = "//input[@id='lastname']")
    public WebElement lastNameInputField;

    @FindBy (xpath = "//input[@id='email_address']")
    public WebElement emailAddressInputField;


    @FindBy (xpath = "//input[@id='password']")
    public WebElement  passwordInputField;


    @FindBy (xpath = "//input[@id='password-confirmation']")
    public WebElement  passwordConfirmationInputField;


    @FindBy (xpath = "//button[@class='action submit primary']")
    public WebElement  createAnAccountBtn;









}
