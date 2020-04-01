package komplex;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		List<Validator> validators = new ArrayList<>();
		validators.add(new LengthValidator());
		validators.add(new SpaceValidator());
		UserService userService = new UserServiceImp(userRepository, validators);
		
		UserController userController = new UserController(userService, new NeptunCodeGenerator());
		userController.save(new User(" venBenneSpace", true, "abc"));
		userController.save(new User("rovid", true, "abcd"));
		userController.save(new User("nagyonjo", true, "abce"));

	}

}
