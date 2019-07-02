package browser;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory to launch and close browsers.
 */
public class BrowserFactory {

    private List<Browser> instances = new ArrayList<>();

    public BrowserFactory(){
        //TODO hardcoded driver paths
        System.setProperty("webdriver.chrome.driver", "/Users/Kevin/Webdrivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/Kevin/Webdrivers/geckodriver");
    }

    /**
     * Open a new instance of a browser.
     * @param browserName   The name of the browser to launch.
     * @return              The new browser instance.
     */
    public Browser openBrowser(String browserName){
        if(browserName.equals(Browser.CHROME)){
            Browser instance = new Chrome();
            this.instances.add(instance);
            return instance;
        } else if(browserName.equals(Browser.FIREFOX)){
            Browser instance = new Firefox();
            this.instances.add(instance);
            return instance;
        }
        throw new IllegalArgumentException(String.format("No browser found for name: %s", browserName));
    }

    /**
     * Close all browsers that were launched through this factory.
     */
    public void closeAllBrowsers(){
        for(Browser instance : this.instances){
            instance.close();
        }
    }
}
