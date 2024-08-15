package teoricas.selenium.integracao_cucumber.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PassagemParametrosSteps {

    @Dado("que o usuário esteja na tela de pesquisa")
    public void estarNaTelaPesquisa() {
        //implementação do acesso a tela de pesquisa
    }

    @Quando("pesquisar usuário pelo nome {string}")
    public void pesquisarUsuarioNome(String nomeDesejado) {
        System.out.println(nomeDesejado);
    }

    @Então("sistema exibe resultado da pesquisa")
    public void validarResultadoPesquisa() {
        //implementação da validação da exibição da home
    }

    @Quando("pesquisar usuário pelo idade aproximada de {int}")
    public void pesquisarUsuarioIdadeAproximada(int idade) {
        int menor, maior;
        menor = idade - 1;
        maior = idade + 1;
        System.out.println("Pesquisa de usuário com idade entre " + menor + " e " + maior);
    }

    @Quando("pesquisar usuário por idade de {int} anos")
    public void pesquisarUsuarioIdade(int idade) {
        //implementação das regras de negócio
    }
}


