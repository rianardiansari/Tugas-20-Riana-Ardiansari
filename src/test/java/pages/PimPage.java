package pages;

import org.openqa.selenium.By;

import java.time.Duration;

import static helper.Utility.driver;

public class PimPage {

    By pim_link = By.xpath("//a[@href = '/web/index.php/pim/viewPimModule']");

    By add_employee_link = By.xpath("//a[text() = 'Add Employee']");

    By input_firstname = By.name("firstName");

    By input_lastname = By.name("lastName");

    By save_button = By.xpath("//button[@type = 'submit']");

    By successful_message = By.xpath("//*[text() = 'Successfully Saved']");

    By personal_detail = By.xpath("//*[text() = 'Personal Details']");

    By required_message = By.xpath("//*[text() = 'Required']");

    public void userClickPimMenu(){
        driver.findElement(pim_link).click();
    }

    public void userClickAddEmployeeButton(){
        driver.findElement(add_employee_link).click();
    }

    public void userInputFirstName(String firstname) {driver.findElement(input_firstname).sendKeys(firstname);}

    public void userInputLastName(String lastname) {driver.findElement(input_lastname).sendKeys(lastname);}

    public void userClickSaveButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //add delay
        driver.findElement(save_button).click();
    }

    public void successfulMessageShow(){driver.findElement(successful_message).isDisplayed();}

    public void personalDetailShow(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //add delay
        driver.findElement(personal_detail).isDisplayed();
    }

    public void requiredMessageShow(){driver.findElement(required_message).isDisplayed();}

}
