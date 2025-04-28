package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static WebDriver driver;

    public static void initDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
