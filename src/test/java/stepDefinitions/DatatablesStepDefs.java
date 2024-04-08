package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;

import pages.DatatablesPage;

public class DatatablesStepDefs {

    DatatablesPage datatablesPage = new DatatablesPage();

    @When("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("kullanici new butonuna tiklar")
    public void kullaniciNewButonunaTiklar() {
        datatablesPage.newButton.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstName) {
        datatablesPage.firsNameEditText.sendKeys(firstName);
    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastName) {
        datatablesPage.lastNameEditText.sendKeys(lastName);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        datatablesPage.positionEditText.sendKeys(position);
    }

    @And("office bolumune {string} yazar")
    public void officeBolumuneYazar(String office) {
        datatablesPage.officeEditText.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        datatablesPage.extensionEditText.sendKeys(extension);
    }

    @And("start date bolumune {string} yazar")
    public void startDateBolumuneYazar(String startDate) {
        datatablesPage.startDateEditText.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        datatablesPage.salaryEditText.sendKeys(salary);
    }

    @And("kullanici create butonuna tiklar")
    public void kullaniciCreateButonunaTiklar() {
        datatablesPage.createButton.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String aranacakKelime) {
        datatablesPage.searchBox.sendKeys(aranacakKelime);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String arananKelime) {
        WebElement dataTableElements = Driver.getDriver().findElement(By.xpath("//td[contains(text(),'"+arananKelime+"')]"));
        Assert.assertTrue(dataTableElements.isDisplayed());
    }
}
