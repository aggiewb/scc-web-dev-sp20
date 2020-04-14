
public class Octagon implements Shape {
	private int sideLength;
	
	public Octagon(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
	}

	@Override
	public double getPerimeter() {
		return 8 * sideLength;
	}

	@Override
	public String toString() {
		return "One side of this octagon has a length of " + sideLength;
	}
	
}
