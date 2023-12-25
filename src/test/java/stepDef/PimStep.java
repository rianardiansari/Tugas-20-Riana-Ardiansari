package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pages.PimPage;

public class PimStep {
    PimPage pimPage;

    public PimStep() {
        this.pimPage = new PimPage();
    }

    @And("user click pim menu")
    public void userClickPimMenu() {pimPage.userClickPimMenu();}

    @And("user click add employee button")
    public void userClickAddEmployeeButton() {pimPage.userClickAddEmployeeButton();}

    @And("user input first name {string}")
    public void userInputFirstName(String FirstName) {pimPage.userInputFirstName(FirstName);}

    @And("user input last name {string}")
    public void userInputLastName(String LastName) {pimPage.userInputLastName(LastName);}

    @And("user click save button")
    public void userClickSaveButton() {pimPage.userClickSaveButton();}

    @Then("successful message show")
    public void successfulMessageShow() {pimPage.successfulMessageShow();}

    @And("personal detail show")
    public void personalDetailShow() {pimPage.personalDetailShow();}

    @Then("required message show")
    public void requiredMessageShow() {pimPage.requiredMessageShow();}

}