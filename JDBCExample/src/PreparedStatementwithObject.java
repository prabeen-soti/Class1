import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementwithObject {

	static void saveData(User user) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "#Admin123");
		String createQuery = "INSERT INTO user (`id`,`name`) VALUES (?,?)";
		PreparedStatement statement = connection.prepareStatement(createQuery);
		statement.setInt(1, user.getId());
		statement.setString(2, user.getName());
		statement.executeUpdate();
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id:");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter name:");
		String name = scan.nextLine();
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		
		saveData(user);
		

	}

}
