package interactions.steps;

import net.thucydides.core.annotations.Step;
import pages.HomePageView;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageSteps {
    HomePageView homePageView;

    @Step("Open homepage")
    public void openHome() {
        homePageView.openHomePage();
    }

    @Step("click cart button")
    public void clickCartButton() {
        homePageView.openCartDropdown();
    }

    public void verifyCartDropdownIsOpened() {
        assertThat("The dropdown was not opened", homePageView.isDropdownOpened(), is(true));
    }
}
