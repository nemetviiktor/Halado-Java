package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Buying {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Student diak = new Student("Viktor"+i);
			student.add(diak);

		}
		System.out.println(student);
	    int min = 1500;
	    int max = 3000;
		int csokkent = 0;
		int szum = 0;
		
		for (int i = 0; i < 6; i++) {
			csokkent = ThreadLocalRandom.current().nextInt(min , max + 1);
			student.get(i).fogyasztas(csokkent);
			System.out.println(student.get(i).penz());
			
			if (student.get(i).fogyasztas(csokkent)) {
				student.remove(i);
			}
			/*
			for (int j = 0; j < student.size(); j++) {
				szum =+ (int) student.get(j).penz();
				System.out.println("Átlag: " + szum / student.size());
			}
			
		}
		
		System.out.println(student.size() + "darab tanuló maradt.");
		System.out.println(student);
		*/
	}
	}

}
