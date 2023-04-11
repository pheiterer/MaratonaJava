package rydelmorgan.maratonajava.javacore.Lclassesabstract.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String name, double salario) {
        super(name, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
