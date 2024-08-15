package teoricas.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Passo2Driver {

    public static void main(String[] args) throws IOException {
        //Após selenium 4.11.0, basta uma linha para inicializar o driver
        WebDriver driver = new ChromeDriver();

//        //Exemplos de ações com o driver
        driver.get("https://www.globo.com/");
        driver.manage().window().maximize();
        driver.quit();

//        //Opcional
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

}
