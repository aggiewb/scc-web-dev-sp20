
public class ShapeClient {

	public static void main(String[] args) {
		smallOctagon();
		mediumOctagon();
		largeOctagon();
		
		smallHexagon();
		mediumHexagon();
		largeHexagon();
		
		smallDodecagon();
		mediumDodecagon();
		largeDodecagon();
	}
	
	public static void smallOctagon() {
		Shape octagon = new Octagon(10);
		System.out.println(octagon);
		System.out.println("The perimeter is " + octagon.getPerimeter());
		System.out.println("The area is " + octagon.getArea());
		System.out.println();
	}
	
	public static void mediumOctagon() {
		Shape octagon = new Octagon(50);
		System.out.println(octagon);
		System.out.println("The perimeter is " + octagon.getPerimeter());
		System.out.println("The area is " + octagon.getArea());
		System.out.println();
	}
	
	public static void largeOctagon() {
		Shape octagon = new Octagon(100);
		System.out.println(octagon);
		System.out.println("The perimeter is " + octagon.getPerimeter());
		System.out.println("The area is " + octagon.getArea());
		System.out.println();
	}
	
	public static void smallHexagon() {
		Shape hexagon = new Hexagon(10);
		System.out.println(hexagon);
		System.out.println("The perimeter is " + hexagon.getPerimeter());
		System.out.println("The area is " + hexagon.getArea());
		System.out.println();
	}
	
	public static void mediumHexagon() {
		Shape hexagon = new Hexagon(50);
		System.out.println(hexagon);
		System.out.println("The perimeter is " + hexagon.getPerimeter());
		System.out.println("The area is " + hexagon.getArea());
		System.out.println();
	}
	
	public static void largeHexagon() {
		Shape hexagon = new Hexagon(100);
		System.out.println(hexagon);
		System.out.println("The perimeter is " + hexagon.getPerimeter());
		System.out.println("The area is " + hexagon.getArea());
		System.out.println();
	}
	
	public static void smallDodecagon() {
		Shape dodecagon = new Dodecagon(10);
		System.out.println(dodecagon);
		System.out.println("The perimeter is " + dodecagon.getPerimeter());
		System.out.println("The area is " + dodecagon.getArea());
		System.out.println();
		
	}
	
	
	public static void mediumDodecagon() {
		Shape dodecagon = new Dodecagon(50);
		System.out.println(dodecagon);
		System.out.println("The perimeter is " + dodecagon.getPerimeter());
		System.out.println("The area is " + dodecagon.getArea());
		System.out.println();
	}
	
	public static void largeDodecagon() {
		Shape dodecagon = new Dodecagon(100);
		System.out.println(dodecagon);
		System.out.println("The perimeter is " + dodecagon.getPerimeter());
		System.out.println("The area is " + dodecagon.getArea());
		System.out.println();
		
	}
	
	

}
