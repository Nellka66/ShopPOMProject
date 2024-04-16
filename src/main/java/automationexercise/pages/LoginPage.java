package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static automationexercise.setup.ConfigurationManager.URL;

public class LoginPage extends CommonPage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

   /// Login form elements
    private final By LOGIN_BUTTON = By.cssSelector("button[data-qa='login-button']");
    private final By LOGIN_FORM_EMAIL_INPUT = By.cssSelector("input[data-qa='login-email']");
    private final By LOGIN_FORM_PASSWORD_INPUT = By.cssSelector("input[data-qa='login-password']");
    private final By LOGIN_FORM_UPPER_TEXT = By.cssSelector(".login-form>h2");

    private final By OR_TEXT = By.cssSelector(".col-sm-1>h2");


    ///Sign Up form elements

    private final By SIGN_UP_FORM_UPPER_TEXT = By.cssSelector(".signup-form>h2");
    private final By SIGN_UP_NAME = By.cssSelector("input[data-qa='signup-name']");
    private final By SIGN_UP_EMAIL = By.cssSelector("input[data-qa='signup-email']");
    private final By SIGN_UP_BUTTON = By.cssSelector("button[data-qa='signup-button']");


    // Sign up form methods
    public void fillNameInput(String name){
        sendDataToInput(SIGN_UP_NAME,name);
    }

    public void fillEmail(String email){
        sendDataToInput(SIGN_UP_EMAIL,email);
    }

    public void clickOnSignUpButton(){
        clickOnElement(SIGN_UP_BUTTON);
    }

    public void openLoginPage(){
        openPage(URL + "login");
    }



    /// Login form methods

    public void fillLoginEmailInput(String email){
        sendDataToInput(LOGIN_FORM_EMAIL_INPUT,email);

    }

    public void fillLoginPasswordInput(String password){
        sendDataToInput(LOGIN_FORM_PASSWORD_INPUT,password);

    }

    public void clickOnLoginButton(){
        clickOnElement(LOGIN_BUTTON);

    }

}
