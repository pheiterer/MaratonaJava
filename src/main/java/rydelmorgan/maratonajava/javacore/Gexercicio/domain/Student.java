package rydelmorgan.maratonajava.javacore.Gexercicio.domain;

public class Student {
    private String name;
    private int idade;
    private Seminary seminary;

    public Student(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public Student(String name, int idade, Seminary seminary) {
        this.name = name;
        this.idade = idade;
        this.seminary = seminary;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(seminary.getTitulo());

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminary getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }
}
