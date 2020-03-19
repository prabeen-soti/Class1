import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2 Create connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","#Admin123");
			
		//3 Create Statement
		String createQuery = "INSERT INTO user (`id`,`name`) VALUES (?,?)";
		PreparedStatement statement = connection.prepareStatement(createQuery);
		statement.setInt(1, 201);
		statement.setString(2, "Anup");
		//4 Run Query
		 statement.executeUpdate();
		//5 Close Connection
		 connection.close();
		
	}

}
