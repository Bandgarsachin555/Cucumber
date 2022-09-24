package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features= {"Feature/all.feature"},
		  glue= {"StepDefination"},
		  dryRun=false,
		  monochrome=true,
	      plugin= {"html:Reports/abc.html"},
		 tags= "not @OD"
		)


public class TestRunner {

	
}
