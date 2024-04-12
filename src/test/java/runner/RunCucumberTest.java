package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources/features",
        tags = "~@ignore",
        glue = {"steps"},
        monochrome = true
)

public class RunCucumberTest extends RunBase{


    @AfterClass public static void stop() {

        if (driver != null) {
            driver.quit();

        }
    }
}

