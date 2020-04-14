package tasks;

import appobjects.LoginAppObject;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;

    private LoginAppObject loginAppObject;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.loginAppObject = new LoginAppObject(driver);
    }

    public void logar() {
        loginAppObject.digitarEmail().sendKeys("marcos38alan@gmail.com");
        loginAppObject.digitarPassword().sendKeys("13159900");
        loginAppObject.logar().click();
    }
}
