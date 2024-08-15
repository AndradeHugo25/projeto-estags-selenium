package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/report_features"},
        glue = {"teoricas.selenium.report_steps"},
        plugin = {"pretty", "html:target/cucumber-reports/html-report.html",
                "json:target/cucumber-reports/json-report.json",
                "junit:target/cucumber-reports/xml-report.xml"}
        )
public class Runner {
}

