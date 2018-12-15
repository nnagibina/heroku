package stepdefinition.heroku;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import heroku.HomePageHeroku;
import heroku.RegistrationPageHeroku;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepdefinition.SharedSD;

import javax.swing.*;


public class InvalidEmailSD {
    private HomePageHeroku homePageHeroku = new HomePageHeroku();
    private RegistrationPageHeroku registrationPageHeroku = new RegistrationPageHeroku();

    @Given("^I am on Registration page$")
    public void iAmOnRegistrationPage() {
        homePageHeroku.clickOnJoinButton();
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Threely Starter Template");
    }

    @When("^I enter name as (.+) email as \"([^\"]*)\" password as (.+)$")
    public void iEnterNameEmailPassword(String name, String email, String password) {
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getNameTextField(), name);
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getEmailTextField(), email);
        this.registrationPageHeroku.sendText(this.registrationPageHeroku.getPasswordTextField(), password);
    }

    @And("^I click (.+) button$")
    public void iClickButton(String button) {
        switch (button) {
            case "submit":
                this.registrationPageHeroku.clickOn(this.registrationPageHeroku.getSubmitButton());
                this.registrationPageHeroku.clickOn(this.registrationPageHeroku.getSubmitButton());
                break;
        }
    }

    @Then("^I verify invalid email address$")
    public void iVerifyInvalidEmailAddress() {

        WebElement element = SharedSD.getDriver().findElement(By.xpath("/html/head"));
        String toolTipText = element.getAttribute("title");

        Actions actions = new Actions(SharedSD.getDriver());

        String title = SharedSD.getDriver().findElement(this.registrationPageHeroku.getBody()).getAttribute("title");
        System.out.println(title);


    }

}
