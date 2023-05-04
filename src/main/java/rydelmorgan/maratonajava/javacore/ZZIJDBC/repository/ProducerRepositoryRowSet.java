package rydelmorgan.maratonajava.javacore.ZZIJDBC.repository;

import rydelmorgan.maratonajava.javacore.ZZIJDBC.conn.ConnectionFactory;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZIJDBC.listener.CustomRowSetListener;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findbyNameJdbcRowSet(String name){
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1,String.format("%%%s%%",name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }
    public static void updateJdbcRowSet(Producer producer){
        String sql = "SELECT * FROM `anime_store`.`producer` WHERE (`id` = ?);";
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1,producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("name",producer.getName());
            jrs.updateRow();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
