import java.util.Scanner;

public class DOWFinder {
	
	public static void main(String[] args) {
		 
		 System.out.println("Enter Day");
		 Scanner in = new Scanner(System.in);
		 int d = in.nextInt();
		 System.out.println("Enter Month");
		 
		 Scanner i = new Scanner(System.in);
		 int m = i.nextInt();
		 
		 System.out.println("Enter Year");
		 Scanner u = new Scanner(System.in);
		 int y = u.nextInt();
		 
		 if((y>1899 && m>4) || (y<2101 && m<3))
		 {
			 int x;
			 x = DOWFinder1(d,m,y);
			 System.out.println(x);
		 }
		 else {
			 System.out.println("Cant Predict");
		 }
		 
		 
		 System.out.println("Hello Java. This is my first java code");
		}
	public static int DOWFinder1(int d,int m,int y)
	{
		int num =0;
		num = (y-1900)*365+((y-1900)/4);
		if(y%4==0 && (m==1 || m==2))
		{
			num = num-1;
		}
		
		switch(m) {
		case 12: 
			num+=30;
		case 11:
			num+=31;
		case 10: 
			num+=31;
		case 9:
			num+=30;
		case 8: 
			num+=31;
		case 6:
			num+=30;
		case 5:
			num+=30;
		case 4: 
			num+=31;
		case 3:
			num+=28;
		case 2:
			num+=31;
		}
		num+=d;
		num = num%7;
		String s[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
		switch(num) {
		case 0: 
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
		String r = s[num];
		System.out.println(r);
		return num;
	}
}
