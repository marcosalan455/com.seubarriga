package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcluirContaAppObject {

    private WebDriver driver;

    public ExcluirContaAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement acessarMenuContas() {
        return driver.findElement(By.className("dropdown-toggle"));
    }

    public WebElement listarContas() {
        return driver.findElement(By.cssSelector("a[href='/contas']"));
    }

    public WebElement removerContaAtual() {
        return driver.findElement(By.className("glyphicon-remove-circle"));
    }

    public WebElement selecionarMensagemDeSucesso() {
        return driver.findElement(By.className("alert-success"));
    }

    public WebElement deslogar() {
        return driver.findElement(By.cssSelector("a[href='/logout']"));
    }

}
