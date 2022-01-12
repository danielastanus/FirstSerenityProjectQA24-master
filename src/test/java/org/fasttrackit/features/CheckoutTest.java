package org.fasttrackit.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckout(){
        loginSteps.doLogin("danielaaa.stanus@mailinator.com","123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        checkoutSteps.completeCheckoutFormDropdown();
        checkoutSteps.completeCityAndPostCode("Cluj-Napoca","458693");
        checkoutSteps.clickProceedButton();
    }
}
