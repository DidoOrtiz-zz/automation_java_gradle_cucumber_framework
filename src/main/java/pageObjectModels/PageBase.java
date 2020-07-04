package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageBase {


    protected WebDriver driver = null;


    public PageBase() {
//        PageFactory.initElements(driver, this);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\diana.ortiz\\Downloads\\Testing\\BDD\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}