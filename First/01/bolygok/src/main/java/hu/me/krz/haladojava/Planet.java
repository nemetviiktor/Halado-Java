package hu.me.krz.haladojava;

public class Planet {
	
	private int position;
	private int radius;
	private int name;
	
	public Planet(int position, int radius, int name) {
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public int getRadius() {
		return radius;
	}

	public int getName() {
		return name;
	}
}
