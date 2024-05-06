package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//UserLogin.feature",
		glue = {"stepDefs"}
		)


public class GooglePageRunner extends AbstractTestNGCucumberTests {
  
}
