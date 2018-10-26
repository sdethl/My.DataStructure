package Selenium.administration;

import common.BaseAbstractPageObj;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class AdministrationNavigationPageObj extends BaseAbstractPageObj {

    private static final Logger logger = LogManager.getLogger();
    private WebDriver driver;

    public AdministrationNavigationPageObj(WebDriver driver){
        logger.info("Constructor: Initialized web driver");
        this.driver = driver;
    }

    @FindBy(linkText = "Administration")
    public WebElement administration;

    @FindBy(linkText = "Case Setup")
    public WebElement caseSetup;

    @FindBy(linkText = "Data Ingestion")
    public WebElement dataIngestion;

    @FindBy(linkText = "Users & Roles")
    public WebElement userRoles;

    @FindBy(linkText = "Rules")
    public WebElement rules;

    @FindBy(linkText = "Tasks")
    public WebElement tasks;

    @FindBy(linkText = "Statuatory Caps Setup")
    public WebElement statuatoryCapsSetup;

    public void clickLink(WebElement webElement, String expectedUrl){
        webElement.click();
        logger.info("Navigated to: " + driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
