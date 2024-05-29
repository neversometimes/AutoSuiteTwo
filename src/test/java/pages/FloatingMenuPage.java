package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FloatingMenuPage {

    private WebDriver driver;
    private By pageHeader = By.xpath("//h3");
    private By menuAbout = By.xpath("//a[@href='#about']");
    private By scrollTarget = By.xpath("//div[@class='scroll large-10 columns large-centered']");
    private By menuNews = By.xpath("//a[@href='#news']");

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText () {
        return driver.findElement(pageHeader).getText();
    }

    public void clickMenuAboutButton() {
        WebElement aboutBtn = driver.findElement(menuAbout);
        Actions actions = new Actions(driver);

        actions.moveToElement(aboutBtn)
                .pause(Duration.ofSeconds(2))
                .click()
                .build()
                .perform();

    }
    public String getCurrentURLText() {
        return driver.getCurrentUrl();
    }

    public void scrollPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(scrollTarget));

        Actions actions = new Actions(driver);

        actions.scrollByAmount(0, 100000).perform();
    }

    public void clickMenuNewsButton() {
        WebElement newsBtn = driver.findElement(menuNews);
        Actions actions = new Actions(driver);

        actions.moveToElement(newsBtn)
                .pause(Duration.ofSeconds(2))
                .click()
                .build()
                .perform();

    }
}
