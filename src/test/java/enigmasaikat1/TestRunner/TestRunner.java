package enigmasaikat1.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Feature-Files",
        glue = {"enigmasaikat1.StepDefinations"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        dryRun = false,
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
