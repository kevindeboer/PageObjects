package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Wrapper class to Selenium's WebDriver class.
 */
public abstract class Browser {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";

    private WebDriver driver;

    public Browser(){
        this.driver = this.getDriver();
    }

    protected abstract WebDriver getDriver();

    /**
     * Navigate to the given url.
     * @param url   The url to navigate to.
     */
    public void goToUrl(String url){
        driver.get(url);
    }

    /**
     * Find an element on the page.
     * @param locator   A selenium By instance pointing to the element.
     * @return          The WebElement that was found.
     */
    public WebElement vindElement(By locator){
        return this.driver.findElement(locator);
    }


    /**
     * Close the browser
     */
    public void close(){
        try{
            this.driver.close();
        }catch(NoSuchSessionException e){
            throw new IllegalStateException("This browser has already been closed.");
        }
    }
}
