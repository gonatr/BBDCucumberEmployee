package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsPage.EmployeePage;
import utilBase.Hooks;

public class EmployeeStep {
    public static WebDriver driver;

    public EmployeeStep(){
        this.driver = Hooks.driver;
    }

    EmployeePage employeee;

    @Given("^I in home page OrangeHRM$")
    public void iInHomePageOrangeHRM() {
        employeee = new EmployeePage(driver);
    }

    @When("^I input username and password$")
    public void iInputUsernameAndPassword() {
        employeee = new EmployeePage(driver);
        employeee.insUsPass("Admin","s3Kol4HQA!*");
    }

    @And("^I click login$")
    public void iClickLogin() {
        employeee = new EmployeePage(driver);
        employeee.btnLogin1();
    }

    @When("^I add new user PIM$")
    public void iAddNewUserPIM() {
        employeee = new EmployeePage(driver);
        employeee.addPim();
    }

    @And("^I input First Name, Midle Name, Last Name$")
    public void iInputFirstNameMidleNameLastName() throws InterruptedException {
        employeee = new EmployeePage(driver);
        employeee.addPimClick();
        employeee.addNewEmployee("Mistar","Ult","Van");
        employeee.slideUser();
        Thread.sleep(3000);
    }

    @And("^I set Username and Password$")
    public void iSetUsernameAndPassword() throws InterruptedException {
        employeee = new EmployeePage(driver);
        employeee.addNewUserLogin("mistarUV","Te$la1234","Te$la1234");
        employeee.btnSave();
        employeee.notifToastMessage();
        Thread.sleep(3000);
    }

    @Then("^Get get the result user$")
    public void getGetTheResultUser() throws InterruptedException {
        employeee.verifPage();
        Thread.sleep(3000);
    }

}
