package hu.me.krz.haladojava;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Try {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int count = scanner.nextInt();
	    
	    Student[] student = new Student[count];

	    int minAge = 18;
	    int maxAge = 25;
		int randomNumAge;
		int minCheat = 0;
	    int maxCheat = 5;
		int randomNumCheat;
		
		for (int i = 0; i < student.length; i++) {
			randomNumAge = ThreadLocalRandom.current().nextInt(minAge , maxAge + 1);
			randomNumCheat = ThreadLocalRandom.current().nextInt(minCheat , maxCheat + 1);
			student[i] = new Student("diák"+i, randomNumAge, randomNumCheat);
			System.out.println(student[i]);
		}

		

	}

}
