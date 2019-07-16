
public class CircleApp
{
	public static void main(String[] args)
	{
		Circle p = new Circle(10);
		double rr = p.computeArea(p.radius);
		System.out.println(rr);
	}
}