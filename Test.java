
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{

        public WebDriver driver = null;

        @BeforeEach
        public void initializeSelenium() {
                //Config the webdriver.chrome.driver which is a permanent key with the path value
                System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
                //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
                driver = new ChromeDriver();
                driver.manage().window().maximize();//Make the browser open on the whole screen
        }

       @org.junit.jupiter.api.Test
        public void testTitle() {
                driver.get("https://www.morfix.co.il/");//Open the specified url in the browser
                Assertions.assertEquals("תרגום מורפיקס - מילון עברי אנגלי חינם | Free Morfix Dictionary", driver.getTitle());//Check that the url is as expected
                driver.quit();




                /*
        @org.junit.jupiter.api.Test
        public void test1() throws InterruptedException {
                //Config the webdriver.chrome.driver which is a permanent key with the path value
                System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
                //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();//Make the browser open on the whole screen
                driver.get("https://www.morfix.co.il/");//Open the specified url in the browser

                String title = driver.getTitle();//Get the page title
                System.out.println("Page title is: " + title);//Print title to the console

                assert title.equals("מורפיקס");

                Thread.sleep(1000);

                driver.quit();//Close the browser and ChromeDriver

        */
        }
}




