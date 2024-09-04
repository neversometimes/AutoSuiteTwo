package tests;

import base.BaseTests;

import org.testng.annotations.Test;
import pages.DragAndDropPage;
import static org.testng.Assert.*;

public class DragAndDropTest extends BaseTests {

    @Test
    public void verifyDragAndDrop () {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);

        // verify object A is on the left and object B is on the right
        assertEquals(dragAndDropPage.getHeaderATxt(), "A");
        assertEquals(dragAndDropPage.getHeaderBTxt(), "B");

        // grab the object A and drop it on top of B
        dragAndDropPage.dragAtoB();

        // verify object A moved to spot of object B
        // AND object B moved to spot of object A
        assertEquals(dragAndDropPage.getHeaderATxt(), "B");
        assertEquals(dragAndDropPage.getHeaderBTxt(), "A");

    }

}
