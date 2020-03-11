package komplex;

import java.util.Scanner;

public class UserController {

	public static void main(String[] args) {
		
		int count = 1;
		
		for (int i = 0; i < count; i++) {
			System.out.println(i+1 + ". felhaszn�l� neve (6 karakter, space haszn�lata n�lk�l): ");
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
	}

}
