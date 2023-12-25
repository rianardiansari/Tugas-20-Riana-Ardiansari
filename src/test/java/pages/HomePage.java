package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By home_page = By.xpath("//*[text() = 'Dashboard']");

    public void assert_show_sidebar_dashboard(){
        driver.findElement(home_page).isDisplayed();
    }

}
