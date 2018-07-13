package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue = {"stepDefination"},
tags = {"@PracticeTest"},

plugin = {"html:Reports/cucumber-html-report",
		 "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports-extent/report.html",
		"json:Reports/cucumber.json",
		"usage:Reports/cucumber-usage.json",
		"junit:Reports/cucumber-junit.xml"})
public class TestRunner {

}
