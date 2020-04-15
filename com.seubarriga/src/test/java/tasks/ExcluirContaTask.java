package tasks;

import appobjects.ExcluirContaAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ExcluirContaTask {

    private WebDriver driver;

    private ExcluirContaAppObject excluirContaAppObject;

    public ExcluirContaTask(WebDriver driver) {
        this.driver = driver;
        this.excluirContaAppObject = new ExcluirContaAppObject(driver);
    }

    public void removerContaAtual() {
        excluirContaAppObject.acessarMenuContas().click();
        excluirContaAppObject.listarContas().click();
        excluirContaAppObject.removerContaAtual().click();
        String atual = excluirContaAppObject.selecionarMensagemDeSucesso().getText();
        String expected = "Conta removida com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);
        excluirContaAppObject.deslogar().click();
    }
}
