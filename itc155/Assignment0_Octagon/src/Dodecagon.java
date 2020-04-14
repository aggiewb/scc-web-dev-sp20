
public class Dodecagon implements Shape {
	private int sideLength;
	
	public Dodecagon(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return 3 * Math.pow(sideLength, 2) * (2 + Math.sqrt(3));
	}

	@Override
	public double getPerimeter() {
		return 12 * sideLength;
	}
	
	@Override
	public String toString() {
		return "One side of this dodecagon has a length of " + sideLength;
	}

}
