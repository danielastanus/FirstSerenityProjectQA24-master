package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade loginHelloMessageElement;

    @FindBy(css = ".hello")
    private WebElementFacade registerSuccesMessageElement;

    public void checkUserLoggedIn(String userName) {
        loginHelloMessageElement.shouldContainOnlyText("Hello, " + userName + "!");
    }

    public void checkRegister(String userName) {
        registerSuccesMessageElement.shouldContainOnlyText("Hello," + userName + "!");
    }
}
