package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithEmptyPasswordTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginMethods emptyPassword = new LoginMethods(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        emptyPassword.emptyPasswordField(pm.getProperty("username"));

        try {
            verification.verifyEmptyPasswordText("Epic sadface: Password is required");
            System.out.println("successful");}
        catch (Exception e){
            Assert.fail("not successful");


        }
    }
}