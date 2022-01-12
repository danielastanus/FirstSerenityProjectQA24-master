package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy (id = "billing:company")
    private WebElementFacade companyBillingField;

    @FindBy (id = "billing:street1")
    private WebElementFacade addressBillingField;

    @FindBy (id = "billing:city")
    private WebElementFacade cityBillingField;

    @FindBy (id = "billing:country_id")
    private WebElementFacade countryBillingField;

    @FindBy (id = "billing:region_id")
    private WebElementFacade regionBillingField;

    @FindBy (id = "billing:postcode")
    private WebElementFacade postcodeBillingField;


    @FindBy (id = "billing:telephone")
    private WebElementFacade telephoneBillingField;



    public void setCompanyBillingField(String companyName){
        typeInto(companyBillingField, companyName);

    }
    public void setAddressBillingField (String address){
        typeInto(addressBillingField, address);
    }

    public void setCityBillingField(String cityName){
        typeInto(cityBillingField, cityName);
    }

    public void selectCountryFromDropdown(){
        clickOn(countryBillingField);
        countryBillingField.selectByValue("RO");
    }

    public void selectRegionFromDropdown(){
        clickOn(regionBillingField);
        regionBillingField.selectByValue("291");
    }

    public void setPostcodeBillingField (String postCode){
        typeInto(postcodeBillingField, postCode);
    }

    public void setTelephoneBillingField(String telephoneNumber){
        typeInto(telephoneBillingField, telephoneNumber);
    }

}
