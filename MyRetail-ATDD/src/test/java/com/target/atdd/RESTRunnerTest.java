package com.target.atdd;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/target/atdd/ProcessMyRetailApi.feature"}, 
glue = {"com.target.atdd.steps"}, tags = {"@restservice"})
public class RESTRunnerTest extends AbstractTestNGCucumberTests{

}