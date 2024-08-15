package teoricas.selenium.complementos.classes;

import java.awt.*;
import java.util.Random;

public class MousePontoEspecifico {

    public static void main(String[] args) throws AWTException, InterruptedException {
        moverMouseAleatoriamente(5);
    }

    public static void moverMouseAleatoriamente(int qtdVezes) throws AWTException, InterruptedException {
        Thread.sleep(2000);
        String texto = null;

        Robot robot = new Robot();

        for (int i = 0; i < qtdVezes; i++) {
            int[] valores = gerarVariacao(texto);
            int eixoX = valores[0];
            int eixoY = valores[1];

            robot.mouseMove(eixoX, eixoY);

            texto = definirTextoPosicao(eixoX, eixoY);

            System.out.println("Movi para: (" + eixoX + ", " + eixoY + ") >> " + texto);
            Thread.sleep(4000);
        }
    }

    private static int[] gerarVariacao(String ultPosicao) {
        Random random = new Random();
        int x = random.nextInt(870);
        int y = random.nextInt(720);

        if (ultPosicao == null || (!definirTextoPosicao(x, y).equals(ultPosicao))) {
            return new int[] {x, y};
        } return gerarVariacao(ultPosicao);
    }

    private static String definirTextoPosicao(int eixoX, int eixoY) {
        String posicao = "";

        if (eixoX >= 645) {
            posicao = posicao.concat("direita");
        } else {
            posicao = posicao.concat("esquerda");
        }

        if (eixoY <= 320) {
            posicao = posicao.concat(" em cima");
        } else {
            posicao = posicao.concat(" embaixo");
        }
        return posicao;
    }

}
