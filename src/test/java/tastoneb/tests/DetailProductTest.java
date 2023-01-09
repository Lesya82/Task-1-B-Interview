package tastoneb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailProductTest extends BaseTest {
    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART = "(0)";
    private static final String EXPECTED_PRICE_OF_PRODUCTS = "2105.00";

    @Test
    public void chooseOneItemAndVerifyShoppingCartThenDeleteThisItem() {
        getDetailProductPage().chooseSetProcessorFast();
        getDetailProductPage().chooseSetRAM8GB();
        getDetailProductPage().chooseSoftwareImageViewer();
        getDetailProductPage().chooseSoftwareOfficeSuit();
        getDetailProductPage().chooseSoftwareOtherOfficeSuit();
        getDetailProductPage().clickButtonAddToCartDetailSection();
        getDetailProductPage().goToShoppingCart();
        Assert.assertEquals(getDetailProductPage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_IN_CART);
       // Assert.assertEquals(getDetailProductPage().getTextOfAmountProductsInCart(), EXPECTED_PRICE_OF_PRODUCTS);
        getDetailProductPage().goToShoppingCart();
        getDetailProductPage().clickEditShoppingCart();
        getDetailProductPage().clearNumberItem();
        getDetailProductPage().waitForPageLoadingComplete(40);
        getDetailProductPage().clickButtonUpdate();
    }
}
