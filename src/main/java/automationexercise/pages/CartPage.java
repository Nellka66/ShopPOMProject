package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import static automationexercise.setup.SeleniumWebDriver.getWebDriver;

public class CartPage extends CommonPage<CartPage> {


    public CartPage() {
        super(getWebDriver());
    }

    @Override
    public CartPage init() {
        load();
        return get();
    }
    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }

    private final By TABLE_ITEMS = By.cssSelector("tbody>tr");
    private final By ITEMS_QUANTITY = By.cssSelector(".cart_quantity>button");
    private final By ITEMS_PRICES = By.cssSelector(".cart_price>p");

    public int getItemsQuantity(){
        return getExistingElements(ITEMS_QUANTITY,10).size();

    }

    public String getExactItemPrice(int index){
        return getElementFromList(ITEMS_PRICES,index - 1).getText();

    }

    public void openCartPage(){
        openPage("https://automationexercise.com/view_cart");

    }
}
