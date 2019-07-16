import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import static java.util.Comparator.comparingInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class BasicLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> iList= new ArrayList<>();
		iList.add("MyHome");
		iList.add("good");
		iList.add("umakant");
		iList.add("person");
		//ex2();
		//ex3();
		//ex4();
		ex5();
		Collections.sort(iList);
		for(String str:iList)
		{
			System.out.println(str);
		}
		Collections.sort(iList,(o1,o2)->o1.length()-o2.length());
		for(String str:iList)
		{
			System.out.println(str);
		}
		System.out.println("2");
		Collections.sort(iList,(o1,o2)->o2.length()-o1.length());
		for(String str:iList)
		{
			System.out.println(str);
		}
		System.out.println("3");
		Collections.sort(iList,new StringLengthComparator3());
		for(String str:iList)
		{
			System.out.println(str);
		}
		System.out.println("4");
		Collections.sort(iList,new StringLengthComparator4());
		for(String str:iList)
		{
			System.out.println(str);
		}

	}
	private static void ex5() {
		List<String> words = Arrays.asList("hi", "hello","MyGod","buffalo","goodenough");
		List<String> shortWords = BasicLambdas.allMatches(words, s -> s.length() < 4);
		
	}
	private static List<String> allMatches(List<String> words, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	private static void ex4() {
		
		
	}
	public static<T> betterElement(T first, T second, TwoElementPredicate<T> condition) {
		
		if(condition.isFirstBetter(first, second))
		{
			return first;
		}
		else
			return second;
	}
	
	
	public static int eChecker(String s1,String s2)
	{
		
	}
	private static void ex2()
	{
		Collections.
	}
	private static void ex3()
	{
		String longer = betterString("asadsdsa","asdasfev",(arg1,arg2)->arg1.length()>arg2.length());
		System.out.println(longer);
	}
	public static String betterString(String first,String second,TwoStringPredicate condition)
	{
		if(condition.isFirstBetter(first, second))
		{
			return first;
		}
		else
			return second;
	}
	List<String> shortWords = BasicLambdas.allMatches(iList,s->s.length<4);
	
}

