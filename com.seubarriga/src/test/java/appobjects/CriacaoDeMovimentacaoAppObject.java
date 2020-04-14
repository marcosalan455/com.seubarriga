package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.network.model.DataReceived;

public class CriacaoDeMovimentacaoAppObject {

    private WebDriver driver;

    public CriacaoDeMovimentacaoAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement criarMovimentacao() {
        return driver.findElement(By.cssSelector("a[href='/movimentacao']"));
    }

   public WebElement digitarDataDaMovimentacao() {
        return driver.findElement(By.id("data_transacao"));
   }

   public WebElement digitarDataDoPagamento() {
        return driver.findElement(By.id("data_pagamento"));
   }

   public WebElement digitarDescricao() {
        return driver.findElement(By.id("descricao"));
   }

   public WebElement digitarNomeInteressado() {
        return driver.findElement(By.id("interessado"));
   }

   public WebElement digitarValorSomenteNumeros() {
        return driver.findElement(By.id("valor"));
   }

   public WebElement Salvar() {
        return driver.findElement(By.className("btn-primary"));
   }

   public WebElement selecionarMensagemDeSucesso() {
        return driver.findElement(By.className("alert-success"));
   }
}

