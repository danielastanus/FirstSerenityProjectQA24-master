package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage accountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentials(String firstName, String middleName, String lastName, String email, String pass, String confirmPass){
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmPasswordField(confirmPass);
    }

    @Step
    public void checkSubscribe(){
        registerPage.clickSubscriptionCheckbox();
    }

    @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void registerConfirmation(String userName){
        accountPage.checkRegister(userName);
    }
}
