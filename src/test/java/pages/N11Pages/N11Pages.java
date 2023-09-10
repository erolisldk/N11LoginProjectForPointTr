package pages.N11Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Pages {

    public N11Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement girisYap;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement epostaAdresi;

    @FindBy(xpath = "//a[@href='//www.n11.com/hesabim']")
    public WebElement hesabimButton;

    @FindBy(xpath = "//div[@class='errorMessage']")
    public WebElement errorText;
    @FindBy(xpath = "//a[@title='Çıkış Yap']")
    public WebElement cikisYapButton;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='resultView']")
    public WebElement succesfullResult;

    @FindBy(xpath = "//div[@class='notFound']")
    public WebElement notFoundText;



}
