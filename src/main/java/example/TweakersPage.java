package example;

import browser.Browser;
import page.Page;

public abstract class TweakersPage extends Page {

    protected String baseUrl = "https://tweakers.net/";

    public TweakersPage(Browser browser) {
        super(browser);
    }
}
