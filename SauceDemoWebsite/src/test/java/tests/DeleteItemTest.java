package tests;

import methods.DeleteItemMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class DeleteItemTest extends BaseTest{
    @Test

    public void deleteItemTest(){
        DeleteItemMethod deleteItem= new DeleteItemMethod(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm = new PropertyManager();

        deleteItem.deleteItemMethod(pm.getProperty("username"),pm.getProperty("password"));

        try {
            verification.verifyAddToCartText("ADD TO CART");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }

    }

}
