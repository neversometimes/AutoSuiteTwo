package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage {

    private WebDriver driver;
    private By chkBox = By.xpath("//input[@type='checkbox']");
    private By removeAddBtn = By.xpath("//form[@id='checkbox-example']//child::button");
    private By txtBox = By.xpath("//input[@type='text']");
    private By enableDisableBtn = By.xpath("//form[@id='input-example']//child::button");
    private By disabledTxtBox = By.xpath("//input[@type='text' and @disabled='']");

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkboxExists() {
        return driver.findElements(chkBox).size() > 0;  // returns 0 if web element not found (removed by button click)
    }

    public void clickRemoveChkBox() {
        driver.findElement(removeAddBtn).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(chkBox)); // invisibility = doesn't exist on the page?

    }
    public void clickAddChkBox() {
        driver.findElement(removeAddBtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    public void clickEnableTxtBox() {
        driver.findElement(enableDisableBtn).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(txtBox));  // clickable = enabled

    }
    public void clickDisableTxtBox() {
        driver.findElement(enableDisableBtn).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(25))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        // need to wait for disabledTxtBox after button click() before verify textbox state
        wait.until(ExpectedConditions.presenceOfElementLocated(disabledTxtBox));

    }

    public boolean txtBoxEnabled() {
        return driver.findElement(txtBox).isEnabled();
    }

}
