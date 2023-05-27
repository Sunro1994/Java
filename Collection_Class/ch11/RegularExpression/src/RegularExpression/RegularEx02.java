package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx02 {
public static void main(String[] args) {
	String[] data = {
	        "bat", "baby", "bounus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"
	        		};
	
	String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-0]", "c.","c.*","c\\.","c\\w","c\\d",
		"c.*t", "[b|c].*", ".*a.*",".*a.+","[b|c].{2}"};
	
	for(int x=0; x <pattern.length; x++) {
		Pattern P = Pattern.compile(pattern[x]);
		System.out.print("Pattern : " + pattern[x] + " 결과 : ");
		for(int i=0; i < data.length; i++) {
			Matcher m = P.matcher(data[i]);
			if(m.matches()) System.out.print(data[i] + ",");
		}
		System.out.println();
	}
 
}
}
