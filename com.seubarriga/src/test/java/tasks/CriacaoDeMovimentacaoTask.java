package tasks;

import appobjects.CriacaoDeContaAppObject;
import appobjects.CriacaoDeMovimentacaoAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CriacaoDeMovimentacaoTask {

    private WebDriver driver;

    private CriacaoDeMovimentacaoAppObject criacaoDeMovimentacaoAppObject;

    public CriacaoDeMovimentacaoTask(WebDriver driver) {
        this.driver = driver;
        this.criacaoDeMovimentacaoAppObject = new CriacaoDeMovimentacaoAppObject(driver);
    }

    public Void criarMovimentacao() {
        criacaoDeMovimentacaoAppObject.criarMovimentacao().click();
        criacaoDeMovimentacaoAppObject.digitarDataDaMovimentacao().sendKeys("14/04/2020");
                criacaoDeMovimentacaoAppObject.digitarDataDoPagamento().sendKeys("14/04/2020");
        criacaoDeMovimentacaoAppObject.digitarDescricao().sendKeys("valor a ser pago");
                criacaoDeMovimentacaoAppObject.digitarValorSomenteNumeros().sendKeys("1000");
        criacaoDeMovimentacaoAppObject.digitarNomeInteressado().sendKeys("Alan");
        String atual = criacaoDeMovimentacaoAppObject.selecionarMensagemDeSucesso().getText();
        String expected = "Movimentação adicionada com sucesso!";
        System.out.println(atual);
        Assertions.assertEquals(expected, atual);
        criacaoDeMovimentacaoAppObject.Salvar().click();
    }
}
