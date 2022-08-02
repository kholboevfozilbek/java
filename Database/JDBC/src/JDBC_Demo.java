import java.sql.*;

public class JDBC_Demo {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql");
            Statement statement = connection.createStatement();
            String command = "SELECT * FROM student";
            ResultSet result = statement.executeQuery(command);

            while (result.next()) {
                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getFloat(4) + "\n");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
