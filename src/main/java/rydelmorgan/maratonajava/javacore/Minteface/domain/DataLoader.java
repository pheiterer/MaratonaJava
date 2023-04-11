package rydelmorgan.maratonajava.javacore.Minteface.domain;

public interface DataLoader {
    int VALOR_MAX = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    static void retriverMaxDataSize(){
        System.out.println("Dentro do retriverMaxDataSize na classe DataLoader");
    }
}
