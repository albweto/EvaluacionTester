package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterInformation {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterInformation(WebDriver browser){
        this.driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    @FindBy(css = "input[id='id_gender1']")
    private WebElement checkTitle;

    @FindBy(css = "input[id='customer_firstname']")
    private WebElement txtName;

    @FindBy(css = "input[id='lastname']")
    private WebElement txtLast;

    @FindBy(css = "input[id='passwd']")
    private WebElement txtPass;

    @FindBy(css = "input[id='firstname']")
    private WebElement txtPriName;

    @FindBy(css = "input[id='customer_lastname']")
    private WebElement txtPriLast;

    @FindBy(css = "input[id='company']")
    private WebElement txtComp;

    @FindBy(css = "input[id='address1']")
    private WebElement txtAdresUno;

    @FindBy(css = "input[id='address2']")
    private WebElement txtAdresDos;

    @FindBy(css = "input[id='city']")
    private WebElement txtCity;

    @FindBy(css = "#id_state > option:nth-child(2)")
    private WebElement CbxState;

    @FindBy(css = "input[id='postcode']")
    private WebElement txtCodePostal;

    @FindBy(css = "textarea[id='other']")  //
    private WebElement txtOther;

    @FindBy(css = "input[id='phone']")
    private WebElement txtPhone;

    @FindBy(css = "input[id='phone_mobile']")
    private WebElement txtPhoneMobile;

    @FindBy(css = "input[id='alias']")
    private WebElement txtAlias;

    @FindBy(css = "button[name='submitAccount']")
    private WebElement btnRegisterC;

    @FindBy(css = "#center_column > h1")
    private WebElement TxtResultObtenido;


    public void ClickTitle(){
        wait.until(ExpectedConditions.elementToBeClickable(checkTitle)).click();
    }

    public void writeName(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtName)).sendKeys(term);
    }

    public void writeLast(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtLast)).sendKeys(term);
    }

    public void writePass(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtPass)).sendKeys(term);
    }

    public void writePriName(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtPriName)).sendKeys(term);
    }

    public void writePriLast(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtPriLast)).sendKeys(term);
    }

    public void writeComp(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtComp)).sendKeys(term);
    }

    public void writeAdreesUno(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtAdresUno)).sendKeys(term);
    }

    public void writeAdreesDos(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtAdresDos)).sendKeys(term);
    }
    public void writeCity(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtCity)).sendKeys(term);
    }

    public void SelectionState(){
        wait.until(ExpectedConditions.elementToBeClickable(CbxState)).click();
    }

    public void writeCodePostal(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtCodePostal)).sendKeys(term);
    }

    public void writeOther(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtOther)).sendKeys(term);
    }

    public void writePhone(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtPhone)).sendKeys(term);
    }

    public void writePhoneMobile(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtPhoneMobile)).sendKeys(term);
    }

    public void writeAlias(String term){
        wait.until(ExpectedConditions.elementToBeClickable(txtAlias)).sendKeys(term);
    }

    public void BotonRegister(){
        wait.until(ExpectedConditions.elementToBeClickable(btnRegisterC)).click();
    }

    public String ResultObtenido(){

        return wait.until(ExpectedConditions.visibilityOf(TxtResultObtenido)).getText().trim();
    }


}
