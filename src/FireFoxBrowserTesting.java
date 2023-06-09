import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl= "https://www.saucedemo.com/";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximise window view
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title= driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        String title2 = driver.getCurrentUrl();
        System.out.println("Current URL: "+ title2);

        //get page source
        System.out.println("Page source:  "+ driver.getPageSource());

        //Find the element of email field.
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("standard_user");

        //find the element of password field.
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");

        //close the browser
        driver.quit();
    }
}
