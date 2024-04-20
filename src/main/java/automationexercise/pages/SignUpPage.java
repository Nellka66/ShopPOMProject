package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static automationexercise.setup.SeleniumWebDriver.getWebDriver;

public class SignUpPage extends CommonPage<SignUpPage> {
    // Account information section
    private final By THE_FIRST_TEXT = By.xpath("(//h2[@class='title text-center']/b)[1]");
    private final By GENDER_MR = By.cssSelector("label[for=id_gender1]");
    private final By GENDER_MRS = By.cssSelector("label[for=id_gender2]");
    private final By NAME = By.cssSelector("input[data-qa=name]");
    private final By EMAIL = By.cssSelector("input[data-qa=email]");
    private final By PASSWORD = By.id("password");
    private final By DAY = By.cssSelector("#days");
    private final By MONTH = By.cssSelector("#months");
    private final By YEAR = By.cssSelector("#years");
    private final By NEWSLETTER_CHECKBOX = By.cssSelector("label[for=newsletter]");
    private final By SPECIAL_OFFERS_CHECKBOX = By.cssSelector("label[for=optin]");
    // Address Information section
    private final By ADDRESS_INFORMATION_TEXT = By.cssSelector("(//h2[@class='title text-center']/b)[2]");
    private final By FIRST_NAME = By.id("first_name");
    private final By LAST_NAME = By.id("last_name");
    private final By COMPANY = By.id("company");
    private final By ADDRESS_1 = By.id("address1");
    private final By ADDRESS_2 = By.id("address2");
    private final By COUNTRY_DROPDOWN = By.id("country");
    private final By STATE = By.id("state");
    private final By CITY = By.id("city");
    private final By ZIP_CODE = By.id("zipcode");
    private final By PHONE_NUMBER = By.id("mobile_number");
    private final By CREATE_ACCOUNT_BUTTON = By.cssSelector("button[data-qa='create-account']");


    public SignUpPage() {
        super(getWebDriver());
    }

    @Override
    public SignUpPage init() {
        return get();
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
        waitForElementBecomeClickable(CREATE_ACCOUNT_BUTTON, 10);
    }

    public void selectMRRadioButton() {
        clickOnElement(GENDER_MR);

    }

    public void selectMRSRadioButton() {
        clickOnElement(GENDER_MRS);

    }

    public void fillInPasswordInput(String myPassword) {
        sendDataToInput(PASSWORD, myPassword);

    }

    public void selectFromDayDropdown() {
        selectFromSelectDropdownByIndex(DAY, 14);

    }

    public void selectFromMonthDropdown() {
        selectFromSelectDropdownByIndex(MONTH, 5);

    }

    public void selectFromYearDropdown() {
        selectFromSelectDropdownByIndex(YEAR, 10);

    }

    public void checkNewsletterCheckbox() {
        clickOnElement(NEWSLETTER_CHECKBOX);

    }

    public void checkSpecialOffersCheckbox() {
        clickOnElement(SPECIAL_OFFERS_CHECKBOX);

    }

    public void fillFirstNameInput(String name) {
        sendDataToInput(FIRST_NAME, name);

    }

    public void fillLastNameInput(String myLastName) {
        sendDataToInput(LAST_NAME, myLastName);

    }


    public void fillCompanyInput(String myCompany) {
        sendDataToInput(COMPANY, myCompany);

    }

    public void fillFirstAddressInput(String myAddress) {
        sendDataToInput(ADDRESS_1, myAddress);

    }

    public void fillSecondAddressInput(String myAddress) {
        sendDataToInput(ADDRESS_2, myAddress);

    }

    public void selectFromCountryDropdown() {
        selectFromSelectDropdownByIndex(COUNTRY_DROPDOWN, 4);

    }

    public void fillStateInput(String myState) {
        sendDataToInput(STATE, myState);

    }

    public void fillCityInput(String myCity) {
        sendDataToInput(CITY, myCity);

    }

    public void fillZipCodeInput(String myZip) {
        sendDataToInput(ZIP_CODE, myZip);

    }

    public void fillMobileInput(String myPhone) {
        sendDataToInput(PHONE_NUMBER, myPhone);

    }

    public void clickOnCreateAccountButton() {
        clickOnElement(CREATE_ACCOUNT_BUTTON);

    }

    public String getFirstText() {
        return getExistingElement(THE_FIRST_TEXT, 10).getText();

    }


}
