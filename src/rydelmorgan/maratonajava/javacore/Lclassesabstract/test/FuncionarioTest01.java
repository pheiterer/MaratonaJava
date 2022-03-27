package rydelmorgan.maratonajava.javacore.Lclassesabstract.test;

import rydelmorgan.maratonajava.javacore.Lclassesabstract.domain.Desenvolvedor;
import rydelmorgan.maratonajava.javacore.Lclassesabstract.domain.Funcionario;
import rydelmorgan.maratonajava.javacore.Lclassesabstract.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Paulo", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lavinia", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
