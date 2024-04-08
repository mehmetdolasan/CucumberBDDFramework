package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuAppStepDefs {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("Kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("add element butonuna tiklar")
    public void addElementButonunaTiklar() {
        herokuappPage.addElementButton.click();
    }

    @And("Delete butonu gorunur oluncaya dek bekler")
    public void deleteButonuGorunurOluncayaDekBekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteElementButton,10);
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementButton.isDisplayed());
    }

    @Then("Delete butonuna tiklar")
    public void deleteButonunaTiklar() {
        herokuappPage.deleteElementButton.click();
    }

    @And("Delete butonunun gorunmedigi test")
    public void deleteButonununGorunmedigiTest() {
        Assert.assertTrue(herokuappPage.deleteElementButtonList.isEmpty());
    }
}
