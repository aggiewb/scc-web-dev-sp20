
public class Octagon implements Shape {
	private int sides;
	
	public Octagon(int sides) {
		this.sides = sides;
	}

	@Override
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(sides, 2);
	}

	@Override
	public double getPerimeter() {
		return 8 * sides;
	}

}
