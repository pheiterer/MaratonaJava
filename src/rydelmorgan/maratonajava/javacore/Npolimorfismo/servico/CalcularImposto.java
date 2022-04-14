package rydelmorgan.maratonajava.javacore.Npolimorfismo.servico;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Computador;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Produto;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getName());
        System.out.println("Computador valor " + computador.getValor());
        System.out.println("Imposto do computador " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getName());
        System.out.println("Tomate valor " + tomate.getValor());
        System.out.println("Imposto do Tomate " + imposto);
    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getName());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());

    }
}
