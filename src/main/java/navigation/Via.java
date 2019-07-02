package navigation;

import org.openqa.selenium.By;

/**
 * Navigator shortcuts for improved readability.
 */
public class Via {

    public static ClickNavigator click(By locator){
        return new ClickNavigator(locator);
    }

    public static UrlNavigator url(String url){
        return new UrlNavigator(url);
    }
}
