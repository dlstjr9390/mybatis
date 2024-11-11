package org.greenart.mybatis_ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ConnectionTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void testConnection(){
        try {
            Connection connection = dataSource.getConnection();
            Assertions.assertNotNull(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
