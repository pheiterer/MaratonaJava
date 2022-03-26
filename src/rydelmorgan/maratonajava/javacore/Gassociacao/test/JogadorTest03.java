package rydelmorgan.maratonajava.javacore.Gassociacao.test;

import rydelmorgan.maratonajava.javacore.Gassociacao.domain.Jogador;
import rydelmorgan.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Kaka");
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Santos");
        Jogador[] jogadors = {jogador,jogador1};

        jogador.setTime(time);

        time.setJogadors(jogadors);

        System.out.println("----Jogador-----");

        jogador.print();

        System.out.println("----Jogador-----");

        time.print();
    }
}
