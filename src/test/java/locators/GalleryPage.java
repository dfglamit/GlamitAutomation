package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GalleryPage extends Base {

    /* Home Page Locators */
    By order_by_btn             = By.cssSelector("#orden");
    By order_by_price_desc      = By.cssSelector("#orden > option:nth-child(2)");
    By order_by_price_asc       = By.cssSelector("#orden > option:nth-child(3)");
    By order_by_newer           = By.cssSelector("#orden > option:nth-child(4)");
    By getOrder_by_older        = By.cssSelector("#orden > option:nth-child(5)");

    /* Constructor */
    public GalleryPage(WebDriver driver){
        super(driver);
    }
}
