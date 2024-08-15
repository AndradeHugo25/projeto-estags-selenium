package system.tools.configuration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Log {

    private static String caminhoCompleto;
    private static String nomeArquivoLog;
    private static String sistema;

    public void setCaminhoCompleto(String caminho) {
        caminhoCompleto = caminho;
    }

    public void setNomeArquivoLog(String caminho, String nomeSistema) {
        sistema = nomeSistema;
        nomeArquivoLog = "log" + sistema + ".txt";
        caminhoCompleto = caminho + "\\" + nomeArquivoLog;
    }

//    public void setNomeArquivoLog(String caminho, String nomeSistema, String nomeFeature) {
//        sistema = nomeSistema;
//        nomeFeature = TratamentoDeDados.aplicarCamelCase(nomeFeature);
//        nomeArquivoLog = "log" + sistema + nomeFeature + ".txt";
//        caminhoCompleto = caminho + "\\" + nomeArquivoLog;
//    }
//
//    public String getCaminhoCompleto() {
//        return caminhoCompleto;
//    }
//
//    //==========================METODOS DE ESCRITA NO LOG==========================================================
//    public void escreverCabecalho(String nomeFeature, String version) throws IOException {
//        escreverLinhaDivisoria(true);
//        escrever("SISTEMA: " + sistema.toUpperCase());
//        escrever("FUNCIONALIDADE: " + nomeFeature.toUpperCase());
//        escreverLinhaDivisoria(true);
//        escrever(version);
//        escreverLinhaDivisoria(true);
//    }
//
//    public void escrever(String linha) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCompleto, true));
//        String[] linhaPartida = linha.split("\n");
//        for (int i = 0; i < linhaPartida.length; i++) {
//            bw.write(DataEHora.getDataAtualFormatada("yyyy-MM-dd HH:mm:ss.SSS") + ": " + linhaPartida[i] + "\n");
//        }
//        bw.close();
//    }
//
//    public void escreverMensagemExcecao(String message) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCompleto, true));
//        bw.write(DataEHora.getDataAtualFormatada("yyyy-MM-dd HH:mm:ss.SSS") + ": ");
//        bw.write(message + "\n");
//        bw.close();
//    }
//
//    public void escreverStackTrace(StackTraceElement[] stackTrace) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCompleto, true));
//        String stack = Arrays.toString(stackTrace);
//        stack = stack.replace(" ", "");
//        stack = stack.replace("[", "");
//        stack = stack.replace("]", "");
//        String[] stackPartido = stack.split(",");
//        for (int i = 0; i < stackPartido.length; i++) {
//            bw.write("\t\t\t\t\t\t " + stackPartido[i] + "\n");
//        }
//        bw.close();
//    }
//
//    public void escreverLinhaDivisoria(boolean linhaDupla) throws IOException {
//        String carac;
//        if (linhaDupla){
//            carac = "=";
//        } else {
//            carac = "-";
//        }
//
//        StringBuilder divisoria = new StringBuilder();
//        for (int i = 0; i < 134; i++) {
//            divisoria.append(carac);
//        }
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCompleto, true));
//        bw.write(divisoria + "\n");
//        bw.close();
//    }
//
//    public void escreverLinhaSemDataEHora(String mensagem, boolean tabulacao) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoCompleto, true));
//        String[] msgPartida = mensagem.split("\n");
//        for (int i = 0; i < msgPartida.length; i++) {
//            if (tabulacao) {
//                bw.write("\t\t\t\t\t\t " + msgPartida[i] + "\n");
//            } else {
//                bw.write(msgPartida[i] + "\n");
//            }
//        }
//        bw.close();
//    }
//
//    public void escreverStepSucesso(String nomeStep) throws IOException {
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep;
//        escrever(nomeStep);
//    }
//
//    public void escreverStepSucesso(String nomeStep, String valor) throws IOException {
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep + " - valor utilizado: " + valor;
//        escrever(nomeStep);
//    }
//
//    public void escreverStepSucesso(String nomeStep, String valor, String msgValidada) throws IOException {
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep + " - valor utilizado: " + valor;
//        escrever(nomeStep);
//        escreverMensagemValidada(msgValidada);
//    }
//
//    public void escreverUltimoStepSucesso(String nomeStep) throws IOException {
//        GerenciadorDeTeste.decrementarQtdCenariosRestantes();
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep;
//        escrever(nomeStep);
//        escrever(CENARIOVALIDADOSUCESSO.getValor());
//        escreverLinhaDivisoria(false);
//    }
//
//    public void escreverUltimoStepSucesso(String nomeStep, String msgValidada) throws IOException {
//        GerenciadorDeTeste.decrementarQtdCenariosRestantes();
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep;
//        escrever(nomeStep);
//        escreverMensagemValidada(msgValidada);
//        escrever(CENARIOVALIDADOSUCESSO.getValor());
//        escreverLinhaDivisoria(false);
//    }
//
//    public void escreverUltimoStepSucesso(String nomeStep, String valor, String msgValidada) throws IOException {
//        GerenciadorDeTeste.decrementarQtdCenariosRestantes();
//        nomeStep = nomeStep.replace(" ", "");
//        nomeStep = "> Step " + nomeStep + " - valor utilizado: " + valor;
//        escrever(nomeStep);
//        escreverMensagemValidada(msgValidada);
//        escrever(CENARIOVALIDADOSUCESSO.getValor());
//        escreverLinhaDivisoria(false);
//    }
//
//    public void escreverMensagemValidada(String msgValidada) throws IOException {
//        msgValidada = "Mensagem validada: \""+ msgValidada + "\"";
//        escrever(msgValidada);
//    }
    //=============================================================================================================

}
