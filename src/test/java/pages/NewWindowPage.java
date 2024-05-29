package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NewWindowPage {

    private WebDriver driver;
    private By headerText = By.xpath("//h3");
    private By clickHere = By.xpath("//a[@href='/windows/new']");

    public NewWindowPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(headerText).getText();
    }

    public void openNewWindow() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String originalWindow = driver.getWindowHandle();  // save the original window handle

        driver.findElement(clickHere).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // loop through until a new window is found
        for (String windowHandle : driver.getWindowHandles()) {   // for each driver window handle
            if(!originalWindow.contentEquals(windowHandle)) {   // if not original window handle
                driver.switchTo().window(windowHandle);         // switch to that window handle
                break;
            }
        }
         wait.until(ExpectedConditions.titleIs("New Window"));
    }

    public String getTitleText() {
        return driver.getTitle();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
