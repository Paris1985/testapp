package com.toolqa.tst;

import com.toolsqa.common.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseTestTest {
    private BaseTest baseTest;

    @Before
    public void init(){
        baseTest = new BaseTest();
    }

    @Test
    public void shouldBeAbleToLogin() {
        baseTest.setUrl(System.getProperty("web.app.url"));
    }

    @After
    public void destroy(){
        baseTest.close();
    }
}
