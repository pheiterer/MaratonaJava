package rydelmorgan.maratonajava.javacore.Jmodificadorfinal.test;

import rydelmorgan.maratonajava.javacore.Jmodificadorfinal.domain.Buyer;
import rydelmorgan.maratonajava.javacore.Jmodificadorfinal.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car carro = new Car();
        Buyer buyer = new Buyer();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(carro.BUYER);
        carro.BUYER.setName("Paulo");
        System.out.println(carro.BUYER);

    }
}
