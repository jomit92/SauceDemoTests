package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.PropertyManager;

public class BaseTest {

    WebDriver driver;

    public void startFireFox(){
        quitBrowser();
       WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        PropertyManager pm = new PropertyManager();
       String url = pm.getProperty("url");

        driver.get(url);
    }

    @BeforeMethod
    public void webDriverManagerSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        PropertyManager pm = new PropertyManager();
        String url = pm.getProperty("url");

        driver.get(url);
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }

}
