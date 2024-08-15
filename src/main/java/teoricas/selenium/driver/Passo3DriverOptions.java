package teoricas.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Passo3DriverOptions {

    public static void main(String[] args) throws IOException {
        //Inicializando options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--window-size=800,600");
        options.addArguments("--start-maximized");
        options.addArguments("--headless");

        //Inicializando driver com options
        WebDriver driver = new ChromeDriver(options);

        //Prosseguindo com os testes
        driver.get("https://www.globo.com/");
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
