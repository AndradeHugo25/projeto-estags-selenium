package teoricas.selenium.complementos.classes;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Teclado {

    public static void main(String[] args) throws AWTException, InterruptedException {
        final Keys ENTER = Keys.ENTER;
        final String CTRL_A_DELETE = Keys.chord(Keys.CONTROL, "a", Keys.DELETE);

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/ncr");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("python" + ENTER);
        Thread.sleep(2000);

        WebElement elemento = driver.findElement(By.id("APjFqb"));

        elemento.sendKeys(CTRL_A_DELETE);
        Thread.sleep(2000);
        elemento.sendKeys("macarrão" + Keys.ENTER);

        Thread.sleep(2000);
        driver.quit();
    }

}
