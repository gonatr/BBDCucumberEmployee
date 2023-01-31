package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsPage.LoginPage;
import utilBase.Hooks;

public class LoginStep {
    public static WebDriver driver;
    public LoginStep(){
        this.driver = Hooks.driver;
    }

    LoginPage login;
    @Given("^User on page employee sdcillsy$")
    public void userOnPageEmployeeSdcillsy() {
        login = new LoginPage(driver);
    }


    //Page Valid Login
    @When("^User fill form (.*) and (.*)$")
    public void userFillFormUsernameAndPassword(String username, String password) {
        login = new LoginPage(driver);
        login.insUsPass(username,password);
    }

    @And("^User click on loginad$")
    public void userClickOnLoginad() {
        login = new LoginPage(driver);
        login.btnLogin1();
    }

    @Then("^Get user Valid login resource$")
    public void getUserValidLoginResource() {
        login.verifPage();
    }

    //Page Invalid Login
    @When("^User filll form (.*) and (.*)$")
    public void userFilllFormUsernameAndPassword(String username, String password) {
        login = new LoginPage(driver);
        login.insUsPass(username,password);
    }

    @And("^User click button loginad$")
    public void userClickButtonLoginad() {
        login = new LoginPage(driver);
        login.btnLogin1();
    }

    @Then("^Get Valid login resource$")
    public void getValidLoginResource() {
        login = new LoginPage(driver);
        login.tehes();
    }

    //Page Logout
    @When("^User insert fill form (.*) and (.*)$")
    public void userInsertFillFormUsernameAndPassword(String username, String password) {
        login = new LoginPage(driver);
        login.insUsPass(username,password);
    }

    @And("^User click btm login$")
    public void userClickBtmLogin() {
        login = new LoginPage(driver);
        login.btnLogin1();
    }

    @And("^User in home page Dasboard$")
    public void userInHomePageDasboard() {
        login = new LoginPage(driver);
        login.verifPage();
    }

    @When("^User click name on right top$")
    public void userClickNameOnRightTop() {
        login = new LoginPage(driver);
        login.menuNamebtn();
    }

    @And("^User click logout$")
    public void userClickLogout() {
        login = new LoginPage(driver);
        login.btnLogout1();
    }

    @Then("^User get resource Logout$")
    public void userGetResourceLogout() {
        login = new LoginPage(driver);
        login.pageVerifHomeLogin();
    }
}
