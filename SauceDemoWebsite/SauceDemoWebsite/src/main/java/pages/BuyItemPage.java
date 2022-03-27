package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPage extends BasePage{
    public BuyItemPage(WebDriver driver) {
        super(driver);
    }
    By usernameField= By.id("user-name");
    By passwordField= By.id("password");
    By loginButton = By.id("login-button");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By checkoutButton = By.id("checkout");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueButton= By.id("continue");
    By finishButton = By.id("finish");

    public void writeUsername(String user){
        writeText(usernameField, user);
    }
    public void writePassword(String pass){
        writeText(passwordField, pass);
    }
    public void clickLogin(){
        click(loginButton);
    }
    public  void clickAddToCart(){
        click(addToCartButton);
    }
    public void clickCart(){
        click(cartButton);
    }
    public void clickCheckoutButton(){
        click(checkoutButton);
    }
    public void writeFirstName(String user){
        writeText(firstNameField,user);
    }
    public void writeLastName(String user){
        writeText(lastNameField,user);
    }
    public void writePostalCode(String code){
        writeText(postalCodeField,code);
    }
    public void clickContinueButton(){
        click(continueButton);
    }
    public void clickFinishButton(){
        click(finishButton);
    }
}

