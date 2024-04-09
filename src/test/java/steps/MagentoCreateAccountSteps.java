package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MagentoCreateAccountPage;
import pages.MagentoMainPage;
import pages.MagentoMyAccountPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Map;

public class MagentoCreateAccountSteps {

    MagentoMainPage magentoMainPage = new MagentoMainPage();
    MagentoCreateAccountPage magentoCreateAccountPage = new MagentoCreateAccountPage();
    MagentoMyAccountPage magentoMyAccountPage = new MagentoMyAccountPage();
    WebDriver driver = Driver.getDriver();
    Map<String, Object> userData;
    String randomEmail;

    @Given("user navigates to Magento website")
    public void user_navigates_to_magento_website() {
        driver.get(ConfigReader.getProperty("magentoUrl"));
    }

    @Given("user clicks on Create an Account Button")
    public void user_clicks_on_create_an_account_button() {
        magentoMainPage.CreateAccountBtn.click();
    }

    @When("user creates account with data")
    public void user_creates_account_with_data(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        userData = dataTable.asMap(String.class, Object.class);
        magentoCreateAccountPage.firstNameInputField.sendKeys(userData.get("First Name").toString());
        magentoCreateAccountPage.lastNameInputField.sendKeys(userData.get("Last Name").toString());
        randomEmail = BrowserUtils.getRandomEmail();
        System.out.println(randomEmail);
        magentoCreateAccountPage.emailAddressInputField.sendKeys(randomEmail);
        magentoCreateAccountPage.passwordInputField.sendKeys(userData.get("Password").toString());
        magentoCreateAccountPage.passwordConfirmationInputField.sendKeys(userData.get("Password").toString());

        magentoCreateAccountPage.createAnAccountBtn.click();

        Thread.sleep(3000);
    }

    @Then("user validates title {string}")
    public void user_validates_title(String titleName) {
        Assert.assertEquals(titleName, driver.getTitle());
    }




    @Then("user validates contact information matches with given user name and email")
    public void user_validates_contact_information_matches_with_given_user_name_and_email() {
        String actualFullNameAndEmail = magentoMyAccountPage.FullNameHolder.getText();

        String expectedFullNameAndEmail = userData.get("First Name").toString() + " " + userData.get("Last Name").toString() + "\n" + randomEmail;
        System.out.println(expectedFullNameAndEmail);
        Assert.assertEquals(expectedFullNameAndEmail, actualFullNameAndEmail);
    }

}
