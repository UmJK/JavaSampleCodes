import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listDemo();

	}
	private static void listDemo()
	{
		List<Circle> circles = new ArrayList<>();
		while(true)
		{
			double aRadius = Math.random();
			while(aRadius<0.01)
			{
				break;
			}
			Circle aCircle = new Circle(aRadius);
			circles.add(aCircle);
	
		}
		//System.out.println("Circles size"+circles.size());
		for(Circle c:circles)
		{
			System.out.println(c.computeArea(c.getRadius()));
		}
		Iterator<Circle> it = circles.iterator();
		while(it.hasNext())
		{
			Circle c = it.next();
			if(c.getRadius()<0.5)
			{
				it.remove();
			}
		}
	}

}
