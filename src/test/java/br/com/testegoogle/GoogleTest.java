package br.com.testegoogle;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.testegoogle.page.GooglePage;


public class GoogleTest extends BaseTest{

    private static GooglePage googlePage;

    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePage(driver);
    }
 
    @Test
    public void TC001_devePesquisarNoGoogleOTextoBatataFrita(){

   
        googlePage.pesquisar("batata frita");

        String resultado = googlePage.obterResultadoDaPesquisa();
        assertTrue(resultado, resultado.contains("Aproximadamente"));
    }

    @Test
    public void TC002_devePesquisarNoGoogleOTextoBatataFrita(){

   
        googlePage.pesquisar("batata frita");

        String resultado = googlePage.obterResultadoDaPesquisa();
        assertTrue(resultado, resultado.contains("resultado"));
    }

    @Test
    public void TC003_devePesquisarNoGoogleOTextoSorveteDeMorango(){

        googlePage.pesquisar("sorvete de morango");

        String resultado = googlePage.obterResultadoDaPesquisa();
        assertTrue(resultado, resultado.contains("Aproximadamente"));
    }

    @Test
    public void TC004_devePesquisarNoGoogleOTextoSorveteDeMorango(){

        googlePage.pesquisar("sorvete de morango");

        String resultado = googlePage.obterResultadoDaPesquisa();
        assertTrue(resultado, resultado.contains("resultados"));
    }
}


