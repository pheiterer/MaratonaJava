package rydelmorgan.maratonajava.javacore.ZZIJDBC.repository;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.conn.ConnectionFactory;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Inserted prodrucer '{}' in the dataBase rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement smt = conn.createStatement()) {
            int rowsAffected = smt.executeUpdate(sql);
            log.info("Deleted prodrucer '{}' from the dataBase rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
}