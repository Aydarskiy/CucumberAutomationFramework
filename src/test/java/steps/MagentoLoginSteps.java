package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MagentoHomePage;
import pages.MagentoLoginPage;
import pages.MagentoMainPage;
import utilities.ConfigReader;

public class MagentoLoginSteps {

    MagentoMainPage magentoMainPage = new MagentoMainPage();
    MagentoLoginPage magentoLoginPage = new MagentoLoginPage();
    MagentoHomePage magentoHomePage = new MagentoHomePage();


    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
      magentoMainPage.SignInBtn.click();
    }
    @When("user inputs valid user name and password")
    public void user_inputs_valid_user_name_and_password() {
        magentoLoginPage.emailInputField.sendKeys(ConfigReader.getProperty("magentoLoginEmail"));
        magentoLoginPage.passwordInputField.sendKeys(ConfigReader.getProperty("magnetoLoginPassword"));
        magentoLoginPage.signInBtn.click();

    }

    @Then("user validates greeting text {string}")
    public void user_validates_greeting_text(String expectedGreetingText) {
        Assert.assertEquals(magentoHomePage.loginGreetingTextHolder.getText(), expectedGreetingText);

    }


    }

