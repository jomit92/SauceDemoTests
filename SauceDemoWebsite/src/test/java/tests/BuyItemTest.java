package tests;

import methods.BuyItemMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class BuyItemTest extends  BaseTest{

    @Test
    public void buyItemTest(){
        BuyItemMethod buyItem= new BuyItemMethod(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        buyItem.buyMethod(pm.getProperty("username"), pm.getProperty("password"), pm.getProperty("fName"),
                pm.getProperty("lName"), pm.getProperty("pCode"));

        try {
            verification.verifyCheckoutText("THANK YOU FOR YOUR ORDER");
            System.out.println("successful");
        }catch (Exception e){
            Assert.fail("not successful");
        }


    }
}
