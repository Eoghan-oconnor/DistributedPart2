package ie.gmit.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDb {
	
	public static HashMap<Integer, User> Users = new HashMap<>();
	
	static {
		Users.put(1, new User(1, "Eoghan O'Connor", "G00330972@gmit.ie", "upTuam"));
	}
	
	public static List<User> getUsers(){
		return new ArrayList<User>(Users.values());
	}
	
	public static User getUser(Integer id) {
		return Users.get(id);
	}
	
	public static void updateUser(Integer id, User u) {
		Users.put(id, u);
	}
	
	public  static void create(Integer id, User u) {
		Users.put(id, u);
	}
	
	public static void remove(Integer id) {
		Users.remove(id);
	}
	
	
	
		

}
