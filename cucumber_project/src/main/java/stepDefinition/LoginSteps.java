package stepDefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pageobjectmodel.homepage_function;
import pageobjectmodel.loginpage_function;


public class LoginSteps {

    public WebDriver driver;
    loginpage_function loginpage_fun = new loginpage_function();
    homepage_function homepage_fun=new homepage_function();

    @Given("^Open Foreks login page$")
    public void open_Foreks_login_page()  {
        loginpage_fun.setup("http://webcli-test.foreks.com.s3-website.eu-central-1.amazonaws.com/foreks/#!/login");
    }

    @Given("^Write username$")
    public void write_username()  {
        loginpage_fun.sendUsername("aysenur.kaya@foreks.com");
    }

    @Given("^Write password$")
    public void write_password() {
        loginpage_fun.sendPassword("123456");
    }

    @When("^Click login button$")
    public void click_login_button() throws Throwable {
        loginpage_fun.clickLoginbutton();
    }

    @Then("^Check username on that page$")
    public void check_username_on_that_page() throws Throwable {
        Thread.sleep(3000);
        loginpage_fun.clickProfile();
        loginpage_fun.checkUsername();
    }
    @Given("^Open Marbas login page$")
    public void open_Marbas_login_page()  {
        loginpage_fun.setup("http://webcli-test.foreks.com.s3-website.eu-central-1.amazonaws.com/marbas/");

    }

    @Given("^Write marbas username$")
    public void write_marbas_username() {
        loginpage_fun.sendUsername("marbasotomasyon");

    }

    @When("^Accept popup$")
    public void accept_popup() throws Throwable {
        loginpage_fun.acceptpopup();
    }

    @Then("^Check marbas username on that page$")
    public void check_marbas_username_on_that_page() {
        loginpage_fun.clickProfile();
        loginpage_fun.checkMarbasusername();
        loginpage_fun.quitDriver();
    }


    @When("^Accept popup marbas$")
    public void acceptPopupMarbas() throws InterruptedException {
        loginpage_fun.acceptpopup2();
    }
    @Given("^Click modul list$")
    public void click_modul_list()  {
      homepage_fun.clikcModullist();
    }
    @Given("^Click Analizler$")
    public void click_Analizler()  {
       homepage_fun.clickAnalizler();
    }
    @Given("^Click Özet İstatistik$")
    public void click_Özet_İstatistik()  {
      homepage_fun.clickOzetistatistik();
    }
    @When("^Search hisse$")
    public void search_hisse()  {
       homepage_fun.searchHisse();
    }

    @Then("^Check hisse on that page$")
    public void check_hisse_on_that_page()  {
        homepage_fun.checkPage();
    }

    @Then("^Quit page$")
    public void quit_page()  {
       loginpage_fun.quitDriver();
    }


    @And("^Open bosekran$")
    public void openBosekran() throws InterruptedException {
        homepage_fun.openBosekran();
    }
    @Given("^Click para piyasalari$")
    public void click_para_piyasalari() {
      homepage_fun.clickParapiyasalari();
    }

    @Given("^Click tum pariteler$")
    public void click_tum_pariteler() {
       homepage_fun.clickTumpariteler();
       homepage_fun.checktitle("Tüm Pariteler");
    }

    @Given("^Add column$")
    public void add_column() throws Throwable {
       homepage_fun.addColumn();
    }

    @Given("^Check column$")
    public void check_column() {
       homepage_fun.checkColumn("Saat");
    }

    @Given("^Delete column$")
    public void delete_column()  {
       homepage_fun.deleteColumn();
    }

    @Given("^Close widget$")
    public void close_widget() {
      homepage_fun.closeWidget();
    }

    @Given("^Check data$")
    public void check_data()  {
      homepage_fun.checkData();
    }

    @When("^Search sembol$")
    public void search_sembol() {
       homepage_fun.searchSembol("AUD/CAD");
    }

    @Then("^Click sembol detay$")
    public void click_sembol_detay() {
       homepage_fun.clickSemboldetail();
    }


    @And("^Click Finansal Oranlar$")
    public void clickFinansalOranlar() {
      homepage_fun.clickFinansaloranlar();
    }

    @Given("^Open vakifbank login page$")
    public void openVakifbankLoginPage() {
        loginpage_fun.setup("http://webcli-test.foreks.com.s3-website.eu-central-1.amazonaws.com/vakif/#!/");

    }

    @When("^Click profile button$")
    public void clickProfileButton() {
        loginpage_fun.clickProfile();
    }

    @Then("^Check vakifbank username$")
    public void checkVakifbankUsername()
    {
        loginpage_fun.checkVakifbankUsername();
    }


}
