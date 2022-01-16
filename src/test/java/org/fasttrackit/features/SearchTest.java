package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void searchForExistingProduct(){
        searchSteps.navigateToHomePage();
        searchSteps.executeSearch("necklace");
        searchSteps.findAndOpenProduct( "SILVER DESERT NECKLACE");
    }

    @Test
    public void searchTest(){
        searchSteps.executeSearch("");
    }

}
