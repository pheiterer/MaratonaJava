package rydelmorgan.maratonajava.javacore.Hherenca.dominio;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco enderess;


    public Pessoa(String nome){
        this.name = name;
    }

    public Pessoa(String name, String cpf){
        this(name);
        this.cpf = cpf;
    }
    public void print() {
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.enderess.getRua() + " " + this.enderess.getCep());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEnderess() {
        return enderess;
    }

    public void setEnderess(Endereco enderess) {
        this.enderess = enderess;
    }
}
