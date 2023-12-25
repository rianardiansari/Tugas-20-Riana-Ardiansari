package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "@web",
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"})
public class testRunnerWeb{}