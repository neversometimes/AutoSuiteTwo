package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTests {

    @Test
    public void verifyCheckboxes () {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

        // verify body text of page
        assertEquals(checkboxesPage.getHeadingText(), "Checkboxes");

        // check initial state of checkbox1 and checkbox 2
        assertFalse(checkboxesPage.getChkBox1State());
        assertTrue(checkboxesPage.getChkbox2State());

        // click checkbox 1 - check state changed
        checkboxesPage.toggleChkBox1State();
        assertTrue(checkboxesPage.getChkBox1State());

        // click checkbox 2 - check state changed
        checkboxesPage.toggleChkbox2State();
        assertFalse(checkboxesPage.getChkbox2State());
    }
}
