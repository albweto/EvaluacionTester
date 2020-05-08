package steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.SearchPage;
import pageobjects.RegisterAccount;
import pageobjects.RegisterInformation;

public class AccountSteps {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver_win322\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Given("^El cliente entra a la pagina y ingresa a la opcion crear nueva cuenta$")
    public void elClienteEntraALaPaginaYIngresaALaOpcionCrearNuevaCuenta() {
        driver.get("http://automationpractice.com/index.php");
        SearchPage search = new SearchPage(driver);
        search.clicSearch();
    }

    @When("^ingresa el email y pone registrar nueva cuenta$")
    public void ingresaElEmailYPoneRegistrarNuevaCuenta() {
        RegisterAccount RegisterEm = new RegisterAccount(driver);
        RegisterEm.writeEmail("brigitteortiz@gmail.com");
        RegisterEm.clicRegister();
    }

    @And("^luego el cliente registra sus datos y pone registrar$")
    public void luegoElClienteRegistraSusDatosYPoneRegistrar() {
        RegisterInformation RegisterInfo = new RegisterInformation(driver);
        RegisterInfo.ClickTitle();
        RegisterInfo.writeName("Maria");
        RegisterInfo.writeLast("Huanca");
        RegisterInfo.writePass("123456");
        RegisterInfo.writePriName("Rosa Carla");
        RegisterInfo.writePriLast("Perez");
        RegisterInfo.writeComp("BCP");
        RegisterInfo.writeAdreesUno("direccion uno");
        RegisterInfo.writeAdreesDos("direccion dos");
        RegisterInfo.writeCity("Lima");
        RegisterInfo.SelectionState();
        RegisterInfo.writeCodePostal("35762");
        RegisterInfo.writeOther("Prueba 01");
        RegisterInfo.writePhone("013454321");
        RegisterInfo.writePhoneMobile("954673421");
        RegisterInfo.writeAlias("Robot");
        RegisterInfo.BotonRegister();
    }

    @Then("^Se muestra mensaje \"([^\"]*)\"$")
    public void seMuestraMensaje(String price) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RegisterInformation RegisterInfo = new RegisterInformation(driver);
       Assert.assertEquals(RegisterInfo.ResultObtenido(),price);
        throw new PendingException();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed())
            takeScreenshot(scenario);
        driver.quit();

    }
     private void takeScreenshot(Scenario scenario){
         final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
         scenario.embed(screenshot,"image/png");
        }

    }
