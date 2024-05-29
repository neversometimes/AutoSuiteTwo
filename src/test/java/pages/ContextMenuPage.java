package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ContextMenuPage {

    private WebDriver driver;
    private By rightClickTarget = By.id("hot-spot");   // "hot-spot" is the id of the context menu region


    public ContextMenuPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getContextMenu() {
        Actions actions = new Actions(driver);

        WebElement contextMenu = driver.findElement(rightClickTarget);

        actions.moveToElement(contextMenu)
                .contextClick()
                .pause(Duration.ofSeconds(3))
                .perform();

        Alert alert = driver.switchTo().alert();

        String alertTxt = alert.getText();
        alert.accept();
        return alertTxt;

    }
}
