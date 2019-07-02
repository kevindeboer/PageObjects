
import browser.Browser;
import navigation.Via;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TweakersHome extends TweakersPage {

    private By priceWatchLink = By.xpath("//a[text()='Pricewatch']");
    private By acceptCookiesButton = By.xpath("//form[@id='cookieAcceptForm']//button");

    public TweakersHome(Browser browser) {
        super(browser);
    }

    @Override
    public String getUrl() {
        return this.baseUrl;
    }

    public void acceptCookies(){
        WebElement acceptCookiesButton = this.browser.vindElement(this.acceptCookiesButton);
        acceptCookiesButton.click();
    }

    public TweakersPricewatch goToPricewatch(){
        TweakersPricewatch tweakersPricewatch = new TweakersPricewatch(this.browser);
        return tweakersPricewatch.goToPage(Via.click(this.priceWatchLink));
    }
}
