package rydelmorgan.maratonajava.javacore.Gexercicio.domain;

import java.security.PublicKey;

public class Professor {
    private String name;
    private String specialty;
    private Seminary[] profSeminaries;

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminary[] profSeminaries) {
        this.name = name;
        this.specialty = specialty;
        this.profSeminaries = profSeminaries;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.specialty);
        if (this.profSeminaries == null) return;
        for (Seminary semi : this.profSeminaries) {
            System.out.println(semi.getTitulo());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminary[] getProfSeminaries() {
        return profSeminaries;
    }

    public void setProfSeminaries(Seminary[] profSeminaries) {
        this.profSeminaries = profSeminaries;
    }
}
