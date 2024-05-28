package tests;

import base.BaseTests;
import pages.HoverPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTest extends BaseTests {

    @Test
    public void verifyHover() {
        driver.get("https://the-internet.herokuapp.com/hovers");

        HoverPage hoverPage = new HoverPage(driver);

        // mouse-hover over 2nd image - verify 2nd image caption text
        assertEquals(hoverPage.get1stImageCaption(), "name: user1" );

        // mouse-hover over 2nd image - verify 2nd image caption text
        assertEquals(hoverPage.get2ndImageCaption(), "name: user2" );

    // mouse-hover over 2nd image - verify 2nd image caption text
        assertEquals(hoverPage.get3rdImageCaption(), "name: user3" );


    }
}
