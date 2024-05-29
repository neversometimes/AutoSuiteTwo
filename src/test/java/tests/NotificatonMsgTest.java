package tests;

import base.BaseTests;
import pages.NotificationMsgPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NotificatonMsgTest extends BaseTests {

    @Test
    public void verifyNotificationMsgs() {

        NotificationMsgPage notificationMsgPage = new NotificationMsgPage(driver);

        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

        // click link to target page (generates notification message top of page)
        notificationMsgPage.clickLoadNewMsgLink();

        // verfiy notification message is displayed
        assertTrue(notificationMsgPage.isNotificationMsgDisplayed());

        // *** NOTE ***
        // Not possible to verify the message text
    }
}
