package rydelmorgan.maratonajava.javacore.Ycolletions.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String name;



    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id) && name.equals(manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Manga(Long id, String name) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(name, "Nome não pode ser nulo");
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Manga o) {
//        if (this.id<o.getId()){
//            return -1;
//        }else
//        if (this.id.equals(o.getId())){
//            return 0;
//        }else{
//            return 1;
//        }
        return this.name.compareTo(o.getId());
//        return Double.compare(preco, o.getPreco());   <------- working with types primitives
    }
}
