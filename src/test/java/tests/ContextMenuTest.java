package tests;

import base.BaseTests;

import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenuTest extends BaseTests{

    @Test
    public void verifyContextMenus() {

        driver.get("https://the-internet.herokuapp.com/context_menu");

        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);

        // right-click w/in specific region of page to display context menu verification alert
        contextMenuPage.getContextMenu();

        // verify context menu alert text is displayed
        assertEquals(contextMenuPage.isContextMenuDisplayed(), "You selected a context menu");

    }

}
