package Selenium.home;

import common.BaseAbstractPageObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageObj extends BaseAbstractPageObj {

    private WebDriver driver;
    public SearchPageObj(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(className = "Select-value-label")
    public WebElement searchForDropdoown;

    @FindBy(className = "ura-button ura-button search-toolbar__button ura-button__primary")
    public WebElement searchButton;

    @FindBy(className = "input search-criterion__input")
    public WebElement id;

    public void chooseSearchFor(String type){

    }

    public void enterID(String s){
        id.sendKeys(s);
    }

    public void clickSearch(){
        searchButton.click();
    }

}
