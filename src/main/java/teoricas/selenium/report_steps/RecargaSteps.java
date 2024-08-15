package teoricas.selenium.report_steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.util.List;
import java.util.Map;

public class RecargaSteps {

    @Dado("que esteja na tela de recarga")
    public void queOUsuárioEstejaNaTelaDeRecarga() {
    }

    @E("que usuário preencha os dados da recarga")
    public void preencherDados(DataTable table) {
        List<Map<String, String>> recargas = table.asMaps(String.class, String.class);

        for (Map<String, String> map : recargas) {

            String numeroCartao = map.get("numeroCartao");
//            System.out.println("Número do cartão:" + numeroCartao);

            int valor = Integer.parseInt(map.get("valorRecarga"));
//            System.out.println("Valor da recarga:" + valor);
        }
    }

    @Quando("confirmar recarga de cartão")
    public void confirmarRecarga() {
    }

    @Então("sistema exibe mensagem sucesso da recarga")
    public void sistemaExibeMensagemDeSucessoDaRecarga() {
    }

    @E("redireciona para home")
    public void redirecionaParaTelaHome() {
    }

}


