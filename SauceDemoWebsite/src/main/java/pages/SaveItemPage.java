package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveItemPage extends BasePage{
    public SaveItemPage(WebDriver driver) {
        super(driver);
    }

    By usernameField= By.id("user-name");
    By passwordField= By.id("password");
    By loginButton = By.id("login-button");
    By nameItem= By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By addToCartButton = By.id("add-to-cart-sauce-labs-bike-light");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    public void writeUsername(String user){
        writeText(usernameField, user);
    }
    public void writePassword(String pass){
        writeText(passwordField, pass);
    }
    public void clickLogin(){
        click(loginButton);
    }
    public  void clickAddToCart(){click(addToCartButton);}
    public void clickCart(){click(cartButton);}
    public String readName(){
       return readText(nameItem);

    }
}





