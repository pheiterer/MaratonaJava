package rydelmorgan.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.06;

    public Tomate(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calcular imposto do Tomate");
        return this.valor * IMPOSTO;
    }
}
