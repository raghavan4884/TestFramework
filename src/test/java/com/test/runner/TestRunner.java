package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.test.stepdefns"},monochrome=true,dryRun=false,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {

}
