package studio7;

public class Rectangle {

	private double width;
	private double length;

	public Rectangle(double initWidth, double initLength) {
		width = initWidth;
		length = initLength;
	}

	public double area() {
		return this.width * this.length;
	}

	public double perimeter() {
		return this.width * 2 + this.length * 2;
	}

	public boolean isSmaller(Rectangle other) {
		if(this.area() < other.area()) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isSquare() {
		if(this.width == this.length) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,2);
		Rectangle r2 = new Rectangle(8,3);
		Rectangle r3 = new Rectangle(8,8);
		System.out.println(r1.isSmaller(r3));
		System.out.println(r3.isSmaller(r1));
		System.out.println(r3.isSquare());
		System.out.println(r2.isSquare());
	}

}
