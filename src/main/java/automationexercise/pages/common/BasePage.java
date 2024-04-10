package automationexercise.pages.common;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class BasePage {
    private final WebDriver driver;
    private final int timeout=10;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    protected void openPage(String url){
        driver.get(url);
    }

    protected void clickOnElement(By locator){
        getExistingElement(locator,timeout).click();
    }

    protected WebElement getExistingElement(By locator, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
       return wait.until(x -> x.findElement(locator));
    }

    protected void getPageTitle(){
        driver.getTitle();
    }

    protected void sendDataToInput(By locator, String data){
        getExistingElement(locator,timeout).sendKeys(data);
    }

     protected void getElementText(By locator){
         getExistingElement(locator,timeout).getText();

     }

    protected void selectFromSelectDropdownByIndex(By locator, int index){
        Select mySelect = new Select(getExistingElement(locator,timeout));
        mySelect.selectByIndex(index);
    }

    protected void selectFromSelectDropdownByValue(By locator, String value){
        Select mySelect = new Select(getExistingElement(locator,timeout));
        mySelect.selectByValue(value);
    }

    protected void selectFromSelectDropdownByVisibleText(By locator, String visibleText){
        Select mySelect = new Select(getExistingElement(locator,timeout));
        mySelect.selectByVisibleText(visibleText);
    }

    protected WebElement getElement (By locator){
       return driver.findElement(locator);
    }


}
