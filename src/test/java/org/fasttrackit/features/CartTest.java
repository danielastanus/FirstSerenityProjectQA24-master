package org.fasttrackit.features;


import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        loginSteps.doLogin("danielaaa.stanus@mailinator.com","123456");
        searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
        cartSteps.clickAddProductToCart();
    }
}
