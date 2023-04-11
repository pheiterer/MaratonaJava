package rydelmorgan.maratonajava.javacore.Npolimorfismo.servico;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Produto;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalcularImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getName());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
