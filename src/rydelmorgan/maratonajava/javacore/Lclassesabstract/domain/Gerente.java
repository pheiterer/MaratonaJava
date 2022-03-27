package rydelmorgan.maratonajava.javacore.Lclassesabstract.domain;

public class Gerente extends Funcionario {

    public Gerente(String name, double salario) {
        super(name, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
