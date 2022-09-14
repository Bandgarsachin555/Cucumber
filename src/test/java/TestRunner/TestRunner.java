package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features= {"Feature/DataTable.feature"},
		  glue= {"StepDefination"},
		  dryRun=false,
		  monochrome=true,
	      plugin= {"html:Reports/abc.html"}
		 // tags=""
		)


public class TestRunner {

	
}
