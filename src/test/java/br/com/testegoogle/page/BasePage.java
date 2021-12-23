package br.com.testegoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para a criação das novas peges.
 * Todas as paginas devm ser herdadas desta classe.
 */
public abstract class BasePage {

    /**Driver base que será usado pelas pages */
    protected WebDriver driver;

    /**
     * Construtor base para criação da fabrica de elementos (PageFactory).
     * @param driver Driver da página atual.
     */
    protected BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}
