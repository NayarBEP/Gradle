package ConfigDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver = null;

    public static WebDriver Firefox(){
        WebDriverManager.firefoxdriver().setup();
        return driver;
    }

    public static WebDriver Chrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static boolean Close(){
        try{
            driver.quit();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }



}
