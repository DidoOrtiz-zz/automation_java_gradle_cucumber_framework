package pageObjectModels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CookiesNoticePageObjectModel extends PageBase {

    public CookiesNoticePageObjectModel(WebDriver driver){

        super();
    }


    public CookiesNoticePageObjectModel (){

        WebElement dispenseCookies =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div[1]/div[2]/div[1]"));
        dispenseCookies.click();

        //driver.quit();

    }


}
