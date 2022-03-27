package tests;

import methods.VerifyLogoutMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class VerifyLogoutTest extends BaseTest{

    @Test
    public void logoutTest(){
        VerifyLogoutMethod logout = new VerifyLogoutMethod(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        logout.logoutMethod(pm.getProperty("username"), pm.getProperty("password"));

        try {
            verification.verifyTextLogout("Password for all users:");
            System.out.println("successful");
        }catch (Exception e){
            Assert.fail("not successful");
        }
    }
}
