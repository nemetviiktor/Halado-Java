package hu.me.krz.haladojava;

public class Student extends Person implements Comparable<Student> {

    private int cheat;
    
    

	public Student(String name, int age, int cheat) {
		super(name, age);
		this.cheat = cheat;
	}

	@Override
	public String toString() {
		return "Student [getName=" +getName() + ", cheat=" + cheat + ", getAge()=" + getAge() + "]";
	}

	@Override
	public int compareTo(Student that) {
		if (this.cheat < that.cheat) {
			return this.getAge();
		}
		else {
			return that.getAge();
		}
	}
}
