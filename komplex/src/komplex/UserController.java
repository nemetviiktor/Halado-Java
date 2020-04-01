package komplex;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class UserController {

		UserModify userModify;
		List<Validator> validators;

		public UserController(UserModify userModify, List<Validator> validators) {
			this.userModify = userModify;
			this.validators = validators;
		}

		UserService userService;
		NeptunCodeGenerator neptunCodeGenerator;
		
		public UserController(UserService userService, NeptunCodeGenerator neptunCodeGenerator) {
			this.userService = userService;
			this.neptunCodeGenerator = neptunCodeGenerator;
		}

		public void save(UserDto userDto) {
			userService.save(new User(userDto.getName(), true, String.format(format, args)));
			/*
			if (isValid(user)) {
				userModify.save(user);
			}*/
		}
		
		private boolean isValid(User user) {
			for (Validator validator : validators) {
				if (!validator.isValid(user)) {
					return false;
				}
			}
			return true;
		}
		
		
		
		
		
		}

		
		/*
		
		for (int i = 0; i < count; i++) {
			System.out.print(i+1 + ". felhasználó neve (6 karakter, space használata nélkül): ");
			Scanner scanner = new Scanner(System.in);
			String gotName = scanner.nextLine();
			
			if (gotName.length() >= 6 && !gotName.contains(" ")) {
				User user = new User(gotName);
				System.out.println(user + " elmentve!");
			}
			else {
				System.out.println("Hiba!");
			}
			
		}
		*/


