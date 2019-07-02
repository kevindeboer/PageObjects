package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Wrapper class to Selenium's ChromeDriver class.
 */
public class Chrome extends Browser {

    @Override
    protected WebDriver getDriver() {
        return new ChromeDriver();
    }
}
