abstract class Polygon {
	public abstract double CalcArea();
	public abstract double CalcPeri();
	}
class Circle extends Polygon {
	private int radius;
	
	public Circle() {
		radius = 10;
	}
	public Circle(int r) {
		radius = r;
	}
	public double CalcArea() {
		return 3.14*radius*radius;
	}
	public double CalcPeri() {
		return 2*3.14*radius;
	}
}
class Rectangle extends Polygon {
	private int length;
	private int breadth;
	
	public Rectangle() {
		length = 5;
		breadth = 10;
	}
	
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public double CalcArea() {
		return length*breadth;
	}
	public double CalcPeri() {
		return 2*(length + breadth);
	}
}

class Square extends Rectangle {
	
	public Square() {
		
	}
	public Square(int side) {
		super(side,side);
	}
	public double CalcArea() {
		return super.CalcArea();
	}
	public double CalcPeri() {
		return super.CalcPeri();
	}
}

public class Tester {

	public static void main(String[] args) {
		
		Polygon p1 = new Circle(15);
		System.out.println("Area of Circle: " + p1.CalcArea());
		Circle c1 = new Circle(10);
		System.out.println("Area of circle: " + c1.CalcArea());
		System.out.println("Perimeter of circle: " + c1.CalcPeri());
		System.out.println();
		Rectangle s1 = new Square(5);
		System.out.println("Area of Square: " + s1.CalcArea());
		System.out.println("Perimeter of Square: " + s1.CalcPeri());
		System.out.println();
		Rectangle r1 = new Rectangle(10,14);
		System.out.println("Area of Rectangle: " + r1.CalcArea());
		System.out.println("Perimeter of Rectangle: " + r1.CalcPeri());

	}

}
