package uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import pages.N11Pages.N11Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
import static org.junit.Assert.assertTrue;

public class N11StepDefinition {

    N11Pages n11Pages = new N11Pages();
    Logger logger = org.apache.logging.log4j.LogManager.getLogger(N11StepDefinition.class);
    Logger logger2 = org.apache.logging.log4j.LogManager.getLogger(N11StepDefinition.class);


    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Then("User clicks to girisYap button")
    public void userClicksToGirisYapButton() {
        ReusableMethods.jsExecutorClick(n11Pages.girisYap);
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

    @Then("User logouts the page")
    public void userLogoutsThePage() {
        ReusableMethods.jsExecutorClick(n11Pages.cikisYapButton);
    }

    @And("User takes screenshot of full screen for successful logout")
    public void userTakesScreenshotOfFullScreenForSuccessfulLogout() throws IOException {
        ReusableMethods.getScreenshot("N11SuccesfullLogout");
    }

    @And("User closes driver")
    public void userClosesDriver() {
        Driver.closeDriver();
    }

    @Then("User enters an false username, password and then is logged in")
    public void userEntersAnFalseUsernamePasswordAndThenIsLoggedIn() {
        n11Pages.epostaAdresi.sendKeys(ConfigReader.getProperty("FalseUsername"), Keys.TAB, ConfigReader.getProperty("FalsePassword"));
        ReusableMethods.jsExecutorClick(n11Pages.girisYapButton);
        assertTrue(n11Pages.errorText.isDisplayed());
        logger.info("Trying to log in with an invalid email.");
    }
    @And("User takes screenshot of error message as full screen")
    public void userTakesScreenshotOfErrorMessageasFullScreen() throws IOException {

        ReusableMethods.getScreenshot("ErrorMessage_Page");
    }


    @Then("The user checks if the logout has been completed successfully.")
    public void theUserChecksIfTheLogoutHasBeenCompletedSuccessfully() {
        assertTrue(n11Pages.girisYap.isDisplayed());
    }

    @And("User logs unsuccessful login attempt and logs error message to loginerror.txt")
    public void userLogsUnsuccessfulLoginAttemptAndLogsErrorMessageToLoginerrorTxt() {
        logger.error("It gives 'E-posta adresiniz veya şifreniz hatalı' alert.");
    }

    @Then("User cliks to searchBox and writes valid keyword")
    public void userCliksToSearchBoxAndWrites() {
        n11Pages.searchBox.sendKeys(ConfigReader.getProperty("SearchTerm1"),Keys.ENTER);
    }

    @Then("user checks whether the search process has been completed successfully.")
    public void userChecksWhetherTheSearchProcessHasBeenCompletedSuccessfully() {
        assertTrue(n11Pages.succesfullResult.isDisplayed());
    }

    @Then("User takes screenshot of successfull search")
    public void userTakesScreenshotOfSuccessfullSearch() throws IOException {
        ReusableMethods.getScreenshot("Succesfull_Search");
    }

    @And("User logs successful search process to results.txt")
    public void userLogsSuccessfulSearchProcessToResultsTxt() {
        logger2.info("User searchs " + ConfigReader.getProperty("SearchTerm1")+ " succesfully");
    }

    @Then("User cliks to searchBox and writes invalid keyword")
    public void userCliksToSearchBoxAndWritesInvalidKeyword() {
        n11Pages.searchBox.sendKeys(ConfigReader.getProperty("SearchTerm2"),Keys.ENTER);
    }

    @Then("user checks whether the search process has been uncompleted")
    public void userChecksWhetherTheSearchProcessHasBeenUncompleted() {
        assertTrue(n11Pages.notFoundText.isDisplayed());
    }

    @Then("User takes screenshot of unsuccessfull search")
    public void userTakesScreenshotOfUnsuccessfullSearch() throws IOException {
        ReusableMethods.getScreenshot("Unsuccesfull_Search");
    }

    @And("User logs unsuccessful search process to results.txt")
    public void userLogsUnsuccessfulSearchProcessToResultsTxt() {
        logger2.info("User doesn't search " + ConfigReader.getProperty("SearchTerm2")+ " succesfully");
    }



}



