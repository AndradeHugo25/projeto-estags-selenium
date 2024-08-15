package teoricas.selenium.integracao_cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExemploPages {

    public ExemploPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "username")
    public WebElement campoLogin;

    @FindBy(how = How.NAME, using = "password")
    public WebElement campoSenha;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botaoEntrar;
}
