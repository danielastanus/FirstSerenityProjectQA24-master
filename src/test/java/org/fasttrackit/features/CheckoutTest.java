package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckout(){
        loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
        checkoutSteps.completeCheckoutFormDropdown();
        checkoutSteps.completeCityAndPostCode("Cluj-Napoca","458693");
        checkoutSteps.clickProceedButton();
        checkoutSteps.completeBillingInformation("Fast", "street Liberty", "Cluj-Napoca", "55494", "0475963");
        checkoutSteps.selectFromDropdown();
        checkoutSteps.clickContinueBilling();

    }
}
