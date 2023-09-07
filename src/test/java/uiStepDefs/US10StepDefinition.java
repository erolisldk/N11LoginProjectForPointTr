package uiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US9_10_Bahadir.BahadirPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US10StepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    BahadirPage bahadir = new BahadirPage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.waitFor(saniye);
    }

    @Then("Kullanici Login yazisina tiklar")
    public void kullaniciLoginYazisinaTiklar() {
        bahadir.login.click();
    }


    @Then("Kullanici User Name alanina {string} password alanina {string} degerini girip giris yapar")
    public void kullaniciUserNameAlaninaPasswordAlaninaDegeriniGiripGirisYapar(String username, String password) {
        bahadir.username.sendKeys(ConfigReader.getProperty(username), Keys.TAB,
                ConfigReader.getProperty(password), Keys.TAB, Keys.ENTER);
    }

    @Then("Kullanici acilan ekranda Lesson Program bolumune tiklar")
    public void kullaniciAcilanEkrandaLessonProgramBolumuneTiklar() {
        bahadir.lessonProgram.click();
    }


    @Then("Kullanici Add Lesson Program alanindaki Select Lesson menusunun erisilebilir oldugunu dogrular")
    public void kullaniciAddLessonProgramAlanindakiSelectLessonMenusununErisilebilirOldugunuDogrular() {
        assertTrue(bahadir.selectLesson.isEnabled());
    }

    @Then("Kullanici Add Lesson Program alanindaki Select Lesson menusunden JavaScript dersini secer")
    public void kullaniciAddLessonProgramAlanindakiSelectLessonMenusundenJavaScriptDersiniSecer() {
        //actions.moveToElement(bahadir.selectLesson).perform();
        //ReusableMethods.jsExecutorClick(bahadir.selectLesson);
        //ReusableMethods.waitFor(2);
        ////actions.doubleClick(bahadir.javaScriptDersi);
        ////ReusableMethods.jsExecutorClick(bahadir.javaScriptDersi);
        //bahadir.selectLesson.sendKeys("JavaScript", Keys.ENTER);
        //ReusableMethods.waitFor(2);

        //bahadir.selectLesson.click();
        bahadir.chooseEducationTerm.click();
        bahadir.chooseEducationTerm.click();
        //bahadir.chooseEducationTerm.sendKeys(Keys.SHIFT, Keys.TAB, "Music", Keys.ENTER);
        bahadir.chooseEducationTerm.sendKeys(Keys.SHIFT, Keys.TAB, Keys.DOWN,Keys.ENTER);
        //ReusableMethods.clickWithJS(bahadir.selectLesson);
        //ReusableMethods.waitFor(3);
        //actions.sendKeys(Keys.TAB).perform();


    }
}
