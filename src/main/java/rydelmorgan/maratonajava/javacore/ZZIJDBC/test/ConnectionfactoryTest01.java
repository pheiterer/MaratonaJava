package rydelmorgan.maratonajava.javacore.ZZIJDBC.test;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.servicer.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionfactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("MADHOUSE").build();
        Producer producerToUpdate = Producer.builder().id(1).name("mkv").build();
//        ProducerService.save(producer);
//        ProducerService.delete(10);
//        ProducerService.update(producerToUpdate);
//        List<Producer> all = ProducerService.findAll();
//        List<Producer> all = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", all);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetadata();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producersUpperCase = ProducerService.findByNameAndUpdateToUpperCase("Been");
        List<Producer> insertProducer = ProducerService.findByNameandInsertWhenNotFound("A1-Pictures");
//        log.info("Producers found '{}'", insertProducer);
//        ProducerService.findByNameAndDelete("A1-Pictures");


    }
}
