package automationexercise;

import automationexercise.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import automationexercise.pages.SignUpPage;

public class SignUpFlowTest extends BaseTest{

    @Test
    public void verifySignUpInLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        loginPage.openLoginPage();
        loginPage.fillNameInput("Nelly");
        loginPage.fillEmail("nelly.petrosyan990@gmail.com"+ Math.random());
        loginPage.clickOnSignUpButton();
        softAssert.assertEquals(signUpPage.getFirstText(),"ENTER ACCOUNT INFORMATION");
        softAssert.assertAll();
    }

    @Test
    public void verifyLoginFromLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.fillLoginEmailInput("nelly.petrosyan990@gmail.com");
        loginPage.fillLoginPasswordInput("123456");
        loginPage.clickOnLoginButton();
        softAssert.assertAll();


    }

    @Test
    public void verifyAccountCreation(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        loginPage.openLoginPage();
        loginPage.fillNameInput("Nelly");
        loginPage.fillEmail("nelly.petrosyan990@gmail.com"+ Math.random());
        loginPage.clickOnSignUpButton();

        signUpPage.selectMRRadioButton();
        signUpPage.selectMRSRadioButton();
        signUpPage.fillInPasswordInput("123456");
        signUpPage.selectFromDayDropdown();
        signUpPage.selectFromMonthDropdown();
        signUpPage.selectFromYearDropdown();
        signUpPage.checkNewsletterCheckbox();
        signUpPage.checkSpecialOffersCheckbox();
        signUpPage.fillFirstNameInput("Nelly");
        signUpPage.fillLastNameInput("Petrosyan");
        signUpPage.fillCompanyInput("Company");
        signUpPage.fillFirstAddressInput("Address1");
        signUpPage.fillSecondAddressInput("Address2");
        signUpPage.selectFromCountryDropdown();
        signUpPage.fillStateInput("State");
        signUpPage.fillCityInput("City");
        signUpPage.fillZipCodeInput("12345");
        signUpPage.fillMobileInput("094818502");
        signUpPage.clickOnCreateAccountButton();
        softAssert.assertEquals(driver.findElement(By.cssSelector("h2>b")).getText(),"ACCOUNT CREATED!");
        softAssert.assertAll();

    }

}
