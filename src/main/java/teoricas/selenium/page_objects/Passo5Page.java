package teoricas.selenium.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Passo5Page {

    public Passo5Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "username")
    public WebElement campoLogin;

    @FindBy(how = How.NAME, using = "password")
    public WebElement campoSenha;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botaoEntrar;

    @FindBy(how = How.NAME, using = "blabla")
    public WebElement toast;

}






