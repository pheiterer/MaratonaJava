package rydelmorgan.maratonajava.javacore.Aintroduçãoclasses.teste;

import rydelmorgan.maratonajava.javacore.Aintroduçãoclasses.dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade=18;
        estudante.nome="Luffy";
        estudante.sexo='M';
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
