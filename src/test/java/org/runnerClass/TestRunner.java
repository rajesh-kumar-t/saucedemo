package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepDefinition",dryRun=false, monochrome=true, strict=true)
public class TestRunner {

}
