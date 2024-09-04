package base;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTests {

    protected WebDriver driver;

    @BeforeSuite
    void setupClass() {
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) throws Exception {  // "String browser" as setup parameter

        if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            throw new Exception("Incorrect Browser");
        }

          // driver = new FirefoxDriver();  // used while developing tests
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
