package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTests{

    // NOTE:  This test will not pass in Safari.  The JS alert handling doesn't work.

    @Test
    public void verifyContextMenus() {
        String homePage = "https://the-internet.herokuapp.com/context_menu";
        driver.get(homePage);

        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);

        // right-click w/in specific region of page to display context menu verification alert
        assertEquals(contextMenuPage.getContextMenu(), "You selected a context menu");

        // verify dismiss alert back to start page
        assertEquals(driver.getCurrentUrl(), homePage);
    }

}
