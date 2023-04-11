package rydelmorgan.maratonajava.javacore.Minteface.domain;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retriverMaxDataSize(){
        System.out.println("Dentro do retriverMaxDataSize na classe DataBaseLoader");
    }
}
