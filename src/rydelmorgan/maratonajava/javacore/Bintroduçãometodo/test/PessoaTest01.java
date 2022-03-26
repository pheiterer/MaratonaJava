package rydelmorgan.maratonajava.javacore.Bintroduçãometodo.test;

import rydelmorgan.maratonajava.javacore.Bintroduçãometodo.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Paulo");
        pessoa.setIdade(22);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
