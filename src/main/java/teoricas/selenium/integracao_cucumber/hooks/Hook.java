package teoricas.selenium.integracao_cucumber.hooks;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    public static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.out.println(">>> Iniciando execução!\n");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
        System.out.println("\n>>> Finalizando execução!");
    }

}

