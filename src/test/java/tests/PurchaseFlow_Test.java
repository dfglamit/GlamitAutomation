package tests;

import locators.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class PurchaseFlow_Test {

    private WebDriver driver;
    HomePage homePage;

    @Before
    public void setUp(){
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit("https://tienda.mimo.com.ar/");
    }

    @Test
    public void purchaseFlow() throws InterruptedException {
        // Escribir prueba para realizar compra
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
