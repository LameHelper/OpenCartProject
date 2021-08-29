package interactions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import interactions.steps.HomePageSteps;


public class HomeStepDefinitions {

    @Steps
    HomePageSteps homePageSteps;

    @When("he click on his cart")
    public void heClickOnHisCart() {
        homePageSteps.clickCartButton();
    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePageSteps.openHome();
    }

    @Then("user sees that his cart is empty")
    public void heSeesThatHisCartIsEmpty() {
        homePageSteps.verifyCartDropdownIsOpened();

    }
}
