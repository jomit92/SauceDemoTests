package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class WrongCredentialsTest extends BaseTest {


    @Test
    public void wrongCredentials() {


        LoginMethods wrong = new LoginMethods(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        wrong.doLogin(pm.getProperty("username1"), pm.getProperty("password1"));

        try {
            verification.verifyWrongText("Epic sadface: Username and password do not match any user in this service");
            System.out.println("successful");
        } catch (Exception e) {
            Assert.fail("not successful");
        }
    }
}