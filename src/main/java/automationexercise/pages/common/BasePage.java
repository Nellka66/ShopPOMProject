package automationexercise.pages.common;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

public class BasePage {
    private final WebDriver driver;
    private final int timeout = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void openPage(String url) {
        driver.get(url);
    }

    protected void clickOnElement(By locator) {
        getExistingElement(locator, timeout).click();
    }

    protected void clickOnElement(WebElement element) {
        element.click();
    }

    protected void clickOnClickableElement(WebElement element, int duration){
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected WebElement getExistingElement(By locator, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        return wait.until(x -> x.findElement(locator));
    }

    protected void getPageTitle() {
        driver.getTitle();
    }

    protected void sendDataToInput(By locator, String data) {
        getExistingElement(locator, timeout).sendKeys(data);
    }

    protected String getElementText(By locator) {
        return getExistingElement(locator, timeout).getText();

    }

    protected void selectFromSelectDropdownByIndex(By locator, int index) {
        Select mySelect = new Select(getExistingElement(locator, timeout));
        mySelect.selectByIndex(index);
    }

    protected void selectFromSelectDropdownByValue(By locator, String value) {
        Select mySelect = new Select(getExistingElement(locator, timeout));
        mySelect.selectByValue(value);
    }

    protected void selectFromSelectDropdownByVisibleText(By locator, String visibleText) {
        Select mySelect = new Select(getExistingElement(locator, timeout));
        mySelect.selectByVisibleText(visibleText);
    }

    protected WebElement getElement(By locator) {
        return driver.findElement(locator);
    }


    protected boolean isElementDisplayed(By locator, int duration) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }


    protected List<WebElement> getExistingElements(By locator, int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        return wait.until(x -> x.findElements(locator));
    }

    protected WebElement getElementFromList(By locator, int index) {
        return getExistingElements(locator, 10).get(index);

    }

    protected void hoverOnElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

    }

    protected void hoverAndClickOnElement(By locator1, By locator2) {
        Actions action = new Actions(driver);
        action.moveToElement(getExistingElement(locator1, 10)).click(getExistingElement(locator2, 10)).perform();
    }

    public void scroll(int pixel) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(String.format("window.scrollBy(0,%s)", pixel));
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    protected void waitForElementBecomeClickable(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
