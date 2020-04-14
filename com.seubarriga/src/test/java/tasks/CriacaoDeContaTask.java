package tasks;

import appobjects.CriacaoDeContaAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CriacaoDeContaTask {

    private WebDriver driver;

    private CriacaoDeContaAppObject criacaoDeContaAppObject;

    public  CriacaoDeContaTask(WebDriver driver) {
        this.driver = driver;
        this.criacaoDeContaAppObject = new CriacaoDeContaAppObject(driver);
    }

    public void criarConta() {
        criacaoDeContaAppObject.acessarMenuContas().click();
        criacaoDeContaAppObject.adicionarConta().click();
        criacaoDeContaAppObject.digitarNomeConta().sendKeys("Mateus");
        String atual = criacaoDeContaAppObject.selecionarMensagemDeSucesso().getText();
        String expected = "Conta adicionada com sucesso!";
        System                .out.println(atual);
        Assertions.assertEquals(expected, atual);
        criacaoDeContaAppObject.salvar().click();
    }

}

