package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void completeCheckoutFormDropdown(){
        cartPage.selectCountry();
        cartPage.selectRegion();

    }
    @Step
    public void completeCityAndPostCode(String cityName, String postcode){
        cartPage.setCityField(cityName);
        cartPage.setPostCodeField(postcode);
    }
    @Step
    public void clickProceedButton(){
        cartPage.clickProceedCheckoutButton();
    }
    @Step
    public void completeBillingInformation(String companyName, String address, String cityName, String zip, String telephone){
        checkoutPage.setCompanyBillingField(companyName);
        checkoutPage.setAddressBillingField(address);
        checkoutPage.setCityBillingField(cityName);
        checkoutPage.setPostcodeBillingField(zip);
        checkoutPage.setTelephoneBillingField(telephone);
    }
    @Step
    public void selectFromDropdown(){
        checkoutPage.selectCountryFromDropdown();
        checkoutPage.selectRegionFromDropdown();
    }
    @Step
    public void clickContinueBilling(){
        checkoutPage.clickContinueBillingButton();
    }
}
