package rydelmorgan.maratonajava.javacore.Npolimorfismo.test;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("I7", 3000);
        System.out.println(produto.getName());
        System.out.println(produto.getValor());
    }
}
