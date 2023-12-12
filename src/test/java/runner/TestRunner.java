package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/java/features/LoggedInUser.feature",
        glue = {"StepDefinition", "utils"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}
