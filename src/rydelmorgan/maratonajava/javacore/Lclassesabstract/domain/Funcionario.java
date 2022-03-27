package rydelmorgan.maratonajava.javacore.Lclassesabstract.domain;

public abstract class Funcionario extends Pessoa{
    protected String name;
    protected double salario;

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void print() {
        System.out.println("Imprime...");
    }

    public abstract void calculaBonus();

}
