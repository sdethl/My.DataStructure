package login;

import common.BaseAbstractPageObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObj extends BaseAbstractPageObj{

    private WebDriver driver;
    public LoginPageObj(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(name = "email")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signin;

    @FindBy(xpath = "//a[@title='Logout']")
    public WebElement logout;

    public void enterUsername(String input){
        username.clear();
        username.sendKeys(input);
        driver.manage().window().maximize();
    }

    public void enterPassword(String input){
        password.clear();
        password.sendKeys(input);
    }

    //@Override
    public void clickElement(WebElement we){
        we.click();
    }
    public void clickSignIn(){
        signin.click();
        System.out.print("\nAfter Login Page Title: " + driver.getTitle());
    }
    public void clickLogout(){
        logout.click();
        System.out.println(driver.getTitle());
    }
}
