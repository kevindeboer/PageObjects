package page;

import browser.Browser;
import navigation.Navigator;

/**
 * Base class for page objects.
 */
public abstract class Page {

    protected Browser browser;

    public Page(Browser browser){
        this.browser = browser;
    }

    public abstract String getUrl();

    public <T extends Page> T goToPage(Navigator navigator){
        navigator.navigate(this.browser);
        return (T)this;
    }
}
