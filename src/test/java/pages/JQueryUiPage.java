package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JQueryUiPage {

    private WebDriver driver;
    private By menuEnabled = By.linkText("Enabled");
    private By menuDownloads = By.linkText("Downloads");
    private By menuBack = By.linkText("Back to JQuery UI");
    private By headerText = By.xpath("//h3");
    private By goBackLink = By.linkText("Menu");

    public JQueryUiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void traverseMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(menuEnabled));

        WebElement clickable1 = driver.findElement(menuEnabled);

        Actions actions = new Actions(driver);

        actions.moveToElement(clickable1)
                .pause(Duration.ofSeconds(5))
                .click()
                .build()
                .perform();

        wait.until(ExpectedConditions.presenceOfElementLocated(menuDownloads));

        WebElement clickable2 = driver.findElement(menuDownloads);

        actions.moveToElement(clickable2)
                .pause(Duration.ofSeconds(5))
                .click()
                .build()
                .perform();

        wait.until(ExpectedConditions.presenceOfElementLocated(menuBack));

        WebElement clickable3 = driver.findElement(menuBack);

        actions.moveToElement(clickable3)
                .pause(Duration.ofSeconds(5))
                .click()
                .build()
                .perform();
    }

    public String getHeaderText() {
        return driver.findElement(headerText).getText();
    }

    public void clickMenuToGoBack() {
        driver.findElement(goBackLink).click();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

}
