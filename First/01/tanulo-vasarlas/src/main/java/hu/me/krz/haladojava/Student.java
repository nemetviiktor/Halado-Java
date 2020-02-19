package hu.me.krz.haladojava;

public class Student {

	private String name;
	private int money;
	private int tanulok;
	
	public String getName() {
		return name;
	}
	public double penz() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	private Student(String name, int money) {
		this.name = name;
		this.money = money;
		this.tanulok++;
	}
	public int osszestanulo() {
		return tanulok;
	}
	public Student(String name) {
		super();
		this.name = name;
		this.money = 10000;
	}
	
	@Override
	public String toString() {
		return "Tanuló: " + name + " pénz: " + money + " Ft;";
	}
	
	public boolean fogyasztas(int csokkent) {
		this.money = this.money - csokkent;
		if (this.money == 0) {
			return true;
		}
		return false;
	}

	
	

	
}
