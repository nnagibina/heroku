package stepdefinition.heroku;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import heroku.HomePageHeroku;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.List;

public class PostsSD {

    private HomePageHeroku homePageHeroku = new HomePageHeroku();

    @Then("^I verify (.+) total post is displayed$")
    public void iVerifyTotalPostsIsDisplayed(String text) {
        Assert.assertEquals(homePageHeroku.getElementsBySelector(homePageHeroku.getSectionContent()).size(), Integer.parseInt(text));
    }

    @And("^I verify all post has price tag$")
    public void iVerifyAllPostsHasPriceTag() {
        boolean isPrice = true;
        for (WebElement e : homePageHeroku.getElementsBySelector(homePageHeroku.getSectionContentH3())) {
            if (!e.getText().contains("$")){
                isPrice = false;
                break;
            }
        }
        Assert.assertTrue(isPrice);
    }

    @And("^I verify all post has title$")
    public void iVerifyAllPostsHasTitle() {
        boolean isTitle = true;
        for (WebElement e : homePageHeroku.getElementsBySelector(homePageHeroku.getSectionContentH4())) {
            if (e.getText().equals("")) {
                isTitle = false;
                break;
            }
        }
        Assert.assertTrue(isTitle);
    }

    @And("^I verify all post has displayed image$")
    public void iVerifyAllPostsHasDisplayedImage() {
        List<WebElement> elementsBySelectorImg = homePageHeroku.getElementsBySelector(homePageHeroku.getSectionContentImg());
        List<WebElement> elementsBySelector = homePageHeroku.getElementsBySelector(homePageHeroku.getSectionContent());
        Assert.assertEquals(elementsBySelector.size(), elementsBySelectorImg.size());
    }
}
