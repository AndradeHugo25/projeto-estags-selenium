package teoricas.selenium.integracao_cucumber.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BasicoSteps {

    @Dado("que o usuário esteja na tela de login")
    public void estarNaTelaLogin() {
        //implementação do acesso a tela de login
    }

    @Quando("enviar dados válidos de login")
    public void enviarDadosValidos() {
        //implementação do envio de dados válidos
    }

    @Então("sistema exibe tela home")
    public void validarTelaHome() {
        //implementação da validação da exibição da home
    }

}


