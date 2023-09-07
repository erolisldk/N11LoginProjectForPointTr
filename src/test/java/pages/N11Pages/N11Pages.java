package pages.N11Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Pages {

    public N11Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Giriş Yap']")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement epostaAdresi;

    @FindBy(xpath = "//a[@href='//www.n11.com/hesabim']")
    public WebElement hesabimButton;

    @FindBy(xpath = "//div[@data-errormessagefor='password']")
    public WebElement errorText;




}
