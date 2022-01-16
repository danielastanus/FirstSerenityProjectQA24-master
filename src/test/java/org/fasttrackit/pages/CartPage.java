package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

        @FindBy(id = "country")
        private WebElementFacade countryList;

        @FindBy (css = "#region_id")
        private WebElementFacade regionList;

        @FindBy (id = "city")
        private WebElementFacade cityField;

        @FindBy (id = "postcode")
        private WebElementFacade postCodeField;

        @FindBy (css = ".bottom button")
        private WebElementFacade proceedCheckoutButton;

    @FindBy(css = ".product-cart-total .price")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(1) .price")
    private WebElementFacade subtotalText;

    @FindBy(css = "#shopping-cart-totals-table tbody tr:nth-child(2) .price")
    private WebElementFacade shippingFeeText;

    @FindBy(css = "#shopping-cart-totals-table tfoot .price")
    private WebElementFacade grandTotal;

    @FindBy(css = "#empty_cart_button")
    private WebElementFacade emptyCartButton;

    @FindBy(css = ".page-title")
    private WebElementFacade emptyCartButtonText;

    @FindBy(css = ".empty")
    private WebElementFacade cartIsEmpty;


        public void selectCountry (){
            clickOn(countryList);
            countryList.selectByValue("RO");

        }

        public void selectRegion (){
            clickOn(regionList);
            regionList.selectByValue("291");
        }

        public void setCityField (String cityName){
            typeInto(cityField, cityName);
        }

        public void setPostCodeField (String postCode){
            typeInto(postCodeField, postCode);
        }

        public void clickProceedCheckoutButton(){
            clickOn(proceedCheckoutButton);
        }

    public int getSubtotalPricesCalculated() {
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotal.getText());
    }

    public void clickOnEmptyCartButton(){
            emptyCartButton.click();
    }

    public void setEmptyCartButtonText(String emptyCartButton){
            emptyCartButtonText.shouldContainOnlyText(":SHOPPING CART IS EMPTY");
    }

    public void emptyCartMessage(){
            cartIsEmpty.shouldContainOnlyText("You have no items in your shopping cart.");
    }

}
