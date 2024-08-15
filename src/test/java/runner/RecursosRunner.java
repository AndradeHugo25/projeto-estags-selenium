package runner;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/recursos"},
        glue = {"teoricas.selenium.integracao_cucumber.steps"},
        plugin = {"pretty", "html:target/cucumber-reports/html-report.html",
            "json:target/cucumber-reports/json-report.json",
            "junit:target/cucumber-reports/xml-report.xml"},
        tags = "@smoke"
        )
public class RecursosRunner {
}
