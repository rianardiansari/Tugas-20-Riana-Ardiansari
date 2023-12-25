package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static helper.Utility.driver;

public class LoginPage {

    By input_username = By.name("username");
    By input_pwd = By.name("password");
    By btn_login = By.xpath("//button[@type = 'submit']");
    By sidenav_my_indo = By.xpath("//*[text() = 'My Info']");


    public void goToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void inputUsername(String username) {driver.findElement(input_username).sendKeys(username);}

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin(){
        driver.findElement(btn_login).click();
    }

    public void assert_login_failed_show(String errorMessage){
        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
