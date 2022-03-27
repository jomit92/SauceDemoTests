package methods;

import org.openqa.selenium.WebDriver;
import pages.VerifyLogoutPage;

public class VerifyLogoutMethod extends VerifyLogoutPage {
    public VerifyLogoutMethod(WebDriver driver) {
        super(driver);
    }
    public void logoutMethod(String user, String pass){
        writeUsername(user);
        writePassword(pass);
        clickLogin();
        clickMenu();
        clickLogout();
    }
}
