package teoricas.selenium.integracao_cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class RecursosHooks {
    public static WebDriver driver;

    @Before("@regressao or @smoke")
    public void before(Scenario cenario) {
        System.out.println("...Iniciando configuração específica do cenário");
        System.out.println("\tCenário: " + cenario.getName());
    }

    @After("@smoke")
    public void after() {
        System.out.println("...Finalizando configuração específica do cenário");
    }

    @Before("@edit")
    public void beforeEdit() {
        System.out.println("\t\tVAI PASSAR PELA EDIÇÃO!");
    }

    @After("@edit")
    public void afterEdit() {
        System.out.println("\t\tPASSOU PELA EDIÇÃO!");
    }
}
