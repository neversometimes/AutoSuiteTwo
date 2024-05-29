package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMsgPage {

    private WebDriver driver;
    private By msgLink = By.linkText("Click here");
    private By notificationMsgTxt = By.xpath("//div[@id='flash']");

    public NotificationMsgPage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoadNewMsgLink () {
        driver.findElement(msgLink).click();
    }

    public boolean isNotificationMsgDisplayed() {
        return driver.findElement(notificationMsgTxt).isDisplayed();
    }

}
