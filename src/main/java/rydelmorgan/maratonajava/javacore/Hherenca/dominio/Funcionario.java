package rydelmorgan.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void print(){
        super.print();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
