package org.fasttrackit.features;

import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.Test;

public class RegisterTest extends BaseTest{
    RandomString randomString = new RandomString();
    String  random = randomString.nextString();

    @Test
    public void registerWithValidCredentials(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.enterCredentials("Kate","Lisa", "Smith", "lisa.smith"+random+"@mailnator.com",
                "123456", "123456");
        registerSteps.checkSubscribe();
        registerSteps.clickRegister();
        registerSteps.registerConfirmation(" Kate Lisa Smith");
    }



}
