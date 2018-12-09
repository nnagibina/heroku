package stepdefinition.heroku;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import heroku.HomePageHeroku;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

public class SearchSD {

    private HomePageHeroku homePageHeroku = new HomePageHeroku();

    @Given("^I am on home page of heroku$")
    public void iAmOnHomePageOfHeroku() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Threely Starter Template");
    }

    @When("^I search on top search bar with text (.+)$")
    public void iSearchOnTopSearchBarWithText(String text) throws InterruptedException {
        homePageHeroku.clearBar(homePageHeroku.getSearchBar());
        homePageHeroku.sendText(homePageHeroku.getSearchBar(), text);
        Thread.sleep(2000);
    }

    @Then("^I verify (.+) as displayed result$")
    public void iVerifyAsDisplayedResult(String text) {

        Assert.assertEquals(homePageHeroku.getTextFromElement(homePageHeroku.getListBox()), text);
    }

}

