package rydelmorgan.maratonajava.javacore.Npolimorfismo.test;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tv;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("DJSAI", 11000);
        Tomate tomate = new Tomate("vermelho", 10);
        Tv tv = new Tv("Samsung 50\"" , 5000);

        CalcularImposto.calcularImposto(computador);
        System.out.println("-----------------------------");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("-----------------------------");
        CalcularImposto.calcularImposto(tv);
    }
}
