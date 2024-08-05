package utilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class SupplySync_AigulRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumberReport.html", "json:target/testReport.json"},
            features = "src/test/resources/features",
            glue = "step_definitions",
            tags = "@branches",
            dryRun = false
    )






    public class CucumberRunner {
    }

}
