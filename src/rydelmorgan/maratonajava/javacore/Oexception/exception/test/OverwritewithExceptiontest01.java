package rydelmorgan.maratonajava.javacore.Oexception.exception.test;

import rydelmorgan.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import rydelmorgan.maratonajava.javacore.Oexception.exception.domain.Pessoa;

public class OverwritewithExceptiontest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
