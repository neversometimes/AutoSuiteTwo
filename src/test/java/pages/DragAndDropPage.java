package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private WebDriver driver;
    private By objectA = By.id("column-a");
    private By objectB = By.id("column-b");
    private By headerA = By.cssSelector("div[id='column-a'] header");
    private By headerB = By.cssSelector("div[id='column-b'] header");

    public DragAndDropPage (WebDriver driver) {
        this.driver = driver;
    }

    public void dragAtoB () {

        Actions builder = new Actions(driver);

        WebElement blockA = driver.findElement(objectA);
        WebElement blockB = driver.findElement(objectB);

        builder.dragAndDrop(blockA, blockB).perform();

    }

    public String getHeaderATxt () {
        return driver.findElement(headerA).getText();
    }
    public String getHeaderBTxt () {
        return driver.findElement(headerB).getText();
    }

}
