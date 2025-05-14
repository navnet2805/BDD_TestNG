package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/test/resources/features/loginpage.feature",
                glue = {"org.example.stepDefinitions","org.example.hooks"},
                plugin = {"pretty","html:reports/report.html","json:reports/report.json"}, //reports
                monochrome = true, //remove unwanted characters in the console
                dryRun = false, //it will check each line in feature file is mapped with atleast 1 method
                publish = true
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}
