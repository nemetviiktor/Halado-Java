package hu.me.krz.haladojava;

import java.util.Random;

public class Planet {
	
	private Point position;
	private int radius;
	private String name;
	
	

	public Planet(Point point, int radius, String name) {
		super();
		this.position = point;
		this.radius = radius;
		this.name = name;
	}

	public Point getPosition() {
		return position;
	}

	public int getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}

	public void observeTheSky() {
		Planet[] planet = new Planet[10];
		Point point = new Point(0, 0, 0);
		Random rand = new Random();
		
		for (int i = 0; i < planet.length; i++) {
			Point point2 = new Point(i*10, 0, 0);
			planet[i] = new Planet(point.transform(point2),Math.abs(rand.nextInt()),"Galileo"+i);
			System.out.println(planet[i]);
		}
	}

	@Override
	public String toString() {
		return "Planet [position=" + position + ", radius=" + radius + ", name=" + name + "]";
	}
	
	
}
