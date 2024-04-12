package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import runner.RunCucumberTest;

public class Hooks extends RunCucumberTest {

    @Before
    public void setUp() {
        System.out.println("Inicio");
        getDriver(Browser.CHROME);
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            // Captura do screenshot
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            // Adiciona o screenshot ao relatório do Cucumber
            scenario.embed(screenshot, "image/png");
            System.out.println("Fim");
        }
    }
}
