package hook;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    RequestSpecification spec;
    @Before()
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://www.n11.com/").build();
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] failedScreenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png","failedScenario" + scenario.getName());
        }
        Driver.closeDriver();
    }
}

