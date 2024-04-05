package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefs {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        ReusableMethods.waitFor(1);
        amazonPage.rejectCookie.click();
    }
    @When("kullanici Iphone aratir")
    public void kullanici_iphone_aratir() {
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
    }
    @Then("kullanici sonuclarin Iphone icerdigini test eder")
    public void kullanici_sonuclarin_iphone_icerdigini_test_eder() {
        String expectedData = "Iphone";
        String actualData = amazonPage.resultText.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchBox.sendKeys("Selenium",Keys.ENTER);
    }

    @Then("kullanici sonuclarin Selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        String expectedData = "Selenium";
        String actualData = amazonPage.resultText.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @When("kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchBox.sendKeys("Java",Keys.ENTER);
    }

    @Then("kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {
        String expectedData = "Java";
        String actualData = amazonPage.resultText.getText();
        Assert.assertTrue(actualData.contains(expectedData));
    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String arg0) {
        amazonPage.searchBox.sendKeys(arg0,Keys.ENTER);
    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String arg0) {
        String actualData = amazonPage.resultText.getText();
        Assert.assertTrue(actualData.contains(arg0));
    }
}
