package rydelmorgan.maratonajava.javacore.ZZJCRUD.repository;

import lombok.extern.log4j.Log4j2;
import rydelmorgan.maratonajava.javacore.ZZJCRUD.conn.ConnectionFactory;
import rydelmorgan.maratonajava.javacore.ZZJCRUD.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding a Producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find a producer", e);
        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%",name));
        return ps;
    }
}
