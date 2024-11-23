package cisco.java.program;

public class shape {
	
	float side;
	int length;
	int width;
	double radius;
	
	public shape() {
		this.side = 0;
		this.length = 0;
		this.width = 0;
		this.radius = 0;
		
	}
	public shape(float side) {
		this.side = side;
	}
	public shape(int length,int width) {
		this.length = length;
		this.width = width;
	}
	public shape(double radius) {
		this.radius = radius;
	}
	public void displaysquare() {
		float area = side * side;
		System.out.println("The area =" + area);
	}
	public void displayrectangle() {
		int area = length * width;
		System.out.println("The area =" + area);
	}
	public void displaycircle() {
		double area = 22/7 * radius * radius;
		System.out.println("The area =" + area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape square = new shape(4.7);
		square.displaysquare();
		
		shape rectangle = new shape(22, 33);
		rectangle.displayrectangle();
		
		shape circle = new shape(62);
		circle.displaycircle();
		

	}

}
