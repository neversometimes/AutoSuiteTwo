package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotificationMsgPage {

    private WebDriver driver;
    private By newMsgLink = By.linkText("Click here");
    private By notificationMsgTxt = By.xpath("//div[@id='flash']");

    public NotificationMsgPage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoadNewMsgLink () {
        driver.findElement(newMsgLink).click();
    }

    public boolean isNotificationMsgDisplayed() {
        // This wait sequence is for Safari :-P
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfElementLocated(notificationMsgTxt));

        return driver.findElement(notificationMsgTxt).isDisplayed();
    }

    public boolean isNotificationMsgBlank() {
        return driver.findElement(notificationMsgTxt).getText().isBlank();
    }
}
