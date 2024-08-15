package teoricas.selenium.comandos_basicos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import system.tools.configuration.PropertiesLoader;

import java.io.IOException;
import java.util.Properties;

public class Passo4ComandosBasicos {

    public static void main(String[] args) throws IOException, InterruptedException {
        Properties propriedades = PropertiesLoader.inicializarProperties("config.properties");
        final String URL = propriedades.getProperty("url");

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(3000);


        //Preencher valor no campo do elemento
        driver.findElement(By.name("username")).sendKeys("Login qualquer");

        //Limpar o campo do elemento
        driver.findElement(By.name("username")).clear();

        //Clicar no elemento
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //Logar
        driver.findElement(By.name("username")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);

        //Capturar texto do elemento
        String texto = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
        System.out.println("Usuário logado: " + texto);

        //Acessar outra aplicação para exemplo da combo
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");
        Thread.sleep(2000);

        //Selecionar o primeiro item da combo
        WebElement combo = driver.findElement(By.name("selectomatic"));
        Select selecao = new Select(combo);
        selecao.selectByIndex(1);

        //finalizando testes
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

}
