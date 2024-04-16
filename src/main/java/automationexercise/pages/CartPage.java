package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends CommonPage {


    public CartPage(WebDriver driver) {
        super(driver);
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
