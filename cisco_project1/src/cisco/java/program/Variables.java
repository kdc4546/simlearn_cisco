package cisco.java.program;

public class Variables {
	int length,breadth;
	public Variables(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	public void area() {
		int result = length * breadth;
		System.out.println("Area =" + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v1 = new Variables(10,5);
		Variables v2 = new Variables(12,5);
		Variables v3 = new Variables(20,5);
		
		v1.area();
		v2.area();
		v3.area();
		

	}

}
