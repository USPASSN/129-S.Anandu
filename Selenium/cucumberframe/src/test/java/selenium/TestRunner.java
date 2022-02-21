package selenium;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:FeatureFile/ebay.feature",glue="selenium")
public class TestRunner {
	
	
}
