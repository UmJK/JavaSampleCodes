import java.util.*;
public class Utils {
	public static void main(String[] args)
	{
		ex1();
	}
	private static void ex1()
	{
		List<String> asd = new ArrayList<>();
		asd.add("eee");
		System.out.println( filterUtils(asd, isPredicate()) );
		
	}
}
