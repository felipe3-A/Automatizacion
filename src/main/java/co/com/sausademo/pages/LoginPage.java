package co.com.sausademo.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPage extends PageObject {
   By INPUT_USER = By.xpath("//input[@id='user-name']"); //Esta variable almacena el input de usuario
    By INPUT_PASSWORD = By.xpath("//input[@id='password']");
    By BUTTON_LOGIN = By.xpath("//input[@id='login-button']");

    public By getINPUT_USER() {
        return INPUT_USER;
    }

    public void setINPUT_USER(By INPUT_USER) {
        this.INPUT_USER = INPUT_USER;
    }

    public By getINPUT_PASSWORD() {
        return INPUT_PASSWORD;
    }

    public void setINPUT_PASSWORD(By INPUT_PASSWORD) {
        this.INPUT_PASSWORD = INPUT_PASSWORD;
    }

    public By getBUTTON_LOGIN() {
        return BUTTON_LOGIN;
    }

    public void setBUTTON_LOGIN(By BUTTON_LOGIN) {
        this.BUTTON_LOGIN = BUTTON_LOGIN;
    }
}
