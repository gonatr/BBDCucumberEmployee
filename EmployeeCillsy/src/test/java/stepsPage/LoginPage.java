package stepsPage;

import com.selenium.base.BaseTClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTClass {
    public static WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "password")
    WebElement inPass;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(name = "username")
    WebElement inUser;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement verrrrri;


    @FindBy(xpath = "//form[@class='oxd-form']/div[1]//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement requir1;

    @FindBy(xpath = "//form[@class='oxd-form']/div[2]//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement requir2;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement invLog;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement menuName;

    @FindBy(xpath = "//a[.='Logout']")
    WebElement btnLogout;

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement homelogin;

    public void insUsPass(String username, String password){
        inUser.sendKeys(username);
        inPass.sendKeys(password);
    }

    public void btnLogin1(){
        loginBtn.click();
    }

    public void verifPage(){
        String result = verrrrri.getText();
        Assertions.assertEquals(verrrrri.getText(),result);
    }

    public void inVal(){
        String testInval = invLog.getText();
        System.out.println("ini invalid = "+testInval);
    }

    public void tehes(){
        if (inUser.equals("")) {
            if (inPass.equals("")){
                Assertions.assertEquals(requir1.getText(),"Required");
                Assertions.assertEquals(requir2.getText(),"Required");
            }
        } else if (inUser!=null){
            if (inPass.equals("")){
                Assertions.assertEquals(requir2.getText(),"Required");
            }
        } else if(inUser.equals("")){
            if (inPass!=null){
                Assertions.assertEquals(requir1.getText(),"Required");
            }
        } else if (inUser!=null){
            if (inPass!=null){
                Assertions.assertEquals(invLog.getText(),"Invalid credentials");
            }
        }

    }

    public void menuNamebtn(){
        menuName.click();
    }
    public void btnLogout1(){
        btnLogout.click();
    }

    public void pageVerifHomeLogin(){
        String result = homelogin.getText();
        Assertions.assertEquals(homelogin.getText(),result);
    }




}
