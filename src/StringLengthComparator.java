import java.util.Comparator;

public class StringLengthComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return ((String) arg0).length() - ((String) arg1).length();
	}

}
