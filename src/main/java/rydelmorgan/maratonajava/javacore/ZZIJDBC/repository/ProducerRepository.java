package rydelmorgan.maratonajava.javacore.ZZIJDBC.repository;

import rydelmorgan.maratonajava.javacore.ZZIJDBC.conn.ConnectionFactory;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn =ConnectionFactory.getConnection();
            Statement smt = conn.createStatement()){
            int rowsAffected = smt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
