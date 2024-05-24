package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By pageTitle = By.tagName("title");

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
        wait.until(ExpectedConditions.
                presenceOfElementLocated(pageTitle));
        return driver.getTitle();
    }
}
