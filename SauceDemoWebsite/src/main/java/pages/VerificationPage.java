package pages;


import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.PropertyManager;

public class VerificationPage extends BasePage {

    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    public void verifySignIn() {

        By logoutLink = By.id("logout_sidebar_link");

        Assert.assertFalse(driver.findElements(logoutLink).isEmpty());

    }
    public void verifyAddToCartText(String expectedText) {
        By addToCart = By.id("add-to-cart-sauce-labs-backpack");

        String addToCartText = readText(addToCart);
        Assert.assertEquals(addToCartText, expectedText);

    }

    public void verifyCheckoutText(String expectedText) {
        By headerText = By.className("complete-header");

        String headerTitle = readText(headerText);
        Assert.assertEquals(headerTitle, expectedText);

    }
    public void verifyTextLogout (String expectedText) {
        By passwordText= By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4");

        String logout = readText(passwordText);
        Assert.assertEquals(logout, expectedText);

    }
    public void verifyWrongText(String expectedText){
        By wrongText = By.xpath("//h3[@data-test='error']");

        String wrong = readText(wrongText);
        Assert.assertEquals(wrong, expectedText);
    }
    public void verifyEmptyUsernameText(String expectedText){
        By emptyUsername = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

        String empty= readText(emptyUsername);
        Assert.assertEquals(empty, expectedText);
    }
    public void  verifyEmptyPasswordText(String expectedText){
        By emptyPassword= By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

        String emptyPass= readText(emptyPassword);
        Assert.assertEquals(emptyPass,expectedText);
    }
    public void verifyItemName(){
        PropertyManager pm = new PropertyManager();
        String expectedText = pm.getProperty("item");

        By nameItem= By.className("inventory_item_name");
        String item= readText(nameItem);
        Assert.assertEquals(item,expectedText);
    }



}

