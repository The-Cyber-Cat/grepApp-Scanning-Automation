package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WindowType;
import utilities.ConfigReader;
import utilities.Driver;

public class Netflix extends TestBase {
    @Given("GrepApp sayfasina gidilir")
    public void grepappSayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("urlGrepApp"));
    }

    @And("netflix")
    public void netflix() {
        grepApp.grepAppInpt.sendKeys(ConfigReader.getProperty("netflix"));
    }

    @And("Yeni sekme acilir")
    public void yeniSekmeAcilir() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    }

}
