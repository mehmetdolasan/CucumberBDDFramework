package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefs {

    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));

    }
    @Then("login yazisina tiklar")
    public void login_yazisina_tiklar() {
        brcPage.homePageLoginButton.click();
    }
    @Then("gecersiz username girer")
    public void gecersiz_username_girer() {
        brcPage.email.sendKeys(ConfigReader.getProperty("wrongUsername"));
    }
    @Then("gecersiz password girer")
    public void gecersiz_password_girer() {
        //brcPage.password.sendKeys(ConfigReader.getProperty("wrongPass"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPass")).perform();
    }
    @Then("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        brcPage.formLoginButton.click();
    }
    @Then("sayfaya giris yapilmadigini test eder")
    public void sayfaya_giris_yapilmadigini_test_eder() {
        Assert.assertTrue(brcPage.nonLoginControl.isDisplayed());
    }

}
