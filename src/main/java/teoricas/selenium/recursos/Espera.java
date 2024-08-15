package teoricas.selenium.recursos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class Espera {

    private static final String MAP_ELEMENTO = "//*[@id=\"isl_1\"]/div[2]/div/div[1]/div/g-inner-card/div/g-link/a/div[2]/div[1]";

    public static void main(String[] args) throws InterruptedException, IOException {
        esperaImplicita();
        esperaImplicitaComErro();
        esperaExplicita();
        waitUsingThread();
    }

    // Implicit Wait
    public static void esperaImplicita() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("macarrão" + Keys.ENTER);

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));
        WebElement elemento = driver.findElement(By.xpath(MAP_ELEMENTO));
        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        System.out.println(elemento.getText());
        driver.quit();
    }

    // Implicit Wait Com Erro
    public static void esperaImplicitaComErro() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("macarrão" + Keys.ENTER);

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        WebElement elemento = null;
        try {
            elemento = driver.findElement(By.xpath("qualquer coisa"));
        } catch (Exception e) {
            System.out.println("Não achou o danado!");
            driver.quit();
        }

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));
    }

    // Explicit Wait
    public static void esperaExplicita() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/ncr");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macarrão" + Keys.ENTER);

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MAP_ELEMENTO)));

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        System.out.println(elemento.getText());
        driver.quit();
    }

    // Thread
    public static void waitUsingThread() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("macarrão" + Keys.ENTER);

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        Thread.sleep(6000);
        WebElement elemento = driver.findElement(By.xpath(MAP_ELEMENTO));

        System.out.println(Log.getDataAtualFormatada("HH:mm:ss.SSS"));

        System.out.println(elemento.getText());
        driver.quit();
    }
}
