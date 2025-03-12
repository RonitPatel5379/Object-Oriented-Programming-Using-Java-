class Circle {
	double radius;
	double area;

	Circle(double radius) {
		this.radius=radius;
	}

	public void areaofcircle() {
		System.out.println("Area of Circle=" + Math.PI*radius*radius);
	}
}
public class Areaofcircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(3.45);
		c1.areaofcircle();
	}
}