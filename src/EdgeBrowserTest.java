import graphql.relay.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver" , "drivers/msedgedriver.exe");

        //Object for edge
        WebDriver driver = new EdgeDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        System.out.println("Current URL is;" + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Page source is:" +driver.getPageSource());

        //Find username link element
        WebElement userNameField = driver.findElement(By.name("username"));

        //Type username address in username field
        userNameField.sendKeys("Hiren1234");

        //Find password link element
        WebElement passwordField = driver.findElement(By.id("password"));

        //Type password in password link
        passwordField.sendKeys("Hiren123");

        //Close the window
        driver.close();

    }
}
