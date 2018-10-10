package administration;

import common.BaseAbstractTest;
import common.testData.UserConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdministrationNavigationTest extends BaseAbstractTest {

    private static final Logger logger = LogManager.getLogger(AdministrationNavigationTest.class);
    private WebDriver myDriver;
    private AdministrationNavigationPageObj administrationNavigationPage = null;

    public AdministrationNavigationTest(){
        logger.info("Constructor");
        myDriver = super.getDriver();
    }

    @BeforeClass
    public void setUp(){
        logger.info("===BeforeClass: set up myDriver");
        administrationNavigationPage = PageFactory.initElements(myDriver, AdministrationNavigationPageObj.class);
    }
    @AfterClass
    public void tearDown(){
        logger.info("===AfterClass: Clean up test");
        logout(myDriver);
        myDriver.close();
    }
    @BeforeMethod
    public void getIn(){
        logger.info("===Before Method: login the platform");
        signIn(myDriver, getUrl_login(), UserConstants.USER_ADMIN, UserConstants.PWD);
    }

    @Test(description = "Should navigate through each sub-tab of the Administration tab.")
    public void shouldNavigateSubtabs(){
        logger.info("Test case: shouldNavigateSubtabs");
        administrationNavigationPage.clickLink(administrationNavigationPage.userRoles, getUrl_userRoles());
        administrationNavigationPage.clickLink(administrationNavigationPage.tasks, getUrl_tasks());

    }
}
