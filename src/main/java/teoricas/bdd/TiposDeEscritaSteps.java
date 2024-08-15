package teoricas.bdd;

import io.cucumber.java.pt.*;

public class TiposDeEscritaSteps {
    
    @Dado("que o usuário esteja na tela de cadastro")
    public void queOUsuárioEstejaNaTelaDeCadastro() {
    }

    @E("ele clique no botão {string}")
    public void eleCliqueNoBotão(String arg0) {
    }

    @E("preencha o campo {string}")
    public void preenchaOCampo(String arg0) {
    }

    @Quando("ele clica no botão {string}")
    public void eleClicaNoBotão(String arg0) {
    }

    @Então("o sistema exibe mensagem {string}")
    public void oSistemaExibeMensagem(String arg0) {

    }

    @Dado("que o usuário ainda não tenha cadastro")
    public void queOUsuárioAindaNãoTenhaCadastro() {
    }

    @Quando("o cadastro for realizado")
    public void oCadastroForRealizado() {
    }

    @Então("o usuário deverá ter acesso a aplicação")
    public void oUsuárioDeveráTerAcessoAAplicação() {
    }
}
