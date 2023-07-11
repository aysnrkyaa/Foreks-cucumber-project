package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class homepage_function extends AbstractClass {
    WebDriver driver;

    public homepage_function() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openBosekran() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//span[@class='screenSelect ng-binding']")));
        clickFunction(driver.findElement(By.xpath("//span[normalize-space()='BosEkran']")));
    }

    public void clikcModullist() {
        clickFunction(driver.findElement(By.xpath("//div[@title='Modül Listesi']")));
    }

    public void clickAnalizler()  {
        clickFunction(driver.findElement(By.xpath("//div[contains(text(),'Analizler')]")));
    }

    public void clickOzetistatistik()  {
        clickFunction(driver.findElement(By.xpath("//div[@title='Özet İstatistik']")));
        String title = driver.findElement(By.xpath("//span[@class='ui-dialog-title']")).getText();
        Assert.assertEquals(title, "Özet İstatistik");
    }

    public void searchHisse() {
        clearFunction(driver.findElement(By.xpath("//input[@placeholder='Sembol']")));
        sendKeysFunction(driver.findElement(By.xpath("//input[@placeholder='Sembol']")),"ACSEL");

    }

    public void checkPage()  {
        String price = driver.findElement(By.xpath("(//span[@class='value ng-binding'])[1]")).getText();
        System.out.println(price);
    }

    public void clickParapiyasalari()
    {
        clickFunction(driver.findElement(By.xpath("//div[text()='Para Piyasaları']")));
    }
    public void clickTumpariteler()
    {
        clickFunction(driver.findElement(By.xpath("//div[text()='Tüm Pariteler']")));
    }
    public void checktitle(String value)
    {
        String title =driver.findElement(By.xpath("//span[@class='ui-dialog-title']")).getText();
        Assert.assertEquals(title,value);

    }
    public void addColumn() throws InterruptedException {
        clickFunction(driver.findElement(By.xpath("//*[@frks-id='open-column-settings']")));
        clickFunction(driver.findElement(By.xpath("//*[text()='Sütun Ekle']")));
        Thread.sleep(2000);
        clickFunction(driver.findElement(By.xpath("//div[normalize-space()='Saat']")));
        driver.findElement(By.xpath("//*[text()='Sütunları Seç']")).click();
        clickFunction(driver.findElement(By.xpath("//*[@frks-id='open-column-settings']")));
        Thread.sleep(3000);
    }
    public void checkColumn(String expected) {
        String columnkontrol = driver.findElement(By.xpath("//*[@frks-id='liveSecuriyPricesColmn_time']")).getText();
        Assert.assertEquals(columnkontrol, expected);
    }
    public void deleteColumn() {
        clickFunction(driver.findElement(By.xpath("//span[@title='Sütun Ekle']")));
        clickFunction(driver.findElement(By.xpath("//div[@class='css-view-1dbjc4n']//div[text()='Saat']")));
        clickFunction(driver.findElement(By.xpath("//*[@frks-id='open-column-settings']")));
    }
    public void closeWidget() {
        clickFunction(driver.findElement(By.xpath("//button[@title='Kapat']")));
    }
    public  void checkData(){
        String x=driver.findElement(By.xpath("(//div[@class='ng-binding ng-scope ng-isolate-scope'])[1]")).getText();
        if(x!=null)
        {
            System.out.println(x);
        }
        else
        {
            Assert.assertEquals(x,"Sembol boş gelmektedir.");
            System.out.println("Listede aranılan değer boş gelmektedir.");
        }
    }
    public  void searchSembol (String name){
        clickFunction(driver.findElement(By.xpath("//*[@frks-id='liveSecuriyPricesSearch']")));
        sendKeysFunction(driver.findElement(By.xpath("//*[@id='live-security-price-search-input-id']")),name);
    }
    public  void clickSemboldetail() {
        clickFunction(driver.findElement(By.xpath("//*[@frks-id='liveSecuriyPricesField_symbol']")));
    }
    public void clickFinansaloranlar()
    {
        clickFunction(driver.findElement(By.xpath("//div[text()='Finansal Oranlar']")));
    }




}
