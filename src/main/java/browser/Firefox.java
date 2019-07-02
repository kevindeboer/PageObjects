package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Wrapper class to Selenium's FirefoxDriver class.
 */
public class Firefox extends Browser {

    @Override
    protected WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
