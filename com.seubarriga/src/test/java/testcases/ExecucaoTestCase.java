package testcases;

import appobjects.CriacaoDeMovimentacaoAppObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.CriacaoDeContaTask;
import tasks.CriacaoDeMovimentacaoTask;
import tasks.LoginTask;
import tasks.ResumoMensalTask;

import java.util.concurrent.TimeUnit;

    public class ExecucaoTestCase {

    private WebDriver driver;

    private LoginTask loginTask;

    private CriacaoDeContaTask criacaoDeContaTask;

    private CriacaoDeMovimentacaoTask criacaoDeMovimentacaoTask;

    private ResumoMensalTask resumoMensalTask;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://seubarriga.wcaquino.me/login");
        this.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        this.loginTask = new LoginTask(driver);
        this.criacaoDeContaTask = new CriacaoDeContaTask(driver);
        this.criacaoDeMovimentacaoTask = new CriacaoDeMovimentacaoTask(driver);
        this.resumoMensalTask = new ResumoMensalTask(driver);
    }

    @Test
    public void executarTest() {
loginTask.logar();
criacaoDeContaTask.criarConta();
criacaoDeMovimentacaoTask.criarMovimentacao();
resumoMensalTask.excluirResumoMensal();
    }

    @AfterEach
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }

}
