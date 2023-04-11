package rydelmorgan.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.21;

    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calcular imposto do Computador");
        return this.valor * IMPOSTO;
    }
}
