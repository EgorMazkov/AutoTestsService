package utils;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static constants.DBConstants.*;

@UtilityClass
public class DataBaseUtils {
    public Connection connectToPostgres(String nameDB) throws SQLException {
        return DriverManager.getConnection(POSTGRES_URL + POSTGRES_PORT + nameDB, POSTGRES_USERNAME, POSTGRES_PASSWORD);
    }


}

