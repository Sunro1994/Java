package ch11;
import java.util.*;



public class ComparatorEx {
public static void main(String[] args) {
	
	String[] strArr= {"cat","dog","lion","tiger"};
	
	Arrays.sort(strArr);
	System.out.println("strArr =" + Arrays.toString(strArr));
	
	Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분안함
	System.out.println("strArr =" + Arrays.toString(strArr));
	
	Arrays.sort(strArr, new Descending());
	System.out.println("strArr =" + Arrays.toString(strArr));
}

}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) *-1 ; // 역순 정렬
	}
		return -1;
	}
}
