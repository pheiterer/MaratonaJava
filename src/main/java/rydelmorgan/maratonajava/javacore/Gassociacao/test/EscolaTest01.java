package rydelmorgan.maratonajava.javacore.Gassociacao.test;

import rydelmorgan.maratonajava.javacore.Gassociacao.domain.Escola;
import rydelmorgan.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor[] professors = {professor};
        Escola escola= new Escola("Konoha", professors);
        escola.print();
    }
}
