import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        try {
            form();
        }
        catch (InterruptedException e) {

        }
    }

    public static void form() throws InterruptedException
    {
        //Config the webdriver.chrome.driver which is a permanent key with the path value
        System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
        //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Make the browser open on the whole screen
        driver.get("file:///C:/Users/Soozijan/OneDrive/%D7%A9%D7%95%D7%9C%D7%97%D7%9F%20%D7%94%D7%A2%D7%91%D7%95%D7%93%D7%94/question%203/index.html");//Open the specified url in the browser

        String title = driver.getTitle();//Get the page title
        System.out.println("Page title is: " + title);//Print title to the console

        String url = driver.getCurrentUrl();//Get the page Url
        System.out.println("Page address is: " + url);//Print url to the console

        WebElement input1 = driver.findElement(By.id("country"));//Find the element with name "q"
        input1.sendKeys("Israel");//Write "Hello!" inside the input element

        WebElement input2 = driver.findElement(By.id("city"));//Find the element with name "q"
        input2.sendKeys("Tel_Aviv");//Write "Hello!" inside the input element

        WebElement input3 = driver.findElement(By.id("street-name"));//Find the element with name "q"
        input3.sendKeys("Deganya");//Write "Hello!" inside the input element

        WebElement input4 = driver.findElement(By.id("house-number"));//Find the element with name "q"
        input4.sendKeys("12");//Write "Hello!" inside the input element

        Thread.sleep(1000);

        Thread.sleep(2000);

        driver.quit();//Close the browser and ChromeDriver
    }

    public static void morfix() throws InterruptedException
    {
        //Config the webdriver.chrome.driver which is a permanent key with the path value
        System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
        //The web driver is an interface. The ChromeDriver inherits the WebDriver. ChromeDriver will open the chrome browser for us.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Make the browser open on the whole screen
        driver.get("https://www.morfix.co.il/");//Open the specified url in the browser

        String title = driver.getTitle();//Get the page title
        System.out.println("Page title is: " + title);//Print title to the console

        String url = driver.getCurrentUrl();//Get the page Url
        System.out.println("Page address is: " + url);//Print url to the console

        Thread.sleep(1000);

        WebElement input = driver.findElement(By.id("searchField"));//Find the element with name "q"
        input.sendKeys("Hello");//Write "Hello!" inside the input element

        Thread.sleep(1000);

        //driver.findElement(By.id("btnSearch")).click();//Find the element with name "btnK" and click it

        // Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div[2]/div[1]/div[1]/input[2]")).click();

        Thread.sleep(1000);

        driver.quit();//Close the browser and ChromeDriver
    }
}