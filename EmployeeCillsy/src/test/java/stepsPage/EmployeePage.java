package stepsPage;

import com.selenium.base.BaseTClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage extends BaseTClass {
    public static WebDriver driver;
    public EmployeePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(name = "username")
    WebElement inUser;

    @FindBy(name = "password")
    WebElement inPass;

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement addUs;

    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    WebElement addClick;

    @FindBy(name = "firstName")
    WebElement instFirstN;

    @FindBy(name = "middleName")
    WebElement instMidleN;

    @FindBy(name = "lastName")
    WebElement instLastN;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement inSave;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement slide;

    @FindBy(xpath = "//div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]//input[@class='oxd-input oxd-input--active']")
    WebElement setUser;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement setPassword1;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement setPassword2;

    @FindBy(xpath = "//h6[.='Personal Details']")
    WebElement verrrrri;

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    WebElement myInfoClick;

    @FindBy(xpath = "//label[normalize-space()='Male']")
    WebElement gendar;

    @FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]//div[@class='oxd-select-text-input']")
    public List<WebElement> mstatus;


    @FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[1]//div[@class='oxd-select-text-input']")
    public List<WebElement> nssional;

    @FindBy(css = "[type=submit]")
    public List<WebElement> submitButtons;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
    WebElement titlemsg;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement toasmsg;



    public void insUsPass(String username, String password){
        inUser.sendKeys(username);
        inPass.sendKeys(password);
    }

    public void btnLogin1(){
        loginBtn.click();
    }

    public void btnSave(){
        inSave.click();
    }

    public void slideUser(){
        slide.click();
    }

    public void addPim(){
        addUs.click();
    }
    public void addPimClick(){
        addClick.click();
    }

    public void addNewEmployee(String fname, String mname, String lname){
        instFirstN.sendKeys(fname);
        instMidleN.sendKeys(mname);
        instLastN.sendKeys(lname);
    }

    public void addNewUserLogin(String username, String password, String password1){
        setUser.sendKeys(username);
        setPassword1.sendKeys(password);
        setPassword2.sendKeys(password1);
    }

    public void verifPage(){
        Assertions.assertEquals(verrrrri.getText(),"Personal Details");
    }

    public void myInfoCheck(){
        myInfoClick.click();
    }

    public void genDer(){
        gendar.click();
    }

    public void maritalStatus(){
        WebElement marsButon = mstatus.get(0);
        marsButon.sendKeys("s");
        marsButon.sendKeys(Keys.ENTER);

    }
    public void selectNationality () {
        WebElement nationalityButton =  nssional.get(0);
        nationalityButton.sendKeys("i");
        nationalityButton.sendKeys(Keys.ARROW_DOWN);
        nationalityButton.sendKeys(Keys.ARROW_DOWN);
        nationalityButton.sendKeys(Keys.ARROW_DOWN);
        nationalityButton.sendKeys(Keys.ENTER);
    }

    public void notifToastMessage(){
//        String titleTxt = titlemsg.getText();
//        System.out.println("Title message = "+titleTxt);
        Assertions.assertEquals(titlemsg.getText(),"Success");

//        String toastTxt = toasmsg.getText();
//        System.out.println("Message of toast = "+toastTxt);
    }







}
