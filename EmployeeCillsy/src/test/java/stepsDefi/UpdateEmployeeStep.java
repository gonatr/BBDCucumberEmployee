package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsPage.EmployeePage;
import utilBase.Hooks;

public class UpdateEmployeeStep {
    public static WebDriver driver;
    public UpdateEmployeeStep(){
        this.driver = Hooks.driver;
    }

    EmployeePage update;

    @When("I input new username and password")
    public void iInputNewUsernameAndPassword() {
        update = new EmployeePage(driver);
        update.insUsPass("mistarUV","Te$la1234");
        update.btnLogin1();
    }

    @And("I click my info")
    public void iClickMyInfo() {
        update = new EmployeePage(driver);
        update.myInfoCheck();
    }

    @And("I input Nationality, marital status gender")
    public void iInputNationalityMaritalStatusGender() throws InterruptedException {
        update = new EmployeePage(driver);
        update.genDer();
        update.selectNationality();
        update.maritalStatus();
        update.btnSave();
        update.notifToastMessage();
        Thread.sleep(3000);
    }

    @Then("Get the result user Punc out")
    public void getTheResultUserPuncOut() throws InterruptedException {
        update = new EmployeePage(driver);
        update.verifPage();
        Thread.sleep(3000);
    }
}
