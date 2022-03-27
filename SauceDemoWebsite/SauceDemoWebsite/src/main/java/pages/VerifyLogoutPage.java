package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLogoutPage extends BasePage{
    public VerifyLogoutPage(WebDriver driver) {
        super(driver);
    }
    By usernameField= By.id("user-name");
    By passwordField= By.id("password");
    By loginButton = By.id("login-button");
    By menuButton = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");

    public void writeUsername(String user){
        writeText(usernameField, user);
    }
    public void writePassword(String pass){
        writeText(passwordField, pass);
    }
    public void clickLogin(){
        click(loginButton);
    }
    public void clickMenu(){
        click(menuButton);
    }
    public void clickLogout(){
        click(logoutButton);
    }

}
