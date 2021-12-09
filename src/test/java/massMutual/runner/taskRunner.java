package massMutual.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features",
        glue = "massMutual/stepDefinitions",
        plugin = "html:target/cucumber-report.html",
        dryRun = false,
        tags = ""

)
public class taskRunner {

}
