package rydelmorgan.maratonajava.javacore.Hherenca.teste;

import rydelmorgan.maratonajava.javacore.Hherenca.dominio.Endereco;
import rydelmorgan.maratonajava.javacore.Hherenca.dominio.Funcionario;
import rydelmorgan.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerencaTeste01 {
    public static void main(String[] args) {
        Endereco adress = new Endereco();
        adress.setRua("Maria 3");
        adress.setCep("02551-54");
        Pessoa pessoa = new Pessoa("Paulo");
        pessoa.setCpf("2151");
        pessoa.setEnderess(adress);
        pessoa.print();

        Funcionario funcionario = new Funcionario("João");
        funcionario.setCpf("5266552");
        funcionario.setEnderess(adress);
        funcionario.setSalario(20000.25);
        funcionario.print();
    }
}
