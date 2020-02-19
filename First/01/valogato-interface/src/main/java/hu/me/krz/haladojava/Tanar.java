package hu.me.krz.haladojava;

public class Tanar extends Szemely implements Valogato {
	
	private double atlag;

	public Tanar(String name, int age, double atlag) {
		super(name, age);
		this.atlag = atlag;
	}

	@Override
	public boolean joAlanyE() {
		if (getAge() < 30 && atlag > 4) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Tanar [atlag=" + atlag + ", joAlanyE()=" + joAlanyE() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
	
	


}
