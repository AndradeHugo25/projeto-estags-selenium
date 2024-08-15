package teoricas.selenium.complementos.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class MouseParaElemento {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();

        WebElement elemento = driver.findElement(By.xpath("mapElemento"));

        Actions action = new Actions(driver);
        action.click(elemento).perform();


        moverMouseParaElemento();
    }

    public static void moverMouseParaElemento() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/ncr");
        driver.manage().window().maximize();

        //botão I'm Feeling Lucky do google
        WebElement elemento = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));

        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.click(elemento).perform();

        Thread.sleep(3000);

        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

}
