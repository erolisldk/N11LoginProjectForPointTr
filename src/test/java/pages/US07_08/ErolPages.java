package pages.US07_08;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ErolPages {

    public ErolPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "(//a[@role='button'])[11]")
    public WebElement contactGetAllButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]")
    public WebElement nameColumn;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
    public WebElement emailColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/span[1]")
    public WebElement dateeColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]")
    public WebElement subjectColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]")
    public WebElement messageColumn;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonNameBox;


    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryButton;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreBox;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement lessonSubmitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement lessonCreatedAlert;


}
