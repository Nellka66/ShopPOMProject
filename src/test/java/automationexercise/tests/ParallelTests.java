package automationexercise.tests;

import automationexercise.pages.LoginPage;
import automationexercise.pages.SignUpPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static automationexercise.helper.EmailGenerator.getRandomEmail;
import static automationexercise.setup.ConfigurationManager.PASSWORD;
import static automationexercise.setup.ConfigurationManager.USERNAME;

public class ParallelTests extends BaseTest{
    @Test
    public void verifySignIn1(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.fillLoginEmailInput(USERNAME);
        loginPage.fillLoginPasswordInput(PASSWORD);
        loginPage.clickOnLoginButton();
        softAssert.assertAll();
    }

    @Test
    public void verifySignIn2(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage();
        SignUpPage signUpPage = new SignUpPage();
        loginPage.openLoginPage();
        loginPage.fillNameInput(USERNAME);
        loginPage.fillEmail(getRandomEmail(10,true,false));
        loginPage.clickOnSignUpButton();
        softAssert.assertEquals(signUpPage.getFirstText(),"ENTER ACCOUNT INFORMATION");
        softAssert.assertAll();
    }

    @Test
    public void verifySignIn3(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage();
        SignUpPage signUpPage = new SignUpPage();
        loginPage.openLoginPage();
        loginPage.fillNameInput(USERNAME);
        loginPage.fillEmail(getRandomEmail(10,true,false));
        loginPage.clickOnSignUpButton();
        softAssert.assertEquals(signUpPage.getFirstText(),"ENTER ACCOUNT INFORMATION");
        softAssert.assertAll();
    }
}
