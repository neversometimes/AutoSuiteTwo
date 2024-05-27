package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import static org.testng.Assert.*;

public class DropdownTest extends BaseTests {

    @Test
    public void verifyDropDownList () {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);

        // verify default heading text
        assertEquals(dropdownPage.getHeadingText(), "Dropdown List");
        // verify default dropdown list options
        assertTrue(dropdownPage.option0Selected());
        assertFalse(dropdownPage.option1Selected());
        assertFalse(dropdownPage.option2Selected());

        // select option 2
        dropdownPage.clickOption1();
        // verify default dropdown list options
        assertFalse(dropdownPage.option0Selected());
        assertTrue(dropdownPage.option1Selected());
        assertFalse(dropdownPage.option2Selected());

        // select option 1
        dropdownPage.clickOption2();
        // verify default dropdown list options
        assertFalse(dropdownPage.option0Selected());
        assertFalse(dropdownPage.option1Selected());
        assertTrue(dropdownPage.option2Selected());

    }

}
