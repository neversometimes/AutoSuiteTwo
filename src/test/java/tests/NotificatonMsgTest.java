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

        // verify notification message is displayed
        assertTrue(notificationMsgPage.isNotificationMsgDisplayed());

        // verify notification message is not blank
        assertFalse(notificationMsgPage.isNotificationMsgBlank());

    }
}
