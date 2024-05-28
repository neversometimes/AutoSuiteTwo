package tests;

import base.BaseTests;
import pages.InfiniteScrollPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class InfiniteScrollTest extends BaseTests {

    @Test
    public void verifyInfiniteScroll () {

        InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage(driver);

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        // get number of paragraphs before scrolling
        int preScrollParagraphs = infiniteScrollPage.countParagraphs();

        // scroll down inifinite page ... ... ...
        infiniteScrollPage.scrollPage();

        // get number of paragraphs after infinite scroll
        int postScrollParagraphs = infiniteScrollPage.countParagraphs();

        // verify number of paragraphs after scroll > number of paragraphs start
        assertTrue (postScrollParagraphs > preScrollParagraphs);

    }
}
