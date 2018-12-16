package heroku;

import org.openqa.selenium.By;

public class RegistrationPageHeroku extends BasePageHeroku {
    private By pageHeader = By.xpath("//*[@id='bs-example-navbar-collapse-1']");

    private By emailTextField = By.name("email");

    private By passwordTextField = By.name("password");

    private By nameTextField = By.name("username");

    private By submitButton = By.xpath("/html/body/div/div/div/form/button");

    private By listHeader = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul");

    public By getPageHeader() {
        return pageHeader;
    }

    public By getEmailTextField() {
        return emailTextField;
    }

    public By getPasswordTextField() {
        return passwordTextField;
    }

    public By getNameTextField() {
        return nameTextField;
    }

    public By getSubmitButton() {
        return submitButton;
    }

    public By getListHeader() {
        return listHeader;
    }
}
