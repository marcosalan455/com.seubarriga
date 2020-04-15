package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.network.model.DataReceived;

public class ResumoMensalAppObject {

    private WebDriver driver;

    public ResumoMensalAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement verificarExtrato() {
        return driver.findElement(By.cssSelector("a[href='/extrato']"));
    }

    public WebElement removerMovimentacao() {
        return driver.findElement(By.className("glyphicon-remove-circle"));
    }

    public WebElement selecionarMensagemDeSucesso() {
        return driver.findElement(By.className("alert-success"));
    }
}
