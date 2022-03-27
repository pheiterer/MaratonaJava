package rydelmorgan.maratonajava.javacore.Lclassesabstract.domain;

public class Gerente extends Funcionario {

    public Gerente(String name, double salario) {
        super(name, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
