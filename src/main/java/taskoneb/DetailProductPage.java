package taskoneb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailProductPage extends BasePage {


    @FindBy(xpath = "//input[@id='product_attribute_74_5_26_82']")
    private WebElement setProcessorFast;
    @FindBy(xpath = "//input[@id='product_attribute_74_6_27_85']")
    private WebElement setRAM8GB;
    @FindBy(xpath = "//input[@id='product_attribute_74_8_29_88']")
    private WebElement setSoftwareImageViewer;
    @FindBy(xpath = "//input[@id='product_attribute_74_8_29_89']")
    private WebElement setSoftwareOfficeSuit;
    @FindBy(xpath = "//input[@id='product_attribute_74_8_29_90']")
    private WebElement setSoftwareOtherOfficeSuit;
    @FindBy(xpath = "//input[@id='add-to-cart-button-74']")
    private WebElement buttonAddToCartOnDetailSection;
    @FindBy(xpath = "//a[@href='/cart'][@class='ico-cart'][contains(text(),'Shopping cart')]")
    private WebElement shoppingCart;
    @FindBy(xpath = "//span[@class='cart-qty']")
    private WebElement numberItemInShoppingCart;
    @FindBy(xpath = "//span[@class='product-price order-total']//strong")
    private WebElement priceOfItem;
    @FindBy(xpath = "//a[contains(text(), 'Edit')]")
    private WebElement editShoppingCart;
    @FindBy(xpath = "//input[@id='addtocart_74_EnteredQuantity']")
    private WebElement setNumberItem;
    @FindBy(xpath = "//input[@id='add-to-cart-button-74'][@value='Update']")
    private WebElement buttonUpdate;

    public DetailProductPage(WebDriver driver) {
        super(driver);
    }

    public void chooseSetProcessorFast() {
        setProcessorFast.click();
    }

    public void chooseSetRAM8GB() {
        setRAM8GB.click();
    }

    public void chooseSoftwareImageViewer() {
        setSoftwareImageViewer.click();
    }

    public void chooseSoftwareOfficeSuit() {
        setSoftwareOfficeSuit.click();
    }

    public void chooseSoftwareOtherOfficeSuit() {
        setSoftwareOtherOfficeSuit.click();
    }

    public void clickButtonAddToCartDetailSection() {
        buttonAddToCartOnDetailSection.click();
    }

    public void goToShoppingCart() {
        shoppingCart.click();
    }

    public String getTextOfAmountProductsInCart() {
        return numberItemInShoppingCart.getText();
    }

    public String getPriceOfItem() {
        return priceOfItem.getText();
    }

    public void putNumberItem(String number){
        setNumberItem.sendKeys(number);
    }

    public void clearNumberItem(){
        setNumberItem.clear();
    }

    public void clickEditShoppingCart(){
        editShoppingCart.click();
    }

    public void clickButtonUpdate(){
        buttonUpdate.click();
    }

}

