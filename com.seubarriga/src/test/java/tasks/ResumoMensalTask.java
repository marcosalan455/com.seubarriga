package tasks;

import appobjects.ResumoMensalAppObject;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.engine.support.descriptor.FileSystemSource;
import org.openqa.selenium.WebDriver;

public class ResumoMensalTask {

    private WebDriver driver;

    private ResumoMensalAppObject resumoMensalAppObject;

    public ResumoMensalTask(WebDriver driver) {
        this.driver = driver;
        this.resumoMensalAppObject = new ResumoMensalAppObject(driver);
    }

    public void excluirResumoMensal() {
        resumoMensalAppObject.removerMovimentacao().click();
        resumoMensalAppObject.verificarExtrato().click();
        String atual = resumoMensalAppObject.selecionarMensagemDeSucesso().getText();
        String expected = "Movimentação removida com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);
    }
}
