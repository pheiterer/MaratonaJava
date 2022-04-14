package rydelmorgan.maratonajava.javacore.Npolimorfismo.test;

import rydelmorgan.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancodeDandos;
import rydelmorgan.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
