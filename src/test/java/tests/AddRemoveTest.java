package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AddRemovePage;

import java.time.Duration;

import static org.testng.Assert.*;

public class AddRemoveTest extends BaseTests {

    @Test
    public void verifyAddRemoveElements() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // click Add Element button
        AddRemovePage arPage = new AddRemovePage(driver);

        arPage.clickAddElementButton();
        assertTrue(arPage.checkDeleteButtonState());

        arPage.clickDeleteButton();
        assertFalse(arPage.checkDeleteButtonState());

    }



}
