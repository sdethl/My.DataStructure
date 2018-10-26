package common;

import Selenium.login.LoginPageObj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseAbstractTest extends SystemConfiguration{

    private static final Logger logger = LogManager.getLogger();

    public BaseAbstractTest(){
       logger.info("Constructor: Initialized for test cases.");
    }

    public WebDriver getDriver(){
        logger.info("getDriver: generating webDriver for tests.");
        System.setProperty(browserDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getDriver(String browserName){
        WebDriver driver = null;
        switch (browserName){
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "iexplore":
                driver = new InternetExplorerDriver();
                break;
            default :
                driver = new ChromeDriver();
        }
        return driver;
    }

    public void signIn(WebDriver myDriver, String url, String username, String password){
        logger.info("signIn: Selenium.login to the site.");
        if( myDriver == null ){
            logger.error("Error - myDriver is empty!");
        }else if(url == null || username == null || password == null){
            logger.error("Error - url or username or password is empty!");
        }else{
            LoginPageObj loginPage = PageFactory.initElements(myDriver, LoginPageObj.class);
            loginPage.get(myDriver, url);
            loginPage.enterUsername(username);
            loginPage.enterPassword(password);
            loginPage.clickSignIn();
            //assertEquals(myDriver.getTitle(), TitleConstants.TITILE_HOMEPAGE);
        }
    }

    public void logout(WebDriver myDriver){
        logger.info("logout: logout of the site.");
        LoginPageObj loginPage = PageFactory.initElements(myDriver, LoginPageObj.class);
        loginPage.clickLogout();
    }
}
