package hook;


import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    private static Scenario scenario;

    public static void setScenario(Scenario scenario) {
        Hooks.scenario = scenario;
    }

    public static Scenario getScenario() {
        return scenario;
    }

    @Before
    public void setUp(){
        System.out.println("Metod calisti.");
    }

    @After
    public void tearDown() {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

}
