package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", "rerun:target/rerun.txt"},
        features = "src\\test\\resources\\features",
        glue = "steps",
        dryRun = false,   //dryRun = true -> only unimplemented steps run
        tags = "@magento"
)
public class Runner {

}

