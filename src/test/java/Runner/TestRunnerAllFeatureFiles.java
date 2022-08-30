package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        tags = "@Regression",
        features = {"src/main/resources/FeatureFile"},
        glue = {"StepDefinition"},
        plugin = {"html:target/report/RegressionTestResult.html"}

)


public class TestRunnerAllFeatureFiles extends AbstractTestNGCucumberTests { }