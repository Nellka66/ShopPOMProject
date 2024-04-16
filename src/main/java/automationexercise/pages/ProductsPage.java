package automationexercise.pages;

import automationexercise.pages.common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends CommonPage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By PRODUCTS_LIST = By.cssSelector(".single-products");
    private final By ADD_TO_CARD_OVERLAY = By.cssSelector(".overlay-content a[class*='add-to-cart']");

    private final By ADDED_WINDOW = By.cssSelector("#cartModal");

    private final By CONTINUE_SHOPPING_BUTTON = By.cssSelector("[data-dismiss=modal]");

    private final By VIEW_CARD_BUTTON = By.cssSelector("p>a[href='/view_cart']");


    public void addDesiredProductToCard(int index){
        hoverOnElement(getElementFromList(PRODUCTS_LIST,index-1));
        clickOnClickableElement(getElementFromList(ADD_TO_CARD_OVERLAY,index-1),10);
    }

    public boolean isAddedToCardWindowIsOpened(int duration){
        return isElementDisplayed(ADDED_WINDOW,duration);
    }

    public void clickOnContinueShoppingButton(){
        waitForElementBecomeClickable(CONTINUE_SHOPPING_BUTTON,5);
        clickOnElement(CONTINUE_SHOPPING_BUTTON);
    }

    public void clickOnViewCardButton(){
        waitForElementBecomeClickable(VIEW_CARD_BUTTON,10);
        clickOnElement(VIEW_CARD_BUTTON);
    }



}
