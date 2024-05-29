package tests;

import base.BaseTests;
import pages.JQueryUiPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class JQueryUITest extends BaseTests {

    @Test
    public void verifyJQueryUI() {

        JQueryUiPage jQueryUiPage = new JQueryUiPage(driver);
        String startPage = "https://the-internet.herokuapp.com/jqueryui/menu";
        driver.get(startPage);

        // traverse menu to open JQuery UI page
        jQueryUiPage.traverseMenu();

        // verify landed on JQuery UI page
        assertEquals(jQueryUiPage.getHeaderText(), "JQuery UI");

        // click "Menu" link to go back to start page
        jQueryUiPage.clickMenuToGoBack();

        // verify back on start page
        assertEquals(jQueryUiPage.getURL(), startPage);
    }

}
