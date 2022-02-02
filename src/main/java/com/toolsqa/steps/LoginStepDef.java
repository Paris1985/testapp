package com.toolsqa.steps;

import com.toolsqa.common.ui.BaseTest;
import com.toolsqa.common.util.PropertyUtil;
import com.toolsqa.pages.LoginPage;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;

public class LoginStepDef extends BaseTest {

    private LoginPage loginPage = new LoginPage();

    public void loadPropsFromYamel() {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("yamel/qa.yaml");
        Map<String, String> qa = yaml.load(inputStream);
        loginPage.login(qa.get("username"), qa.get("password"));
    }

    public void loadFromPropFile() {
        PropertyUtil propertyUtil = new PropertyUtil();
        loginPage.login(propertyUtil.getProperty("username"), propertyUtil.getProperty("password"));
    }

    public void loginStep() {
        loadPropsFromYamel();
    }

    public void verifyLoginConfirmation() {
        String confirmationText = loginPage.getLoginConfirmation1();
        then(confirmationText).isEqualTo("Logout");
    }
}
