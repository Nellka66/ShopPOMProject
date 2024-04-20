package automationexercise.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {
    protected static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        return threadLocal.get();
    }

    public static void setWebDriver(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            threadLocal.set(new ChromeDriver(options));
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            threadLocal.set(new EdgeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadLocal.set(new FirefoxDriver());
        } else {
            System.out.println("you entered invalid browser");
        }
    }
}
