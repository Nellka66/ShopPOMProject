package automationexercise.pages;

import automationexercise.pages.common.BasePage;
import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends CommonPage {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    // Account information section
    private final By theFirstText = By.xpath("(//h2[@class='title text-center']/b)[1]");

    private final By genderMR = By.cssSelector("label[for=id_gender1]");
    private final By genderMRS = By.cssSelector("label[for=id_gender2]");
    private final By name = By.cssSelector("input[data-qa=name]");
    private final By email = By.cssSelector("input[data-qa=email]");
    private final By password = By.id("password");
    private final By day = By.cssSelector("#days");
    private final By month = By.cssSelector("#months");
    private final By year = By.cssSelector("#years");
    private final By newsletterCheckbox = By.cssSelector("label[for=newsletter]");
    private final By specialOffersCheckbox = By.cssSelector("label[for=optin]");


    // Address Information section
    private final By addressInformationText = By.cssSelector("(//h2[@class='title text-center']/b)[2]");

    private final By firstName = By.id("first_name");
    private final By lastName = By.id("last_name");
    private final By company = By.id("company");
    private final By address1 = By.id("address1");
    private final By address2 = By.id("address2");
    private final By countryDropdown = By.id("country");
    private final By state = By.id("state");
    private final By city = By.id("city");
    private final By zipCode = By.id("zipcode");
    private final By phoneNumber = By.id("mobile_number");
    private final By createAccountButton = By.cssSelector("button[data-qa='create-account']");


    public void selectMRRadioButton(){
        clickOnElement(genderMR);

    }

    public void selectMRSRadioButton(){
        clickOnElement(genderMRS);

    }

    public void fillInPasswordInput(String myPassword){
        sendDataToInput(password,myPassword);

    }

    public void selectFromDayDropdown(){
        selectFromSelectDropdownByIndex(day, 14);

    }

    public void selectFromMonthDropdown(){
        selectFromSelectDropdownByIndex(month, 5);

    }

    public void selectFromYearDropdown(){
        selectFromSelectDropdownByIndex(year, 10);

    }

    public void checkNewsletterCheckbox(){
        clickOnElement(newsletterCheckbox);

    }

    public void checkSpecialOffersCheckbox(){
        clickOnElement(specialOffersCheckbox);

    }

    public void fillFirstNameInput(String name){
        sendDataToInput(firstName,name);

    }

    public void fillLastNameInput(String myLastName){
        sendDataToInput(lastName,myLastName);

    }


    public void fillCompanyInput(String myCompany){
        sendDataToInput(company,myCompany);

    }

    public void fillFirstAddressInput(String myAddress){
        sendDataToInput(address1,myAddress);

    }

    public void fillSecondAddressInput(String myAddress){
        sendDataToInput(address2,myAddress);

    }

    public void selectFromCountryDropdown(){
        selectFromSelectDropdownByIndex(countryDropdown,4);

    }

    public void fillStateInput(String myState){
        sendDataToInput(state,myState);

    }

    public void fillCityInput(String myCity){
        sendDataToInput(city,myCity);

    }

    public void fillZipCodeInput(String myZip){
        sendDataToInput(zipCode,myZip);

    }

    public void fillMobileInput(String myPhone){
        sendDataToInput(phoneNumber,myPhone);

    }

    public void clickOnCreateAccountButton(){
        clickOnElement(createAccountButton);

    }

    public String getFirstText(){
       return getExistingElement(theFirstText,10).getText();

    }

    
}
