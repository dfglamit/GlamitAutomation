package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class home {

    public static void goToHomePage(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ar");
    }
}
