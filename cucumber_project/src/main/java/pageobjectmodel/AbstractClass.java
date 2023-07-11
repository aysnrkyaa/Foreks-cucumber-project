package pageobjectmodel;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class AbstractClass {

    public WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 40);

    public void setup(String url) {
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();

    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);

    }

    public void getTextFunction(WebElement gettextElement) {
        wait.until(ExpectedConditions.elementToBeClickable(gettextElement));
        gettextElement.getText();

    }

    public void AssertionFunction(WebElement actual, String expected) {
        wait.until(ExpectedConditions.visibilityOf(actual));
         Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message :" + actual.getText());

    }
    public void clearFunction(WebElement clearElement)
    {
        wait.until(ExpectedConditions.elementToBeClickable(clearElement));
        clearElement.clear();


    }
    public void quitDriver()
    {
        driver.quit();
    }


}

