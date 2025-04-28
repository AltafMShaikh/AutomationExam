package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\amsha\\Desktop\\qa-automation-tests\\Driver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            BasePage.initDriver(driver);  // 🔥 initialize once here
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
