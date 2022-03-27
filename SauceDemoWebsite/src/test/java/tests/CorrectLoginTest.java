package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class CorrectLoginTest extends BaseTest {


    @Test
    public void correctLogin() {

        LoginMethods login = new LoginMethods(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm = new PropertyManager();

        login.doLogin( pm.getProperty("username"), pm.getProperty("password"));

        try {
            verification.verifySignIn();
            System.out.println("successful");
        } catch (Exception e) {
            Assert.fail("not successful");

        }

    }
}
