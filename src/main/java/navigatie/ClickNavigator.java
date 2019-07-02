package navigatie;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Navigate through the browser by clicking on an element.
 */
public class ClickNavigator implements Navigator{

    private By locator;

    public ClickNavigator(By locator){
        this.locator = locator;
    }

    @Override
    public void navigate(Browser browser) {
        WebElement element = browser.vindElement(locator);
        element.click();
    }
}
