package Testing.features;
//package Annotation; 

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class) 
@CucumberOptions(features="classpath:Folder/steps.feature",glue="Testing.features")
//public class runTest { }
public class TestRunner {

}
