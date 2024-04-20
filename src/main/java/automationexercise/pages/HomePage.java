package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static automationexercise.setup.ConfigurationManager.URL;
import static automationexercise.setup.SeleniumWebDriver.getWebDriver;

public class HomePage extends CommonPage<HomePage> {

    public HomePage() {
        super(getWebDriver());
    }

    @Override
    public HomePage init() {
        return get();
    }

    private final By LOGO = By.cssSelector(".logo>a>img");


    public boolean isLogoDisplayed(){
        return isElementDisplayed(LOGO,10);
    }

    public void openHomePage(){
        openPage(URL);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
