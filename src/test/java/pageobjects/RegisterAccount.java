package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterAccount {
    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterAccount(WebDriver browser) {
        this.driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    @FindBy(css = "input[name='email_create']")
    private WebElement txtEmail;

    @FindBy(css = "button[class='btn btn-default button button-medium exclusive']")
    private WebElement btnRegister;

    //Actions RegisterAccount
    public void writeEmail(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtEmail)).sendKeys(term);
    }

    public void clicRegister()
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnRegister)).click();
    }
}
