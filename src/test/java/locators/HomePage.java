package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    /* Home Page Locators */
    By search_box               = By.name("q");
    By search_btn               = By.cssSelector("#search_mini_form > div > button");
    By first_product_title      = By.cssSelector("#nombreProducto");
    By popup_suscriber          = By.cssSelector("#onesignal-slidedown-dialog");
    By popup_suscriber_btn      = By.cssSelector("#onesignal-slidedown-cancel-button");
    By first_product_gallery    = By.cssSelector("#the-210136 > div.containerdestaquecm > div > div > div.swiper-wrapper > div.swiper-slide.swiper-slide-active > a");

    /* Constructor */
    public HomePage(WebDriver driver){
        super(driver);
    }

    /* Home Page Methods*/
    public void searchProduct() throws InterruptedException {

        Thread.sleep(2000);

        if(isDisplayed(popup_suscriber)){
            click(popup_suscriber_btn);
        }

        if(isDisplayed(search_box) && isDisplayed(search_btn)){
            type("Remera", search_box);
            click(search_btn);
            Thread.sleep(2000);
            click(first_product_gallery);
            Thread.sleep(2000);
        }else{
            System.out.println("Search box was not found!");
        }

    }

    /* Home Page Data */

    // Este metodo podria ir en la clase de galeria---Revisar
    public String searchResult(){
        return getText(first_product_title);
    }

}
