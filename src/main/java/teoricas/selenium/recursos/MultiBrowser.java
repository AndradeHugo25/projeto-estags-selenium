package teoricas.selenium.recursos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class MultiBrowser {

    public WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setBrowser(String browser)
    {
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    public void exemplo() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}

