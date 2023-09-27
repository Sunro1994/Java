package ch14;
import java.util.*;
import java.util.function.Predicate;

public class AboutPredicate {
public static void main(String[] args) {
	
	Predicate<String> isEmptyStr = s ->s.length() ==0;
	String s ="";
	
	if(isEmptyStr.test(s))		//if(s.length()==0)
			System.out.println("This is an empty String.");
}
}
