import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class Test_question5 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Before
    public void setUp() {
        //Config the webdriver.chrome.driver which is a permanent key with the path value
        System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
        //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
        driver = new ChromeDriver();
        driver.manage().window().maximize();//Make the browser open on the whole screen
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void test_1() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).sendKeys("Soozijan");
        driver.findElement(By.id("userEmail")).sendKeys("Soozijan@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Petah Tikva");
        driver.findElement(By.id("permanentAddress")).sendKeys("Lo Ba LI");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div/button")).click();

        String expected_text = "Name:Soozijan\n" +
                "Email:Soozijan@gmail.com\n" +
                "Current Address :Petah Tikva\n" +
                "Permananet Address :Lo Ba LI";

        String actual_text = driver.findElement(By.id("output")).getText();

        Assertions.assertEquals(expected_text, actual_text);//Check that the url is as expected
        driver.quit();

    }

    @Test
    public void test_2() {
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/label/span[1]/svg")).click();
        //driver.findElement(By.cssSelector(".rct-icon, .rct-icon-check")).click();
        String expected_text = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile" ;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actual_text = driver.findElement(By.id("result")).getText();

        Assertions.assertEquals(expected_text, actual_text);

         driver.quit();

    }

    @Test
    public void test_3() {
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

      //  driver.findElement(By.id("yesRadio")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expected_text = "You have selected: Yes";
        String actual_text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/p")).getText();
        driver.quit();


    }

    @Test
    public void test_4() {
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        driver.findElement(By.id("yesRadio")).click();

        String expected_text = "You have selected: Yes\n";
        String actual_text = driver.findElement(By.id("output")).getText();
        driver.quit();
    }
}