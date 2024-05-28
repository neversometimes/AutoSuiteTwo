package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizSliderPage {

    private WebDriver driver;
    private By sliderBtn = By.xpath("//input[@type='range']");


    public HorizSliderPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getSliderValue() {
        WebElement slider = driver.findElement(sliderBtn);
        return slider.getAttribute("value");
    }

    public void moveSliderRight(int keypress) {
        WebElement slider = driver.findElement(sliderBtn);
        for (int i = 0; i < keypress; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void moveSliderLeft(int keypress) {
        WebElement slider = driver.findElement(sliderBtn);
        for (int i = 0; i < keypress; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
    }

}
