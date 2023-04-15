package rydelmorgan.maratonajava.javacore.ZZIJDBC.test;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.conn.ConnectionFactory;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.repository.ProducerRepository;

import java.sql.SQLException;

@Log4j2
public class ConnectionfactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Studio Deen").build();
//        ProducerRepository.save(producer);
        log.info("INFO");
        log.debug("DEBUG");
        log.warn("WARN");
        log.error("ERROR");
        log.trace("TRACE");
    }
}
