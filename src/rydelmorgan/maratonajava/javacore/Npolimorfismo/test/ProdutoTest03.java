package rydelmorgan.maratonajava.javacore.Npolimorfismo.test;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Produto;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.CalcularImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("I7", 3000);

        Tomate tomate = new Tomate("I7", 3000);
        tomate.setDataValidade("12/05/2022");

        CalcularImposto.calcularImposto(tomate);
        CalcularImposto.calcularImposto(produto);

    }
}
