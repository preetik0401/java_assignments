package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(dryRun = false,
features = {"src/test/resources/feature/"},
glue= {"stepdefinition","hooks"},
snippets = SnippetType.CAMELCASE,
monochrome = true,
plugin = {"pretty","html:cucumberReports",
		"json:cucumber.json", "pretty:cucumber-pretty.txt",
		"usage:cucumber-usage.json"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

	
}
