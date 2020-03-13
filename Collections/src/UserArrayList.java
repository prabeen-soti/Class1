import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserArrayList {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(1, "User1"));
		userList.add(new User(2, "User2"));
		userList.add(new User(3, "User3"));
		userList.add(new User(4, "User4"));
		for(User user : userList) {
			System.out.println(user);
		}
		
		List<User> userList1 = new ArrayList<User>();
		userList1.addAll(userList);
		User user5 = new User(5, "User5");
		userList1.add(2, user5);
		userList1.remove(user5);
//		userList1.remove(2);
		for(User user : userList1) {
			System.out.println(user);
		}

	}

}
