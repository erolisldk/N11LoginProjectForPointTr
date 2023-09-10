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

public class N11SearchStepDefinition {

    N11Pages n11Pages = new N11Pages();
    Logger logger = org.apache.logging.log4j.LogManager.getLogger(N11SearchStepDefinition.class);

    @And("User logs successful search process to results.txt")
    public void userLogsSuccessfulSearchProcessToResultsTxt() {
        logger.info("User searchs " + ConfigReader.getProperty("SearchTerm1")+ " succesfully");
    }

    @Then("User takes screenshot of unsuccessfull search")
    public void userTakesScreenshotOfUnsuccessfullSearch() throws IOException {
        ReusableMethods.getScreenshot("Unsuccesfull_Search");
    }

}



