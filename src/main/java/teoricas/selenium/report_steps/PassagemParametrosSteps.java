package teoricas.selenium.report_steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PassagemParametrosSteps {

    @Dado("que esteja na tela de pesquisa")
    public void estarNaTelaPesquisa() {
        //implementação do acesso a tela de pesquisa
    }

    @Quando("pesquisar usuário pelo {string}")
    public void pesquisarUsuarioNome(String nomeDesejado) {
//        System.out.println(nomeDesejado);
    }

    @Então("sistema exibe resultado pesquisa")
    public void validarResultadoPesquisa() {
        //implementação da validação da exibição da home
    }

    @Quando("pesquisar usuário pelo idade aproximada {int}")
    public void pesquisarUsuarioIdadeAproximada(int idade) throws Exception {
        throw new Exception("Deu ruim aqui rapaz!");
    }

    @Quando("pesquisar usuário por idade {int} anos")
    public void pesquisarUsuarioIdade(int idade) {
        //implementação das regras de negócio
    }
}


