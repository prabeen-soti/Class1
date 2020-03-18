import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 Create connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","#Admin123");
		
		//3. Create statement
		Statement statement = connection.createStatement();
		
		//4. execute query
		String query = "SELECT * FROM user";
		ResultSet resultSet = statement.executeQuery(query);
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"   "+ resultSet.getString(2));
		}
		String createQuery = "INSERT INTO user (`name`) VALUES ('Bimal')";
		statement.executeUpdate(createQuery);
		String deleteQuery ="DELETE FROM user WHERE id=102";
		statement.executeUpdate(deleteQuery);
		
		//5. Close Connection
		connection.close();
	}

}
