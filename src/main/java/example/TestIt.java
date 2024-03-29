package example;

import browser.Browser;
import browser.BrowserFactory;
import navigation.Via;

public class TestIt {

    public static void main(String[] args){

        BrowserFactory factory = new BrowserFactory();
        Browser chrome = factory.openBrowser(Browser.CHROME);

        TweakersHome tweakersHome = new TweakersHome(chrome);
        tweakersHome.goToPage(Via.url(tweakersHome.getUrl()));
        tweakersHome.acceptCookies();
        TweakersPricewatch pricewatch = tweakersHome.goToPricewatch();

        factory.closeAllBrowsers();
    }


}
