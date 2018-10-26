package Selenium.administration.UserManagement;

import common.BaseAbstractPageObj;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class UsersPageObj extends BaseAbstractPageObj{

    private WebDriver driver;

    public UsersPageObj(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(linkText = "Administration")
    public WebElement Administration;

    @FindBy(linkText = "User Management")
    public WebElement UserManagement;

    public void clickUserManagement(){
        Administration.click();
        UserManagement.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public int countOfRow(){
        List<WebElement> rows = driver.findElements(By.className("ura-table__row"));
        return rows.size();
    }
    public void testRows(){
        List<WebElement> rows = driver.findElements(By.className("ura-table__row"));
        for(int i=0; i<rows.size(); i++){
            WebElement theRow = rows.get(i);
            System.out.println("Printing theRow: " + theRow.getText());
            List<WebElement> insideRows = theRow.findElements(By.className("ura-table__column"));
            WebElement e = insideRows.get(2);
            e.click();
            //System.out.println("printing e: " + e.getText());
            //e.findElement(By.cssSelector("div[class='fa fa-ellipsis-v']")).click();
        }
    }

}
