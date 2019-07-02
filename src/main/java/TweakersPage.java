import browser.Browser;

public abstract class TweakersPage extends Page {

    protected String baseUrl = "https://tweakers.net/";

    public TweakersPage(Browser browser) {
        super(browser);
    }
}
