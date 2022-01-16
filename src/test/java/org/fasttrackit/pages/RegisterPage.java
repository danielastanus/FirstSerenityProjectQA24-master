package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage {

    @FindBy (css = "#firstname")
    private WebElementFacade firstNameField;

    @FindBy (css = "#middlename")
    private WebElementFacade middleNameField;

    @FindBy (css = "#lastname")
    private WebElementFacade lastNameField;

    @FindBy (css = "#email_address")
    private WebElementFacade emailField;

    @FindBy (css = "#password")
    private WebElementFacade passwordField;

    @FindBy (css = "#confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy (css = "#is_subscribed")
    private WebElementFacade subscriptionCheckBox;

    @FindBy (css = ".buttons-set [title='Register']")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setMiddleNameField(String middleName){
        typeInto(middleNameField, middleName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void setConfirmPasswordField(String confirmPass){
        typeInto(confirmPasswordField, confirmPass);
    }

    public void clickSubscriptionCheckbox(){
        clickOn(subscriptionCheckBox);

    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }



}
