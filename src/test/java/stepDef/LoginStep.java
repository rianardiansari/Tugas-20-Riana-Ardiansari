package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;

    public LoginStep() {
        this.loginPage = new LoginPage();
    }

    @Given("user go to login page")
    public void userGoToLoginPage() {
        loginPage.goToLoginPage();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input pwd {string}")
    public void userInputPwd(String pwd) {
        loginPage.inputPwd(pwd);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        loginPage.clickBtnLogin();
    }

    @Then("error message shows {string}")
    public void loginFailedShow(String errorMessage) {
        loginPage.assert_login_failed_show(errorMessage);
    }
}