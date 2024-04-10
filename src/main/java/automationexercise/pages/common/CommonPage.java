package automationexercise.pages.common;

import automationexercise.pages.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage {


    public CommonPage(WebDriver driver) {
        super(driver);
    }
    // change the naming. should be all uppercase
    private final By menuLoginSignupButton = By.cssSelector("a[href='/login']");

}
