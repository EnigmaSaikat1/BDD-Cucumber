package io.github.enigmasaikat1.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Feature-Files",
    glue = "io.github.enigmasaikat1.StepDefinationss",
    monochrome = true,
    dryRun = true,
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
