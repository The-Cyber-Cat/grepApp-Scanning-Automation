package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GrepApp {

    public  GrepApp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#downshift-0-input")
    public WebElement grepAppInpt;










}
