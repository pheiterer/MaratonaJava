package rydelmorgan.maratonajava.javacore.Minteface.domain;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
