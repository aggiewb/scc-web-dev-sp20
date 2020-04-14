
public class Hexagon implements Shape{
	private int sideLength;
	
	public Hexagon(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return 3 * Math.sqrt(3) * Math.pow(sideLength, 2) / 2;
	}

	@Override
	public double getPerimeter() {
		return 6 * sideLength;
	}
	
	public String toString() {
		return "One side of this hexagon has a length of " + sideLength;
	}

}
