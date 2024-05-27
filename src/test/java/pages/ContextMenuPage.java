package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenuPage {

    private WebDriver driver;
    private By rightClickTarget = By.id("hot-spot");   // "hot-spot" is the id of the context menu region


    public ContextMenuPage (WebDriver driver) {
        this.driver = driver;
    }

    public void getContextMenu() {
        Actions actions = new Actions(driver);

        WebElement contextMenu = driver.findElement(rightClickTarget);
        actions.contextClick(contextMenu).build().perform();

    }

    public String isContextMenuDisplayed () {
        // alert shows if right-click happens within page target region

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        return alert.getText();  // return alert text to verify it is visible
    }



}
