package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class LoginAppObject {

    private WebDriver driver;

    public LoginAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement digitarEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement digitarPassword() {
        return driver.findElement(By.id("senha"));
    }

public WebElement logar() {
        return driver.findElement(By.className("btn-primary"));
}

}

