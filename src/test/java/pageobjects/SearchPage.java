package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;
    //constructor

    public SearchPage(WebDriver browser) {
        this.driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
    }

    //locatros
    @FindBy(css = "div.header_user_info a[class='login']")
    private WebElement btnSearch;

    //Actions RegisterAccount
    public void clicSearch()
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch)).click();
    }


}
