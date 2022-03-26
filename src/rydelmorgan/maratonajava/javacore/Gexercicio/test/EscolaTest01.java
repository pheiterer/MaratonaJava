package rydelmorgan.maratonajava.javacore.Gexercicio.test;

import rydelmorgan.maratonajava.javacore.Gexercicio.domain.Local;
import rydelmorgan.maratonajava.javacore.Gexercicio.domain.Professor;
import rydelmorgan.maratonajava.javacore.Gexercicio.domain.Seminary;
import rydelmorgan.maratonajava.javacore.Gexercicio.domain.Student;

import java.util.Scanner;

public class EscolaTest01 {
    public static void main(String[] args) {
        Student student1 = new Student("Paulo", 25);
        Professor professor1 = new Professor("Lavinia", "Progamação");
        Seminary seminary1 = new Seminary("Java");
        Local local1 = new Local("IFET");

        Student[] students = {student1};
        Seminary[] seminaries = {seminary1};
        Seminary[] localSemi = {seminary1};

        student1.setSeminary(seminary1);
        professor1.setProfSeminaries(seminaries);
        local1.setLocalSeminaries(localSemi);
        seminary1.setStudentsSemi(students);
        seminary1.setLocal(local1);
        seminary1.setProf(professor1);

        System.out.println("------Student-------");
        student1.print();
        System.out.println("------Professor-------");
        professor1.print();
        System.out.println("------Seminary-------");
        seminary1.print();
        System.out.println("------Local-------");
        local1.print();




    }
}
