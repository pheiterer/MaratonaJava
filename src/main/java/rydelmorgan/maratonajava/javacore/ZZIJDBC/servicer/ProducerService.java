package rydelmorgan.maratonajava.javacore.ZZIJDBC.servicer;

import lombok.SneakyThrows;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
     if (id<=0){
         throw new IllegalArgumentException("Invalid value for id");
     }
     ProducerRepository.delete(id);
    }

    public static void update(Producer producer){
        if (producer.getId() == null || producer.getId() <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
}
