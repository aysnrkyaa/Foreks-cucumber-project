package stepDefinition;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {

        @Before
        public void beforeScenario(){
            System.out.println("This will run before the Scenario");
        }

        @After
        public void afterScenario(Scenario scenario){
            System.out.println("This will run after the Scenario");

            if (scenario.isFailed()) {
                String screenshotName = scenario.getName().replaceAll(" ", "_");
                try {

                    File sourcePath = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);


                    File theDir = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshot");
                    if (!theDir.exists()){
                        boolean mkDir = theDir.mkdir();
                    }

                    File destinationPath = new File(theDir + "/" + screenshotName + ".png");

                    Files.copy(sourcePath, destinationPath);

                    Reporter.addScreenCaptureFromPath(destinationPath.toString());

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

