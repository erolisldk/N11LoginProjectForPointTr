package uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.N11Pages.N11Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


public class N11StepDefinition {

    N11Pages n11Pages = new N11Pages();

    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("User clicks to girisYap button")
    public void userClicksToGirisYapButton() {
        n11Pages.girisYap.click();
    }
    @Then("User enters an username, password and then is logged in.")
    public void userEntersAnUsernamePasswordAndThenIsLoggedIn() {
        n11Pages.epostaAdresi.sendKeys(ConfigReader.getProperty("Username"), Keys.TAB, ConfigReader.getProperty("Password"),
                Keys.ENTER);
    }
    @Then("User waits {int} seconds")
    public void userWaitsSeconds(int seconds) {
        ReusableMethods.waitFor(seconds);
    }

    @And("The user checks if the login has been completed successfully.")
    public void theUserChecksIfTheLoginHasBeenCompletedSuccessfully() {
        assertTrue(n11Pages.hesabimButton.getAttribute("title").contains("Hesabım"));


    }
    @And("User takes screenshot of full screen")
    public void userTakesScreenshotOfFullScreen() throws IOException {
        ReusableMethods.getScreenshot("N11SuccesfullLogin");
    }

    @Then("User enters an false username, password and then is logged in")
    public void userEntersAnFalseUsernamePasswordAndThenIsLoggedIn() {
        n11Pages.epostaAdresi.sendKeys(ConfigReader.getProperty("FalseUsername"), Keys.TAB, ConfigReader.getProperty("FalsePassword"),
                Keys.ENTER);
        assertTrue(n11Pages.errorText.isDisplayed());
    }
    @And("User takes screenshot of error message and full screen")
    public void userTakesScreenshotOfErrorMessageAndFullScreen() throws IOException {

        ReusableMethods.getScreenshot("ErrorMessage_Page");
    }
}



