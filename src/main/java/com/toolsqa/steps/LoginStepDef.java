package com.toolsqa.steps;

import com.toolsqa.common.BaseTest;
import com.toolsqa.common.PropertyUtil;
import com.toolsqa.pages.LoginPage;

import static org.assertj.core.api.BDDAssertions.then;

public class LoginStepDef extends BaseTest {

    private LoginPage loginPage = new LoginPage();

    public void loginStep(){
        PropertyUtil propertyUtil = new PropertyUtil();
       loginPage.login("qacore", "qacore@123");
    }

    public void verifyLoginConfirmation() {
        String confirmationText = loginPage.getLoginConfirmation1();
        then(confirmationText).isEqualTo("Logout");
    }
}
