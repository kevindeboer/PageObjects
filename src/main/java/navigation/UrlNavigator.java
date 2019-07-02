package navigation;

import browser.Browser;

/**
 * Navigate through the browser using a url.
 */
public class UrlNavigator implements Navigator {

    private String url;

    public UrlNavigator(String url){
        this.url = url;
    }

    @Override
    public void navigate(Browser browser) {
        browser.goToUrl(this.url);
    }
}
