package br.com.testegoogle.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class BaseTest {

    protected static WebDriver driver;
    private  static final String URL_BASE = "https://www.google.com/";
    private static final String CAMINHO_DRIVER = "src/test/java/br/com/testegoogle/resources/chromedriver.exe";
    
    @BeforeClass
    private static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    private static void finalizar(){
        driver.quit();
    }

}
