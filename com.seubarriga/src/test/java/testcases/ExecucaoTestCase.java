package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.LoginTask;

import java.util.concurrent.TimeUnit;

public class ExecucaoTestCase {

    private WebDriver driver;

    private LoginTask loginTask;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://seubarriga.wcaquino.me/login");
        //this.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        this.loginTask = new LoginTask(driver);
    }

    @Test
    public void executarTest() {
loginTask.logar();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            //driver.quit();
        }

    }

}
