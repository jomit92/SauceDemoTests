package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void writeUsername(String user){
        writeText(usernameField, user);
    }
    public void writePassword(String pass){
        writeText(passwordField, pass);
    }
    public void clickLogin(){
        click(loginButton);
    }
}
