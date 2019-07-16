import java.util.Comparator;

public class StringLengthComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((String) o2).length() - ((String) o1).length();
	}

}
