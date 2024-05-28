package tests;

import base.BaseTests;
import pages.JSAlertsPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class JSAlertsTest extends BaseTests {

    // alerts, confirm, prompts
    @Test
    public void verifyJSAlert() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        // click JS Alert button and verify alert text
        assertEquals(jsAlertsPage.clickAlertBtn(), "I am a JS Alert");

        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You successfully clicked an alert");

    }

    @Test
    public void verifyJSConfirm() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        // click JS Confirm button, verify Confirm text and click cancel
        assertEquals(jsAlertsPage.clickConfirmCancelBtn(), "I am a JS Confirm");
        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You clicked: Cancel");


        //click JS Confirm button, verify Confirm text and click OK
        assertEquals(jsAlertsPage.clickConfirmOKBtn(), "I am a JS Confirm");

        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You clicked: Ok");

    }

    @Test
    public void verifyJSPrompt() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        // click JS Prompt button, verify Prompt text and click cancel
        assertEquals(jsAlertsPage.clickPromptCancelBtn(), "I am a JS prompt");

        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You entered: null");

        // click JS Prompt button, verify Prompt text and click OK
        assertEquals(jsAlertsPage.clickPromptOKBtn(""), "I am a JS prompt");

        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You entered:");

        // click JS Prompt button, verify Prompt text and enter text then OK
        assertEquals(jsAlertsPage.clickPromptOKBtn("Once more with feeling!"), "I am a JS prompt");

        // verify result text
        assertEquals(jsAlertsPage.getResultText(), "You entered: Once more with feeling!");

    }

}
