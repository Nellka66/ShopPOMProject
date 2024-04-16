package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By LOGO = By.cssSelector(".logo>a>img");


    public boolean isLogoDisplayed(){
        return isElementDisplayed(LOGO,10);
    }

    public void openHomePage(){
        openPage("https://automationexercise.com/");
    }

}
