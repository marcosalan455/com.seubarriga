package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriacaoDeContaAppObject {

    private WebDriver driver;

    public CriacaoDeContaAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement acessarMenuContas() {
        return driver.findElement(By.className("dropdown-toggle"));
    }

    public WebElement adicionarConta() {
        return driver.findElement(By.cssSelector("a[href='/addConta']"));
    }

    public WebElement digitarNomeConta() {
        return driver.findElement(By.id("nome"));
    }

    public WebElement salvar() {
        return driver.findElement(By.className("btn-primary"));
    }

    public WebElement selecionarMensagemDeSucesso() {
        return  driver.findElement(By.className("alert-success"));
    }

}
