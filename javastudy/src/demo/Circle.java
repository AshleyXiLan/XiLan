package demo;

public class Circle extends Shape {
	 
	 
	@Override
	public void perimeter(double x,double y) {
		// TODO Auto-generated method stub
   double p = y*x;
   System.out.println("The circle's perimeter is "+p);
	}

	@Override
	public void area(double x,double y) {
		// TODO Auto-generated method stub
		double a = 2*y*x*x;
		System.out.println("The circle's area is "+a);
	}

}
