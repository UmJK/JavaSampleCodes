import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
public class StreamDemo {
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		//ex6();
		//ex7();
		//ex2_1();
		ex3_1();
	}
	private static void ex3_1() {
		double[] arm = new Random().doubles(1000).toArray();
		double sumofsqr = DoubleStream.of(arm).reduce((s1,s2)->(Math.sqrt(s1)+Math.sqrt(s2))).getAsDouble();
		double sofsqrt = DoubleStream.of(arm).map(s->Math.sqrt(s)).reduce((s1,s2)->(s1+s2)).getAsDouble();
		double sosqrt = DoubleStream.of(arm).parallel().map(s->Math.sqrt(s)).reduce((s1,s2)->(s1+s2)).getAsDouble();
	}
	static void ex1()
	{s
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		words.stream().forEach(s-> System.out.println("  "+s));
	}
	static void ex2()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		words.stream().forEach(System.out::println);
	}
	static void ex3()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		List<String> n = words.stream().map(s->s+"!").collect(Collectors.toList());
		System.out.println(n);
	}
	static void ex4()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		List<String> eyeWords = words.stream().map(s->s.replace("i", "eye")).collect(Collectors.toList());
		System.out.println(eyeWords);
	}
	static void toUpperCase(String s)
	{
		
	}
	static void ex5()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		List<String> eyeWords = words.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(eyeWords);
	}
	static void ex6()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		List<String> eyeWords = words.stream().filter(s->(s.length()<4)).collect(Collectors.toList());
		System.out.println(eyeWords);
	}
	static void ex7()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		List<String> eyeWords = words.stream().filter(s->s.contains("b")).collect(Collectors.toList());
		List<String> eyeforeye = words.stream().filter(s -> (s.length() %2) == 0).collect(Collectors.toList());
		System.out.println(eyeWords);
		System.out.println(eyeforeye);
	}
	static void ex2_1()
	{
		List<String> words  = new ArrayList<>();
		words.add("hi");
		words.add("hello");
		words.add("o");
		words.add("my");
		words.add("god");
		words.add("hello");
		String eyeWords = words.stream().reduce("",(s1,s2) -> s1.toUpperCase()+s2.toUpperCase());
		String wasim = words.stream().map((s1)->s1.toUpperCase()).reduce("",(s1,s2)->s1.concat(s2));
		String gaon = words.stream().reduce("",(s1,s2) -> (s1+","+s2));
		System.out.println(eyeWords);
		System.out.println(wasim);
		System.out.println(gaon);
	}
	
}
