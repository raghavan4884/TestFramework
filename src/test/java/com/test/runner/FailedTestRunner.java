package com.test.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="@target/rerun.txt",glue= {"com.test.stepdefns"},monochrome=true,dryRun=false,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/reports.html"})


public class FailedTestRunner {

}
