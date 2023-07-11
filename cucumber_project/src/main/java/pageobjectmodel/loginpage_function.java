package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.Driver;

public class loginpage_function extends AbstractClass {

    WebDriver driver;


    public loginpage_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void sendUsername(String username) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@type='text']")), username);
    }

    public void sendPassword(String password) {
        sendKeysFunction(driver.findElement(By.xpath("//input[@type='password']")), password);


    }

    public void clickLoginbutton() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//input[@value='Giriş Yapın']")));
        Thread.sleep(2000);
    }

    public void acceptpopup() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//button[@class='ok']")));
        Thread.sleep(2000);

    }
    public void acceptpopup2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//button[contains(@class,'ok')]"));
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click()", element);
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//button[contains(@class,'ok')]"));
        if (element2.isDisplayed()) {
            JavascriptExecutor exe = (JavascriptExecutor) driver;
            ex.executeScript("arguments[0].click()", element2);
        } else {
            System.out.println("Popup görüntülenemedi");
        }
    }

    public void clickProfile() {
        clickFunction(driver.findElement(By.xpath("//span[@id='menu-profile-toggle-button']")));
    }


    public void checkUsername() {
        String username = driver.findElement(By.xpath("(//strong[@class='tit ng-binding'])[1]")).getText();
        Assert.assertEquals(username ,"aysenur.kaya@foreks.com");
        System.out.println("Username :" +username);
    }

    public void checkMarbasusername()
    {
        String username = driver.findElement(By.xpath("(//strong[@class='tit ng-binding'])[1]")).getText();
        Assert.assertEquals(username ,"marbasotomasyon");
        System.out.println("Username :" +username);
    }
    public void checkerrormessage()
    {
        String message = driver.findElement(By.xpath("//div[@class='error show']")).getText();
        Assert.assertEquals(message ,"Kullanıcı adınız veya şifreniz geçersiz.");
        System.out.println(message);
    }
    public void checkVakifbankUsername() {
        String username=driver.findElement(By.xpath("(//strong[@frks-id='menu-username-lbl'])[1]")).getText();
        System.out.println("Vakifbank Username " +username);
        Assert.assertEquals(username,"Orcun001");

    }


    public void quitDriver() {

        Driver.closeDriver();
    }
}
