package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddRemovePage {

    private WebDriver driver;
    private By addElementButton = By.xpath("//*[@id='content']/div/button");
    private By deleteButton = By.xpath("//*[@id='elements']/button");


    public AddRemovePage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElementButton() {
        driver.findElement(addElementButton).click();   // Adds Delete buttons with every click
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();       // Removes Delete buttons with  click
    }

    public Boolean checkDeleteButtonState() {
        return !driver.findElements(deleteButton).isEmpty();  //
    }

}
