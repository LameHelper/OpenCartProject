package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("http://opencart.abstracta.us")
public class HomePageView extends PageObject {

    @FindBy(id = "cart")
    WebElementFacade cartButton;

    public void openHomePage() {
        open();
    }

    public void openCartDropdown() {
        cartButton.waitUntilClickable().click();
    }

    public boolean isDropdownOpened() {
        return cartButton.getAttribute("class").equals("btn-group btn-block open");
    }
}
