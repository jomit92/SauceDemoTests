package methods;

import org.openqa.selenium.WebDriver;
import pages.SaveItemPage;
import utilities.PropertyManager;

public class SaveItemMethod extends SaveItemPage {
    public SaveItemMethod(WebDriver driver) {
        super(driver);
    }
    public void saveItem(String username, String pass){
        writeUsername(username);
        writePassword(pass);
        clickLogin();
        clickAddToCart();

        String itemName= readName();

        PropertyManager pm = new PropertyManager();
        pm.changeProperty("item", itemName);

        clickCart();
    }
}
