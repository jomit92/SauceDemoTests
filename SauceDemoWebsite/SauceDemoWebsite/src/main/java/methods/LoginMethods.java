package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }

    public void doLogin(String user, String pass){
        writeUsername(user);
        writePassword(pass);
        clickLogin();
    }

    public void emptyPasswordField(String username){
        writeUsername (username);
        clickLogin();
    }

    public void emptyUsernameField(String user){
        writePassword(user);
        clickLogin();
    }

}
