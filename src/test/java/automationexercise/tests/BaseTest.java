package automationexercise.tests;

import automationexercise.pages.LoginPage;
import automationexercise.setup.SeleniumWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static automationexercise.objects.UserMockData.getTestUser;

public class BaseTest {
    @Parameters({"browser"})
    @BeforeMethod
    public void openBrowser(@Optional("chrome") String browser) {
        SeleniumWebDriver.setWebDriver(browser);
    }

    //   @Parameters({"email", "password"})
    @BeforeMethod(onlyForGroups = "loggedInState", dependsOnMethods = "openBrowser")
    public void loggedInStateSetUp() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.fillLoginEmailInput(getTestUser().getEmail());
        loginPage.fillLoginPasswordInput(getTestUser().getPassword());
        loginPage.clickOnLoginButton();
    }

//    @AfterTest
//    public void closeBrowser(){
//        driver.quit();
//    }

}
