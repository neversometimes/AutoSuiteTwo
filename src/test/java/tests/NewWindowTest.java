package tests;

import base.BaseTests;
import pages.NewWindowPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NewWindowTest extends BaseTests{

    @Test
    public void verifyNewWindow() {

        NewWindowPage newWindowPage = new NewWindowPage(driver);
        driver.get("https://the-internet.herokuapp.com/windows");

        // verify homepage header text
        assertEquals(newWindowPage.getHeaderText(), "Opening a new window");

        // click to open new window and switch to it
        newWindowPage.openNewWindow();

        // verify new window title
        assertEquals(newWindowPage.getTitleText(), "New Window");
        // verify new window URL
        assertEquals(newWindowPage.getURL(), "https://the-internet.herokuapp.com/windows/new");

    }
}
