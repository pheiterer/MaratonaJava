package rydelmorgan.maratonajava.javacore.Aintroduçãoclasses.teste;

import rydelmorgan.maratonajava.javacore.Aintroduçãoclasses.dominio.Professor;

public class ProfTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor= "Goku";
        professor.idadeProfessor= 35;
        professor.sexoProfessor= 'M';

        System.out.println(professor.nomeProfessor);
        System.out.println(professor.idadeProfessor);
        System.out.println(professor.sexoProfessor);
    }
}
