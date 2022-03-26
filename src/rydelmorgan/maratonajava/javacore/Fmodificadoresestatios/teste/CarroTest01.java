package rydelmorgan.maratonajava.javacore.Fmodificadoresestatios.teste;

import rydelmorgan.maratonajava.javacore.Fmodificadoresestatios.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 250);
        Carro c3 = new Carro("Audi", 290);

       Carro.setSpeedLimit(180);

        c1.print();
        c2.print();
        c3.print();
    }
}
