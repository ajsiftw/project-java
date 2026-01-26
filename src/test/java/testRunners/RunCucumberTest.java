package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C://Users//ajsif//IdeaProjects//project-java//src//test//features//Login.feature",
                    "C://Users//ajsif//IdeaProjects//project-java//src//test//features//PracticeForm.feature"},
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output"}
)

public class RunCucumberTest {

}
