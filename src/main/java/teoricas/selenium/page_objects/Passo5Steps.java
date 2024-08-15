package teoricas.selenium.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Passo5Steps {

    public static void main(String[] args) throws InterruptedException, IOException {
        //inicializando driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        //instanciando nova page
        Passo5Page page = new Passo5Page(driver);

        //suite tests
        login(page);
        logout();

        //utilizando page nas regras de negócio


        //finalizando testes
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    public static void login(Passo5Page page) throws InterruptedException {
        page.campoLogin.sendKeys("Admin");
        page.campoSenha.sendKeys("admin123");
        page.botaoEntrar.click();
        Thread.sleep(2000);
    }

    public static void logout() {

    }

}
