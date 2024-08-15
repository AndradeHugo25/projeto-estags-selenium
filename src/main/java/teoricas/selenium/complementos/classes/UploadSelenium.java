package teoricas.selenium.complementos.classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class UploadSelenium {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        File arq = new File("src/main/java/teoricas/selenium/complementos/classes/files/arquivo.png");

        driver.findElement(By.id("file-upload")).sendKeys(arq.getAbsolutePath());
        driver.findElement(By.id("file-submit")).submit();

        Thread.sleep(3000);

        if (driver.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        } else {
            System.out.println("file not uploaded");
        }

        driver.quit();
    }

}
