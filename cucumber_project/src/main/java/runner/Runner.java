package runner;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.IOException;


@CucumberOptions(

        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html","pretty","json:target/cucumber-reports/report.json"},
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false
)


public class Runner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass() throws IOException {
        Reporter.loadXMLConfig("/Users/aysenurkaya/IdeaProjects/cucumber_project/target/ExtentReport/ExtentReportRegression.html");
        Reporter.setSystemInfo("QA Tester : ", "Ayşenur kaya");
        Reporter.setSystemInfo("Application name : ", "Foreks Cucumber Project");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "Test Automation Engineer");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }






}
