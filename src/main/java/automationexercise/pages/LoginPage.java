package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonPage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

   /// Login form elements
    private final By logInButton = By.cssSelector("button[data-qa='login-button']");
    private final By loginFormEmailInput = By.cssSelector("input[data-qa='login-email']");
    private final By loginFormPasswordInput = By.cssSelector("input[data-qa='login-password']");
    private final By loginFormUpperText = By.cssSelector(".login-form>h2");

    private final By orText = By.cssSelector(".col-sm-1>h2");


    ///Sign Up form elements

    private final By signUpFormUpperText = By.cssSelector(".signup-form>h2");
    private final By signUpName = By.cssSelector("input[data-qa='signup-name']");
    private final By signUpEmail = By.cssSelector("input[data-qa='signup-email']");
    private final By signUpButton = By.cssSelector("button[data-qa='signup-button']");


    // Sign up form methods
    public void fillNameInput(String name){
        sendDataToInput(signUpName,name);
    }

    public void fillEmail(String email){
        sendDataToInput(signUpEmail,email);
    }

    public void clickOnSignUpButton(){
        clickOnElement(signUpButton);
    }

    public void openLoginPage(){
        openPage("https://automationexercise.com/login");
    }



    /// Login form methods

    public void fillLoginEmailInput(String email){
        sendDataToInput(loginFormEmailInput,email);

    }

    public void fillLoginPasswordInput(String password){
        sendDataToInput(loginFormPasswordInput,password);

    }

    public void clickOnLoginButton(){
        clickOnElement(logInButton);

    }

}
