package tests;
import base.BaseTests;
import pages.DynamicControlsPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTests{

    @Test
    public void verifyAddRemoveControls () {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // verify checkbox is present
        assertTrue(dynamicControlsPage.checkboxExists());

        // remove checkbox
        dynamicControlsPage.clickRemoveChkBox();

        // verify checkbox is removed (not displayed)
        assertFalse(dynamicControlsPage.checkboxExists());

        // add checkbox
        dynamicControlsPage.clickAddChkBox();

        // verify checkbox is again present
        assertTrue(dynamicControlsPage.checkboxExists());
    }

    @Test
    public void verifyEnableDisableControls () {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        DynamicControlsPage dynamicControlsPage = new DynamicControlsPage(driver);

        // verify textbox is disabled
        assertFalse(dynamicControlsPage.txtBoxEnabled());

        // enable textbox
        dynamicControlsPage.clickEnableTxtBox();

        // verify textbox is enabled
        assertTrue(dynamicControlsPage.txtBoxEnabled());

        // disable textbox
        dynamicControlsPage.clickDisableTxtBox();

        // verify textbox is disabled
        assertFalse(dynamicControlsPage.txtBoxEnabled());

    }
}
