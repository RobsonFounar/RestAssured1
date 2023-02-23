package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "./feature",
// glue="com.testerun",
tags = "@validEmail",
monochrome = true,
// dryRun = false,
plugin = {"pretty","html:target/report-cucumber.html"},
snippets = SnippetType.CAMELCASE
)







public class CallTags {

	
	
}
