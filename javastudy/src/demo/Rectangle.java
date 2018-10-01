package demo;

public class Rectangle extends Shape {
  
	

	@Override
	public void perimeter(double x, double y) {
		// TODO Auto-generated method stub
		
		
		double p = 2*(x+y);
		System.out.println("The reactangle's perimeter is "+p);
	}

	@Override
	public void area(double x, double y) {
		// TODO Auto-generated method stub
      double a = x*y;
      System.out.println("The reactangle's area is "+a);
	}

}
