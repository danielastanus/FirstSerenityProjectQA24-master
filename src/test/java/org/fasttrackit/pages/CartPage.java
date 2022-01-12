package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

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

}
