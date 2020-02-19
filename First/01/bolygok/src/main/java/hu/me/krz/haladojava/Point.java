package hu.me.krz.haladojava;

public class Point {

	private final long x;
	private final long y;
	private final long z;
	
	public Point(long x, long y, long z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public long getX() {
		return x;
	}

	public long getY() {
		return y;
	}

	public long getZ() {
		return z;
	}
	
	public Point transform(Point point) {
		Point newPoint = new Point(x + point.x, y + point.y, z + point.z);
		return newPoint;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
}
