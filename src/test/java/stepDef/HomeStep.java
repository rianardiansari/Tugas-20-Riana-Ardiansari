package stepDef;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStep {
    HomePage homePage;

    public HomeStep() {
        this.homePage = new HomePage();
    }

    @Then("user is on homepage")
    public void userIsOnHomePage() {
        homePage.assert_show_sidebar_dashboard();
    }

}