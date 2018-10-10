package common;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class BaseAbstractPageObj{

    private static final Logger logger = LogManager.getLogger();
    public static final int TIMEOUT = 10;

    public void get(WebDriver driver, String url){
        logger.info("get: Initialize WebDriver and then landing on the url.");
        if(driver == null )
            logger.error("WebDriver is null!");
        if( url == null || url == " ")
            logger.error("URL is null!");
        else {
            driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
            driver.get(url);
            driver.manage().window().maximize();
            logger.info("Landing on: " + url);
        }
    }
    public void clickElement(WebElement we){
        we.click();
    }
    public void takeScreenshot(WebDriver driver, String testName){
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("C:\\e2eTest\\" + testName + ".png"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
