
public class Rectangle extends Shape
{
		int width,length;
		
		public Rectangle(int width, int length) {
			super();
			this.width = width;
			this.length = length;
		}
		public String getShapeName()
		{
			return "Rectangle";
		}
		public double computeArea(int width,int length)
		{
			double area = width*length;
			return area;
		}
}