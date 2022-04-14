package rydelmorgan.maratonajava.javacore.Npolimorfismo.servico;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDandos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Bando de Dados");
    }
}
