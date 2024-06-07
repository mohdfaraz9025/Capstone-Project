package capstoneRunner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features/Capstone.feature",
    glue = "stepDefinition",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
}
