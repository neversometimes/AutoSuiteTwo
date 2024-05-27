package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private WebDriver driver;
    private By objectA = By.id("column-a");
    private By objectB = By.id("column-b");
    private By headerA = By.xpath("//div[@id='column-a']//child::header");
    private By headerB = By.xpath("//div[@id='column-b']//child::header");

    public DragAndDropPage (WebDriver driver) {
        this.driver = driver;
    }

    public void dragAtoB () {

        Actions actions = new Actions(driver);

        WebElement blockA = driver.findElement(objectA);
        WebElement blockB = driver.findElement(objectB);

        actions.dragAndDrop(blockA, blockB).build().perform();
    }

    public String getHeaderA () {
        return driver.findElement(headerA).getText();
    }
    public String getHeaderB () {
        return driver.findElement(headerB).getText();
    }

}
