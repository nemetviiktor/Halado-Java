package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato {
	
	private int puska;

	public Diak(String name, int age, int puska) {
		super(name, age);
		this.puska = puska;
	}

	@Override
	public boolean joAlanyE() {
		if (puska == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Diak [puska=" + puska + ", joAlanyE()=" + joAlanyE() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
	
	

	
}
