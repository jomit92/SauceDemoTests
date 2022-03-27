package methods;

import org.openqa.selenium.WebDriver;
import pages.DeleteItemPage;

public class DeleteItemMethod extends DeleteItemPage {
    public DeleteItemMethod(WebDriver driver) {
        super(driver);
    }
    public void deleteItemMethod(String user,String pass){
        writeUsername(user);
        writePassword(pass);
        clickLogin();
        clickAddToCart();
        clickCart();
        clickRemove();
        clickContinueShopping();
    }
}
