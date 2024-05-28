package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HoverPage {

    private WebDriver driver;
    private By firstImage = By.xpath("/html/body/div[2]/div/div/div[1]/img");
    private By secondImage = By.xpath("/html/body/div[2]/div/div/div[2]/img");
    private By thirdImage = By.xpath("/html/body/div[2]/div/div/div[3]/img");


    public HoverPage (WebDriver driver) {
        this.driver = driver;
    }

    public String get1stImageCaption() {
        Actions actions = new Actions(driver);
        WebElement image = driver.findElement(firstImage);
        actions.moveToElement(image).build().perform();    // performs hover over 1st image

        WebElement caption = driver.findElement(RelativeLocator.with(By.tagName("h5")).near(image));
        return caption.getText();
    }

    public String get2ndImageCaption() {
        Actions actions = new Actions(driver);
        WebElement image = driver.findElement(secondImage);
        actions.moveToElement(image).build().perform();

        WebElement caption = driver.findElement(RelativeLocator.with(By.tagName("h5")).near(image));
        return caption.getText();
    }
    public String get3rdImageCaption() {
        Actions actions = new Actions(driver);
        WebElement image = driver.findElement(thirdImage);
        actions.moveToElement(image).build().perform();

        WebElement caption = driver.findElement(RelativeLocator.with(By.tagName("h5")).near(image));
        return caption.getText();

    }
}
