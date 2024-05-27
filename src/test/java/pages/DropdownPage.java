package pages;

import org.openqa.selenium.*;

public class DropdownPage {

    private WebDriver driver;

    private By headingText = By.xpath("//h3[text()='Dropdown List']");
    private By option0 = By.xpath("//option[@value='']");
    private By option1 = By.xpath("//option[@value='1']");
    private By option2 = By.xpath("//option[@value='2']");

    public DropdownPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(headingText).getText();
    }
    public boolean option0Selected() {
        return driver.findElement(option0).isSelected();
    }
    public void clickOption1() {
        driver.findElement(option1).click();
    }
    public boolean option1Selected() {
        return driver.findElement(option1).isSelected();
    }
    public void clickOption2() {
        driver.findElement(option2).click();
    }
    public boolean option2Selected() {
        return driver.findElement(option2).isSelected();
    }

}
