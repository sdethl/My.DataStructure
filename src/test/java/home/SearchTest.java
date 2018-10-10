package home;

import common.BaseAbstractTest;
import login.LoginPageObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends BaseAbstractTest {

    private WebDriver myDriver;
    private SearchPageObj searchPage = new SearchPageObj(myDriver);
    private LoginPageObj login = new LoginPageObj(myDriver);
    public SearchTest(){
        this.myDriver = super.getDriver();
    }

    @BeforeClass
    public void setUp(){
        searchPage = PageFactory.initElements(myDriver, SearchPageObj.class);
        login.get(myDriver, "https://qa.s3betaplatform.com/search");
    }

    @Test
    public void searchForTort(){
        WebElement dropdown = searchPage.searchForDropdoown;
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Tort");
        dropdown.getText();
        searchPage.enterID("1");
        searchPage.clickSearch();
    }
}
