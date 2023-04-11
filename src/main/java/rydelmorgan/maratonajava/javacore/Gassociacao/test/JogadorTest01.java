package rydelmorgan.maratonajava.javacore.Gassociacao.test;

import rydelmorgan.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Marco");
        Jogador jogador3 = new Jogador("Kaka");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador: jogadores) {
            jogador.print();
        }
    }
}
