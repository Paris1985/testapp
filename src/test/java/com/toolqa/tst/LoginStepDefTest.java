package com.toolqa.tst;

import com.toolsqa.steps.LoginStepDef;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginStepDefTest {
    private LoginStepDef loginStepDef;

    @Before
    public void init(){
        loginStepDef = new LoginStepDef();
    }

    @Test
    public void shouldBeAbleToLogin() throws InterruptedException {
        loginStepDef.setUrl(System.getProperty("web.app.url"));
        loginStepDef.loginStep();
        loginStepDef.verifyLoginConfirmation();
    }

    @After
    public void destroy(){
        loginStepDef.close();
    }
}
