package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSAlertsPage {

    private WebDriver driver;
    private By jsAlertBtn = By.xpath("//button[@onclick='jsAlert()']");
    private By jsConfirmBtn = By.xpath("//button[@onclick='jsConfirm()']");
    private By jsPromptBtn = By.xpath("//button[@onclick='jsPrompt()']");
    private By rsltText = By.xpath("//p[@id='result']");

    public JSAlertsPage (WebDriver driver) {
        this.driver = driver;
    }

    public String clickAlertBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.findElement(jsAlertBtn).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }

    public String getResultText() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(rsltText).getText();
    }

    public String clickConfirmCancelBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(jsConfirmBtn).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirm = driver.switchTo().alert();
        String confirmText = confirm.getText();
        confirm.dismiss();
        return confirmText;
    }

    public String clickConfirmOKBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(jsConfirmBtn).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirm = driver.switchTo().alert();
        String confirmText = confirm.getText();
        confirm.accept();
        return confirmText;
    }

    public String clickPromptCancelBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(jsPromptBtn).click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirm = driver.switchTo().alert();
        String confirmText = confirm.getText();
        confirm.dismiss();
        return confirmText;
    }

    public String clickPromptOKBtn(String submitText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(jsPromptBtn).click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert prompt = driver.switchTo().alert();
        String promptText = prompt.getText();
        prompt.sendKeys(submitText);
        prompt.accept();
        return promptText;
    }

}
