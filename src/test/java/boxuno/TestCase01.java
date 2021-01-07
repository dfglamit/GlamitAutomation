package boxuno;

import locators.home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestCase01 {

    private WebDriver driver;


    @Before
    public void setup(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ar");
    }

    @Test
    public void searchBox(){
        WebElement searchbox;
        searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("Bruma Baby");
        searchbox.submit();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        assertEquals("Bruma Baby - Google Search", driver.getTitle());
    }

    @After
    public void closeTest(){
        driver.quit();
    }
}