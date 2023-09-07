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

    // Cucumber'da feature ve stepdefinitions eslesmesi class seviyesinde degil
    // package seviyesindedir
    // dolayisiyla @Before ve @After stepdefinitions packagesi altinda herhangibir yerde olabilir
    // ancak uygulamada genellikle Hooks isminde bir class olusturup onun icinde konulur



    RequestSpecification spec;
    @Before(value = "@us01")
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://automationexercise.com/").build();
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}

