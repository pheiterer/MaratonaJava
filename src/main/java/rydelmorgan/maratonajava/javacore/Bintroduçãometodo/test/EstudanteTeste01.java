package rydelmorgan.maratonajava.javacore.Bintroduçãometodo.test;

import rydelmorgan.maratonajava.javacore.Bintroduçãometodo.dominio.Estudante;
import rydelmorgan.maratonajava.javacore.Bintroduçãometodo.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Paulo";
        estudante1.idade = 22;
        estudante1.sexo = 'M';

        estudante2.nome = "Laivnia";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
