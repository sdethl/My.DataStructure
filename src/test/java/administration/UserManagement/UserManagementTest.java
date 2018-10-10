package administration.UserManagement;

import common.BaseAbstractTest;
import common.URLConstants;
import common.testData.UserConstants;
import login.LoginPageObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserManagementTest extends BaseAbstractTest{
    private WebDriver myDriver;
    private LoginPageObj loginPage = null;
    private UsersPageObj usersPage = null;

    public UserManagementTest(){ myDriver = super.getDriver(); }

    @BeforeClass
    public void setUp(){
        usersPage = PageFactory.initElements(myDriver,UsersPageObj.class);
    }

    @AfterClass
    public void tearDown(){
        //loginPage.clickLogout();
        myDriver.close();
    }
    @BeforeMethod
    public void getUrl(){

    }

    //@Test
    public void shouldListManyUsers(){
        signIn(myDriver, getUrl_login(), UserConstants.USER_ADMIN, UserConstants.PWD);
        usersPage.clickUserManagement();
        assertEquals(usersPage.countOfRow(),6);
    }

    @Test
    public void justATest(){
        signIn(myDriver, getUrl_login(), UserConstants.USER_ADMIN, UserConstants.PWD);
        usersPage.clickUserManagement();
        usersPage.testRows();
    }
}
