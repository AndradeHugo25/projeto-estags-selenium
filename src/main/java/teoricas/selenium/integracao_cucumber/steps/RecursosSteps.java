package teoricas.selenium.integracao_cucumber.steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import teoricas.selenium.page_objects.Passo5Page;

import static system.tools.configuration.Hook.driver;

public class RecursosSteps {

    public Passo5Page page = new Passo5Page(driver);

    @Dado("que o usuário esteja na tela tal")
    public void estarNaTelaTal() {
        System.out.println("\t\tStep 1 acesso tela tal");
    }

    @Quando("enviar dados válidos de cadastro")
    public void enviarDadosValidosCadastro() {
        System.out.println("\t\tStep 2 enviar dados válidos");
    }

    @Então("sistema cadastra usuário com sucesso")
    public void validarCadastro() {
        System.out.println("\t\tStep 3 validação cadastro");
    }

    @Mas("ele não preenche os valores")
    public void queOUsuárioNãoPreenchaOsValores() {
        System.out.println("\t\tStep 2 não preencher campos obrigatórios");
    }

    @Quando("enviar dados inválidos de cadastro")
    public void enviarDadosInválidosDeCadastro() {
        System.out.println("\t\tStep 3 enviar dados inválidos");
    }

    @Então("sistema exibe crítica dos campos obrigatórios")
    public void sistemaExibeCríticaDosCamposObrigatórios() {
        System.out.println("\t\tStep 4 exibir mensagem de crítica");
    }

    @Quando("enviar dados válidos de edição")
    public void enviarDadosVálidosDeEdição() {
        System.out.println("\t\tStep 2 enviar dados válidos edição");
    }

    @Então("sistema edita usuário com sucesso")
    public void sistemaEditaUsuárioComSucesso() {
        System.out.println("\t\tStep 3 usuário editado");
    }

    @Então("o sistema cadastra usuário com sucesso")
    public void oSistemaCadastraUsuarioComSucesso() throws Exception {
        if (validaTabela()) {
            System.out.println("Usuário cadastrado.");
        } else {
            throw new Exception("Valores não esperados na base de dados!");
        }
    }

    @E("exibe mensagem de sucesso {string}")
    public void exibeMensagemDeSucesso(String msgEsperada) {
        String msgSite = "Erro no cadastro";
        Assert.assertEquals(msgEsperada, msgSite);
    }

    @E("redireciona para home do sistema")
    public void redirecionaParaHomeDoSistema() throws Exception {
        if (driver.getCurrentUrl().equals("http://home")) {
            System.out.println("Fluxo correto!");
        } else {
            throw new Exception("Url não esperada!");
        }
    }

    private boolean validaTabela() {
        return true;
    }
}


