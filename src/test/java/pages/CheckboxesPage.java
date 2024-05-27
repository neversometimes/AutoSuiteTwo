package pages;

import org.openqa.selenium.*;

public class CheckboxesPage {

    private WebDriver driver;
    private By headingText = By.xpath("//h3[text()='Checkboxes']" );
    private By chkbox1 = By.xpath("//*[@type='checkbox']");
    private By chkbox2 = By.xpath("//*[@type='checkbox']//following::input");

    public CheckboxesPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(headingText).getText();
    }

    public boolean getChkBox1State() {
        WebElement cb1 = driver.findElement(chkbox1);
        return cb1.isSelected();
    }

    public boolean getChkbox2State() {
        WebElement cb2 = driver.findElement(chkbox2);
        return cb2.isSelected();
    }

    public void toggleChkBox1State() {
        driver.findElement(chkbox1).click();
    }

    public void toggleChkbox2State() {
        driver.findElement(chkbox2).click();
    }

}
