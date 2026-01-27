package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output.html"}
)

public class RunCucumberTest {

}
