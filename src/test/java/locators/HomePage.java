package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    By searchBox = By.name("q");
    By searchBtn = By.cssSelector("#search_mini_form > div > button");

    By firstProductTitleCss = By.cssSelector("/html/body/div[2]/header/div/div/div/form/div[2]/div/div/div[1]/a[1]/div/div/div[2]/div[1]/span");
    By firstProductTitleXpaht = By.xpath("#am_search_popup > div > div.am-products > a:nth-child(2) > div > div > div.am_right > div.am_title > span");

    By firstProductLink = By.xpath("/html/body/div[2]/header/div/div/div/form/div[2]/div/div/div[1]/a[1]");

    By getSearchResultBoxCss = By.cssSelector("#am_search_popup > div > div.am-products > h3");
    By getSearchResultBoxXpaht = By.xpath("/html/body/div[2]/header/div/div/div/form/div[2]/div/div/div[1]/h3");

    By nameSingleProduct = By.xpath("/html/body/div[2]/div/form/article/div/h1");

    By popUpSuscriber = By.cssSelector("#onesignal-slidedown-dialog");
    By popUpSuscriberBtn = By.cssSelector("#onesignal-slidedown-cancel-button");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void searchProduct() throws InterruptedException {

        Thread.sleep(2000);

        if(isDisplayed(popUpSuscriber)){
            click(popUpSuscriberBtn);
        }

        if(isDisplayed(searchBox) && isDisplayed(searchBtn)){
            type("Remera", searchBox);
            click(searchBtn);
            Thread.sleep(2000);
            click(firstProductLink);
        }else{
            System.out.println("Search box was not found!");
        }

    }

    public String searchResult(){
        return getText(firstProductTitleXpaht);
    }

}
