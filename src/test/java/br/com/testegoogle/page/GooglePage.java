package br.com.testegoogle.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;


    /**
     * Construtor para criação da pagina de Google
     * @param driver Driver da pagina do Google
     */
    public GooglePage(WebDriver driver){
        super(driver);
    }

    /**
     * Metodo que irá efetuar uma pesquisa no google baseando no texto informado e concluindo com enter.
     * @param texto Texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa
     * @return
     */
    public String obterResultadoDaPesquisa(){
        return divResultadoPesquisa.getText();

    }

}
