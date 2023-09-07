package pages.US_03_04;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SametPage {

   public SametPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactButon;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement yourNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement yourEmailBox;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement sendMessageButon;

    @FindBy(xpath = "//div[@role='alert']")
     public WebElement alertMessage;

}
