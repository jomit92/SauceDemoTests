package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteItemPage extends BasePage{
    public DeleteItemPage(WebDriver driver) {
        super(driver);
    }
    By usernameField= By.id("user-name");
    By passwordField= By.id("password");
    By loginButton = By.id("login-button");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By removeButton = By.id("remove-sauce-labs-backpack");
    By continueShoppingButton= By.id("continue-shopping");

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
    public void clickRemove(){
        click(removeButton);
    }
    public void clickContinueShopping(){
        click(continueShoppingButton);
    }
}
