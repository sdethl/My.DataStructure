package home;

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

public class HomeNavigationTest extends BaseAbstractTest {

    private WebDriver myDriver;
    private HomeNavigationPageObj homeNavigationPage = null;
    private static final Logger logger = LogManager.getLogger();
    public HomeNavigationTest(){
        myDriver = super.getDriver();
    }

    @BeforeClass
    public void setUp(){
        logger.info("===BeforeClass: setUp web driver");
        homeNavigationPage = PageFactory.initElements(myDriver, HomeNavigationPageObj.class);
    }
//    @AfterClass
//    public void tearDown(){
//        logger.info("===AfterClass: close out the web driver");
//        logout(myDriver);
//        myDriver.close();
//    }
//    @BeforeMethod
//    public void getIn(){
//        logger.info("===BeforeMethod: Login to site.");
//        signIn(myDriver, baseUrl, UserConstants.USER_ADMIN, UserConstants.PWD);
//    }

    @Test
    public void shouldNavigateSubtabs() {

    }
}
