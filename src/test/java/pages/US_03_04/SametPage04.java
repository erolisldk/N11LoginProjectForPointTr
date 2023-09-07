package pages.US_03_04;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SametPage04 {
    public SametPage04(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement anasayfaLogin;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath= "//*[@*='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath= "//*[@*='offcanvasNavbar-expand-false']")
    public WebElement menuButon;

    @FindBy(xpath= "//*[text()='Dean Management']")
    public WebElement deanManagementButon;

    @FindBy(id="name")
    public WebElement nameBox;

    @FindBy(id="surname")
    public WebElement surNameBox;

    @FindBy(id="birthPlace")
    public WebElement birthPlaceBox;

    @FindBy(id="phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(id= "birthDay")
    public WebElement birthDayBox;

    @FindBy(id= "ssn")
    public WebElement ssnBox;

    @FindBy(id= "username")
    public WebElement userNameBox;

    @FindBy(id= "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@*='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButon;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement hataliPhoneNumberUyariText;

}
