package automationexercise.tests;

import automationexercise.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static automationexercise.objects.UserMockData.getTestUser;

public class BaseTest {
    WebDriver driver;
    @Parameters({"browser"})
    @BeforeMethod
    public void openBrowser(@Optional("chrome") String browser){

        WebDriverManager.chromedriver().setup();
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }else if (browser.equals("edge")){
            driver = new EdgeDriver();
        }

      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

 //   @Parameters({"email", "password"})
    @BeforeMethod(onlyForGroups = "loggedInState",dependsOnMethods = "openBrowser")
    public void loggedInStateSetUp(){
        LoginPage loginPage = new LoginPage(driver);
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
