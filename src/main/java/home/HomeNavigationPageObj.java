package home;

import common.BaseAbstractPageObj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class HomeNavigationPageObj extends BaseAbstractPageObj {

    private static final Logger logger = LogManager.getLogger();
    private WebDriver driver;
    public HomeNavigationPageObj(WebDriver driver){
        logger.info("Constructor: initialized the web driver.");
        this.driver = driver;
    }
    @FindBy(linkText = "Home")
    public WebElement home;

    @FindBy(linkText = "My Tasks")
    public WebElement myTasks;

    @FindBy(linkText = "Company Progress")
    public WebElement companyProgress;

    @FindBy(linkText = "Task Dashboard")
    public WebElement taskDashboard;

    @FindBy(linkText = "Workflow Monitoring")
    public WebElement workflowMonitoring;

    @FindBy(linkText = "Inbox")
    public WebElement inbox;

    @FindBy(linkText = "Listing")
    public WebElement listing;

    public void clickLink(WebElement webElement, String expectedUrl){
        webElement.click();
        logger.info("Navigated to: " + driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
