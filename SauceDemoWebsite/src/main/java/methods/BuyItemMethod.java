package methods;

import org.openqa.selenium.WebDriver;
import pages.BuyItemPage;

public class BuyItemMethod extends BuyItemPage {
    public BuyItemMethod(WebDriver driver) {
        super(driver);
    }
    public void buyMethod(String user,String pass,String name,String lname,String code){
        writeUsername(user);
        writePassword(pass);
        clickLogin();
        clickAddToCart();
        clickCart();
        clickCheckoutButton();
        writeFirstName(name);
        writeLastName(lname);
        writePostalCode(code);
        clickContinueButton();
        clickFinishButton();
    }

}
