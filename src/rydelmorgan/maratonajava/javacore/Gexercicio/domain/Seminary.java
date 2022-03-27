package rydelmorgan.maratonajava.javacore.Gexercicio.domain;

public class Seminary {
    private String titulo;
    private Professor prof;
    private Local local;
    private Student[] studentsSemi;

    public Seminary(String titulo) {
        this.titulo = titulo;
    }

    public Seminary(Professor prof, Local local, Student[] studentsSemi) {
        this.prof = prof;
        this.local = local;
        this.studentsSemi = studentsSemi;
    }

    public void print() {
        System.out.println(this.titulo);
        System.out.println(prof.getName());
        if (studentsSemi == null) return;
        for (Student stud : studentsSemi) {
            System.out.println(stud.getName());
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Student[] getStudentsSemi() {
        return studentsSemi;
    }

    public void setStudentsSemi(Student[] studentsSemi) {
        this.studentsSemi = studentsSemi;
    }
}
