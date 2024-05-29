package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FloatingMenuPage;
import static org.testng.Assert.*;

public class FloatingMenuTest extends BaseTests {

    @Test
    public void verifyFloatingMenus() {
        FloatingMenuPage floatingMenuPage = new FloatingMenuPage(driver);
        String pageURL = "https://the-internet.herokuapp.com/floating_menu";
        driver.get(pageURL);

        // verify page Header text
        assertEquals(floatingMenuPage.getHeaderText(), "Floating Menu");

        // click floating menu About button
        floatingMenuPage.clickMenuAboutButton();

        // verify URL updated
        assertEquals(floatingMenuPage.getCurrentURLText(), pageURL + "#about");

        // arbitrary scroll down the page
        floatingMenuPage.scrollPage();

        // click floating menu News
        floatingMenuPage.clickMenuNewsButton();

        // verify button text and URL updated
        assertEquals(floatingMenuPage.getCurrentURLText(), pageURL + "#news");
    }
}
