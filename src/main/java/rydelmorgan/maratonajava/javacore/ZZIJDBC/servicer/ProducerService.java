package rydelmorgan.maratonajava.javacore.ZZIJDBC.servicer;

import lombok.SneakyThrows;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    @SneakyThrows
    public static void delete(int id){
     if (id<=0){
         throw new IllegalAccessException("Invalid value for id");
     }
     ProducerRepository.delete(id);
    }

    @SneakyThrows
    public static void update(Producer producer){
        if (producer.getId() == null || producer.getId() <= 0){
            throw new IllegalAccessException("Invalid value for id");
        }
        ProducerRepository.update(producer);
    }

}
