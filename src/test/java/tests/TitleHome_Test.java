package tests;

import locators.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TitleHome_Test {

    private WebDriver driver;
    HomePage homePage;

    @Before
    public void setup(){
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit("https://tienda.mimo.com.ar/");
    }

    @Test
    public void searchBox() throws InterruptedException {
        assertEquals("REMERA KID BEACH", driver.getTitle());
    }

    @After
    public void closeTest(){
        driver.quit();
    }

}
