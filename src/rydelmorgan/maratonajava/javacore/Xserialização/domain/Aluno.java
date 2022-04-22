package rydelmorgan.maratonajava.javacore.Xserialização.domain;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 8625267794534912741L;

    private Long id;
    private String name;
    private transient String password;
    private transient Turma turma;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getName());

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma=new Turma(nomeTurma);

        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Aluno(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
