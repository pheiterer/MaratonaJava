package rydelmorgan.maratonajava.javacore.ZZIJDBC.test;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.servicer.ProducerService;

@Log4j2
public class ConnectionfactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("MKV").build();
        Producer producerToUpdate = Producer.builder().id(11).name("mkv").build();
//        ProducerService.save(producer);
//        ProducerService.delete(10);
        ProducerService.update(producerToUpdate);

    }
}
