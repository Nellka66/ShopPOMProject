package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;

import static automationexercise.setup.SeleniumWebDriver.getWebDriver;

public class AccountCreatedPage extends CommonPage<AccountCreatedPage> {

    private final By ACCOUNT_CREATED_TITLE = By.cssSelector("[data-qa=account-created]");
    private final By CONTINUE_BUTTON = By.cssSelector("[data-qa=continue-button]");

    public AccountCreatedPage() {
        super(getWebDriver());
    }

    @Override
    public AccountCreatedPage init() {
        load();
        return super.init();
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        waitForTitle("Automation Exercise - Account Created", 10);
    }

    public String getAccountCreatedText() {
        return getElementText(ACCOUNT_CREATED_TITLE);
    }


}
