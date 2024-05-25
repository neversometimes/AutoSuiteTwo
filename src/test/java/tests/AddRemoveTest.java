package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import static org.testng.Assert.*;

public class AddRemoveTest extends BaseTests {

    @Test
    public void verifyAddRemoveElements() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        AddRemovePage arPage = new AddRemovePage(driver);

        // click Add Element button
        arPage.clickAddElementButton();
        assertTrue(arPage.checkDeleteButtonState());

        arPage.clickDeleteButton();
        assertFalse(arPage.checkDeleteButtonState());

    }

}
