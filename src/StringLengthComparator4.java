import java.util.Comparator;

public class StringLengthComparator4 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String arg1 = ((String) o1);
		String arg2 = ((String) o2);
		boolean r = arg1.contains("e");
		boolean s = arg2.contains("e");
		if(r==false && s==true)
			return 1;
		else if(r==true && s==false)
			return -1;
		return 0;
	}

}
