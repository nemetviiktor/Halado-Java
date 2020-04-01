package komplex;

import java.util.List;
import java.util.ArrayList;

public class UserRepository {
	
	private List<User> users = new ArrayList<User>();
	public void save(User user) {
		System.out.println(user.getName() + " mentve!");
		users.add(user);
	}
	
	public User getByNeptunKod(String neptunkod) {
		for (User user : users) {
			if (user.getNeptunkod().equals(neptunkod)) {
				return user;
			}
		}
		return null;
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public ArrayList<User> findByEnabledIsTrue() {
		List<User> result = new ArrayList<>();
		for (User user : users) {
			if (user.isEnabled()) {
				
			}
		}
		return result;
	}

}
