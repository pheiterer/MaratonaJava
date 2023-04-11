package rydelmorgan.maratonajava.javacore.Npolimorfismo.domain;

public class Tv extends Produto{
    public static final double IMPOSTO = 0.21;

    public Tv(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calcular imposto da Tv");
        return this.valor * IMPOSTO;
    }
}
