package teoricas.selenium.complementos.classes;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintComData {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/checkout-step-two.html");

        printarTela(driver);

        //login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        printarTela(driver);

        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    public static void printarTela(WebDriver driver) throws IOException {
        String data = getDataAtualFormatada("yyyy_MM_dd HH-mm-ss");

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/main/java/teoricas/selenium/complementos/evidencia/" + data + ".png"));
    }

    // Data e Hora
    public static String getDataAtualFormatada(String formato) {
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formatadorData = new SimpleDateFormat(formato);
        return formatadorData.format(calendario.getTime());
    }
}
