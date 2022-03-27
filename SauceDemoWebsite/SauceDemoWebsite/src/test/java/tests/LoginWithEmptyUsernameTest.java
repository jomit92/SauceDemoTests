package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithEmptyUsernameTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginMethods login = new LoginMethods(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        login.emptyUsernameField( pm.getProperty("password"));

        try {
            verification.verifyEmptyUsernameText("Epic sadface: Username is required");
            System.out.println("successful");
        } catch (Exception e) {
            Assert.fail("not successful");
        }
    }

}
