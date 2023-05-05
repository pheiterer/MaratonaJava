package rydelmorgan.maratonajava.javacore.ZZIJDBC.test;

import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.servicer.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White Foz").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();

        ProducerService.saveTransaction(List.of(producer1,producer2,producer3));

    }

}
