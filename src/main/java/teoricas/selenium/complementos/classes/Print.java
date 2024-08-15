package teoricas.selenium.complementos.classes;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Print {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/checkout-step-two.html");

        printarTela(driver);

        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    public static void printarTela(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/main/java/teoricas/selenium/complementos/evidencia/print.png"));
    }

}
