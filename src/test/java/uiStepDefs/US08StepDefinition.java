package uiStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import pages.US07_08.ErolPages;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US08StepDefinition {
    ErolPages erol = new ErolPages();
    Faker faker = new Faker();

    @And("User clicks to Lessons button")
    public void userClicksToLessonsButton() {
        erol.lessonsButton.click();
    }

    @And("User writes a Lesson Name in Lesson Name Box")
    public void userWritesALessonNameInLessonNameBox() {
        erol.lessonNameBox.sendKeys(faker.programmingLanguage().name());

    }

    @And("User clicks compulsory radio button")
    public void userClicksCompulsoryRadioButton() {
    }

    @And("User asserts that if tne compulsory radio button is clicked")
    public void userAssertsThatIfTneCompulsoryRadioButtonIsClicked() {
        erol.compulsoryButton.click();
    }

    @And("User writes a credit ccore in credit score box")
    public void userWritesACreditCcoreInCreditScoreBox() {
        erol.creditScoreBox.sendKeys("12");
        ReusableMethods.waitFor(5);
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        ReusableMethods.clickWithJS(erol.lessonSubmitButton);
    }

    @And("User asserts that if tne lesson is created")
    public void userAssertsThatIfTneLessonIsCreated() {
        assertTrue(erol.lessonCreatedAlert.isDisplayed());
    }

    @And("User clicks compulsory radio button as nonchecked")
    public void userClicksCompulsoryRadioButtonAsNonchecked() {

            erol.compulsoryButton.click();

    }
}
