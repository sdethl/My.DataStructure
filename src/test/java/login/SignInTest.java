package login;

import common.BaseAbstractTest;
import common.testData.UserConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class SignInTest extends BaseAbstractTest{

    private WebDriver myDriver;
    private LoginPageObj loginPage = new LoginPageObj(myDriver);

    public SignInTest(){
        myDriver = super.getDriver();
    }

    @BeforeClass
    public void setUp(){
        loginPage = PageFactory.initElements(myDriver, LoginPageObj.class);
    }

    @AfterClass
    public void tearDown(){
        loginPage.clickLogout();
        myDriver.close();
    }

    @BeforeMethod
    public void getUrl(){
       loginPage.get(myDriver, "https://qa.s3betaplatform.com/search");
    }

    @Test
    public void shouldSignInWCredential(){
        loginPage.enterUsername(UserConstants.USER_ADMIN);
        loginPage.enterPassword( UserConstants.PWD );
        loginPage.clickSignIn();
    }

}
