package automationexercise.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class CommonPage<T extends LoadableComponent<T>> extends BasePage<T> {


    public CommonPage(WebDriver driver) {
        super(driver);
    }

    private final By MENU_LOGIN_SIGNUP_BUTTON = By.cssSelector("a[href='/login']");
    private final By MENU_PRODUCTS_BUTTON = By.cssSelector("a[href='/products']");

    public void clickOnMenuLoginSignupButton() {
        clickOnElement(MENU_LOGIN_SIGNUP_BUTTON);
    }

    public void clickOnMenuProductsButton() {
       clickOnElement(MENU_PRODUCTS_BUTTON);
    }



}
