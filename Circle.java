package abstractTest;

public class Circle extends Shape{

	private int radius ;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return 3.14f * radius * radius;
	}

}
