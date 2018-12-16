package stepdefinition.heroku;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import heroku.HomePageHeroku;
import heroku.RegistrationPageHeroku;
import org.junit.Assert;
import stepdefinition.SharedSD;

import java.util.Calendar;

public class ValidEmailSD {
    private HomePageHeroku homePageHeroku = new HomePageHeroku();
    private RegistrationPageHeroku registrationPageHeroku = new RegistrationPageHeroku();

    @When("^I  enter name as (.+) email as \"([^\"]*)\" password as (.+)$")
    public void iEnterNameEmailPassword(String name, String email, String password) {
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getNameTextField(), name);
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getEmailTextField(),  Calendar.getInstance().get(Calendar.MILLISECOND) + email);
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getPasswordTextField(), password);
    }

    @Then("^I am signed-in as a new user$")
    public void iAmSignedInAsNewUser() {
        String textFromElement = this.registrationPageHeroku.getTextFromElement(this.registrationPageHeroku.getListHeader());
        Assert.assertTrue(textFromElement.contains("Selling") && textFromElement.contains("Buying"));
    }

}
