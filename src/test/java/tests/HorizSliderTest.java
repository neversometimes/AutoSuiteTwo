package tests;

import base.BaseTests;
import pages.HorizSliderPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HorizSliderTest extends BaseTests {

    @Test
    public void verifyHorizontalSlider() {
        // NOTE: slider range is 0.0 to 5.0 with step 0.5
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        HorizSliderPage horizSliderPage = new HorizSliderPage(driver);

        // get initial slider value
        String initSliderValue = horizSliderPage.getSliderValue();
        assertEquals(initSliderValue, "0");

        // click and move slider using sendkeys right-arrow x times
        horizSliderPage.moveSliderRight(10);

        // verify new slider value
        String newSliderValue1 = horizSliderPage.getSliderValue();
        assertEquals(newSliderValue1, "5");

        // click and move slider left using sendkeys left-arrow y times
        horizSliderPage.moveSliderLeft(4);

        // verify new slider value
        String newSliderValue2 = horizSliderPage.getSliderValue();
        assertEquals(newSliderValue2, "3");

    }
}
