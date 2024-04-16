package automationexercise.tests;

import automationexercise.pages.*;
import automationexercise.tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static automationexercise.helper.EmailGenerator.getRandomEmail;

public class SignUpFlowTest extends BaseTest {

    @Test
    public void verifySignUpInLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        loginPage.openLoginPage();
        loginPage.fillNameInput("Nelly");
        loginPage.fillEmail(getRandomEmail(10,true,false));
        loginPage.clickOnSignUpButton();
        softAssert.assertEquals(signUpPage.getFirstText(),"ENTER ACCOUNT INFORMATION");
        softAssert.assertAll();
    }

    @Test(groups = "loggedInState")
    public void verifyLoginFromLoginPage(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Some text");
        softAssert.assertAll();


    }

    @Test
    public void verifyLoginFromLoginPage1(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Some text");
        softAssert.assertAll();


    }

    @Test
    public void verifyAccountCreation(){
        SoftAssert softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.fillNameInput("Nelly");
        loginPage.fillEmail(getRandomEmail(10,true,false));
        loginPage.clickOnSignUpButton();

        SignUpPage signUpPage = new SignUpPage(driver);
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
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        softAssert.assertEquals(accountCreatedPage.getAccountCreatedText(),"ACCOUNT CREATED!");
        softAssert.assertAll();

    }




}
