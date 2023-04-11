package rydelmorgan.maratonajava.javacore.Bintroduçãometodo.test;

import rydelmorgan.maratonajava.javacore.Bintroduçãometodo.dominio.Calculator;

public class Test01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.somaDoisNumeros();

        Calculator calculator1 = new Calculator();
        calculator.subtrairDoisNumeros();

        Calculator calculator2 = new Calculator();
        calculator.mutiplicaDoisNumeros(10,20);

        Calculator calculator3 = new Calculator();
        double result= calculator.divideDoisNumeros(20,2);
        }
    }

