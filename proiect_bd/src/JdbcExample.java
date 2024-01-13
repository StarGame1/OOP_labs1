
import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (Exception ex) {
            System.err.println("An Exception occured during JDBC Driver loading." +
                    " Details are provided below:");
            ex.printStackTrace(System.err);
        }
        Connection connection = null;
        Statement selectStatement = null, insertStatement = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        try {
            connection = DriverManager.
                    getConnection("jdbc:mysql://localhost/proiect1?user=root&password=");
            insertStatement = connection.createStatement();


        }
        catch(SQLException sqlex) {
            System.err.println("An SQL Exception occured. Details are provided below:");
            sqlex.printStackTrace(System.err);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                }
                catch(SQLException e) {
                }
                rs = null;
            }
            if (selectStatement != null) {
                try {
                    selectStatement.close();
                }
                catch(SQLException e) {}
                selectStatement = null;
            }
            if (insertStatement != null) {
                try {
                    insertStatement.close();
                }
                catch(SQLException e) {}
                insertStatement = null;
            }
            if (connection != null) {
                try {
                    connection.close();
                }
                catch(SQLException e) {}
                connection = null;
            }
        }
    }
}
