import java.util.Comparator;

public class StringLengthComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String arg1 = ((String) o1);
		String arg2 = ((String) o2);
		int a = (int)(arg1.charAt(0));
		int b = (int)(arg2.charAt(0));
		if(a < b)
			return -1;
		else if(a>b)
			return 1;
		return 0;
	}

}
