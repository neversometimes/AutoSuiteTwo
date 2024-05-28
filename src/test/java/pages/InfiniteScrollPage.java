package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By lastInitPara = By.xpath("//div[@class='jscroll-added'][2]");
    private By genericPara = By.xpath("//div[@class='jscroll-inner']//child::div");
    private By thePara = By.className("jscroll-added");

    public InfiniteScrollPage (WebDriver driver) {
        this.driver = driver;
    }

    public void scrollPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(lastInitPara));

        WebElement foo = driver.findElement(lastInitPara);

        Actions actions = new Actions(driver);

        actions.scrollByAmount(0, 100000).perform();
    }

    public int countParagraphs() {
        return driver.findElements(thePara).size();
    }
}
