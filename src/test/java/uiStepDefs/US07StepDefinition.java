package uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.US07_08.ErolPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class US07StepDefinition {

    ErolPages erol = new ErolPages();

    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("User clicks to login button")
    public void userClicksToLoginButton() {
        erol.login.click();
    }
    @Then("User enters an deanUsername, password and then is logged in.")
    public void userEntersAnUsernamePasswordAndThenIsLoggedIn() {
        erol.username.sendKeys(ConfigReader.getProperty("deanUserName"), Keys.TAB, ConfigReader.getProperty("password"),
                Keys.TAB, Keys.ENTER);
    }

    @Then("User waits {int} seconds")
    public void userWaitsSeconds(int seconds) {
        ReusableMethods.waitFor(seconds);
    }


    @Then("User clicks login button")
    public void userClicksLoginButton() {
        erol.login.click();
    }

    @And("User clicks to menu button")
    public void userClickToMenuButton() {
        erol.menuButton.click();
    }

    @And("User clicks to Contact get all button")
    public void userClickToButton() {
        erol.contactGetAllButton.click();


    }

    @And("User asserts that if tne name column is visible")
    public void userAssertsThatIfTneNameColumnVisible() {
        assertTrue(erol.nameColumn.isDisplayed());
    }

    @And("User asserts that if tne email column is visible")
    public void userAssertsThatIfTneEmailColumnVisible() {
        assertTrue(erol.emailColumn.isDisplayed());
    }

    @And("User asserts that if tne date column is visible")
    public void userAssertsThatIfTneDateColumnVisible() {
        assertTrue(erol.dateeColumn.isDisplayed());
    }

    @And("User asserts that if tne subject column is visible")
    public void userAssertsThatIfTneSubjectColumnVisible() {
        assertTrue(erol.subjectColumn.isDisplayed());
    }

    @And("User asserts that if tne message column is visible")
    public void userAssertsThatIfTneMessageColumnVisible() {
        assertTrue(erol.messageColumn.isDisplayed());
    }
    @And("User closes driver")
    public void userClosesDriver() {
        Driver.closeDriver();
    }

    @Then("User enters an viceDeanUsername, password and then is logged in.")
    public void userEntersAnViceDeanUsernamePasswordAndThenIsLoggedIn() {
        erol.username.sendKeys(ConfigReader.getProperty("usernameViceDean"), Keys.TAB, ConfigReader.getProperty("password"),
                Keys.TAB, Keys.ENTER);
    }

    @Then("User enters an adminUsername, password and then is logged in.")
    public void userEntersAnAdminUsernamePasswordAndThenIsLoggedIn() {
        erol.username.sendKeys(ConfigReader.getProperty("adminUserName"), Keys.TAB, ConfigReader.getProperty("password"),
                Keys.TAB, Keys.ENTER);
    }
}



