import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape
{
		double radius;
		Circle(double radius)
		{
			this.radius = radius;
		}
		public String getShapeName()
		{
			return "Circle";
		}
		public double computeArea(double radius)
		{
			double area = Math.PI *radius*radius;
			return area;
		}
		public static void main(String[] args) {
			double a = (double)(Math.random());
			ArrayList <Double> asd = new ArrayList<>();
			
			while(a>=0.01)
			{
				a = Math.random();
				System.out.println(a);
				asd.add(a);
			}
			double count = 0;
			System.out.println("Printing values");
			for(double i:asd)
			{
				System.out.println(i);
				count++;
			}
			double ff=0;
			for(double f:asd)
			{
				if(f<0.5)
				{
					asd.remove(f);
					ff++;
				}
			}
		}
		public double getRadius() {
			return radius;
		} 	
		
	    
}

