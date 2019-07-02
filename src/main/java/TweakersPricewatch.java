import browser.Browser;

public class TweakersPricewatch extends TweakersPage {

    public TweakersPricewatch(Browser browser) {
        super(browser);
    }

    @Override
    public String getUrl() {
        return this.baseUrl + "/pricewatch/";
    }
}
