package rydelmorgan.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private  Professor[] professors;

    public void print(){
        System.out.println(this.nome);
        if (professors == null){
            return;
        }
        for (Professor professor: professors) {
            System.out.println(professor.getNome());
        }
    }

    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
