package tests;

import methods.SaveItemMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class SaveItemTest extends BaseTest{

    @Test
    public void saveNameItemTest(){
        SaveItemMethod saveName= new SaveItemMethod(driver);
        VerificationPage verification= new VerificationPage(driver);
        PropertyManager pm = new PropertyManager();

        saveName.saveItem(pm.getProperty("username"),pm.getProperty("password"));

        try {
            verification.verifyItemName();
            System.out.println("successful");
        }catch (Exception e){
            Assert.fail("not successful");
        }
    }

}
