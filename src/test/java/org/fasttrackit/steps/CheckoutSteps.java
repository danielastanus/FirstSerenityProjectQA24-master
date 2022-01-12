package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class CheckoutSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;
    private CartPage cartPage;


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
}
