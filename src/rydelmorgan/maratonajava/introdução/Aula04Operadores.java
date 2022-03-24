package rydelmorgan.maratonajava.introdução;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 20;
        double result = (num1/num2);
        System.out.println(result );



        // %
        int resto = 21%6;
        System.out.println(resto);

        // <> <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        System.out.println(isDezMaiorQueVinte);


        //&& || !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaior30 = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenor30 = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaior30);
        System.out.println(isDentroDaLeiMenor30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float playstation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente>playstation || valorTotalContaPoupanca>playstation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);


        // = += -= *= /= %/
        double bonus = 1000;
        bonus %= 2;
        System.out.println(bonus);

        int contator = 0;
        contator++;
        contator--;
        ++contator;
        --contator;
        //ATENÇÃO ANTES OU DEPOIS

    }
}
