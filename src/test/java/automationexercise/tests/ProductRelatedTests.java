package automationexercise.tests;

import automationexercise.pages.CartPage;
import automationexercise.pages.HomePage;
import automationexercise.pages.ProductsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static automationexercise.pages.common.BasePage.*;


public class ProductRelatedTests extends BaseTest {

    @Test
    public void verifyProductAdditionToCard(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        /// Verifying the logo is displayed or not
        softAssert.assertTrue(homePage.isLogoDisplayed(),"The Logo isn't displayed");

        homePage.clickOnMenuProductsButton();


        ProductsPage products = new ProductsPage();
        products.scroll(400);

        products.addDesiredProductToCard(1);
        softAssert.assertTrue(products.isAddedToCardWindowIsOpened(10), "The Added window isn't opened after 10 seconds of waiting for the first product");
        products.clickOnContinueShoppingButton();

        products.addDesiredProductToCard(2);
        softAssert.assertTrue(products.isAddedToCardWindowIsOpened(10), "The Added window isn't opened after 10 seconds of waiting for the second product");

        products.clickOnViewCardButton();

        CartPage cartPage = new CartPage();
        softAssert.assertEquals(cartPage.getItemsQuantity(),2);

        softAssert.assertEquals(cartPage.getExactItemPrice(1),"Rs. 500","The first element price is wrong");
        softAssert.assertEquals(cartPage.getExactItemPrice(2),"Rs. 400", "The second element price is wrong");



        softAssert.assertAll();


    }

}
