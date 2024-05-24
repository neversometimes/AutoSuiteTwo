package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userName = By.id("user-name");
    private By passwordField = By.id("password");
    private By logInButton =
            By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String user, String password) {
        driver.findElement(userName).sendKeys(user);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).click();
        return new HomePage(driver);
    }
}
