package Test;

import Pages.Page;

import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public Page page;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
        driver.manage().window().fullscreen();

        //create the object of the page class: instantiate Page Class
        page = new Page(driver, wait);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}



