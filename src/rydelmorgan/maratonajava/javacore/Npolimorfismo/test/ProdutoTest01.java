package rydelmorgan.maratonajava.javacore.Npolimorfismo.test;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("DJSAI", 11000);
        Tomate tomate = new Tomate("vermelho", 10);
        CalcularImposto.calcularImpostoComputador(computador);
        System.out.println("-----------------------------");
        CalcularImposto.calcularImpostoTomate(tomate);
    }
}
