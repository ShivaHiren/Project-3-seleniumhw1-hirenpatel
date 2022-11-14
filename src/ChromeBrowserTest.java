import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Object of chrome
        WebDriver driver = new ChromeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find username link element
        WebElement userNameField = driver.findElement(By.name("username"));

        //Type username address in username field
        userNameField.sendKeys("Hiren1234");

        //Find password link element
        WebElement passwordField = driver.findElement(By.id("password"));

        //Type password in passwprd link
        passwordField.sendKeys("Hiren123");

        //Close the window
        driver.close();


    }
}
