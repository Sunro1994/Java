package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx04 {
public static void main(String[] args) {
	String source = "A broken hand works, but not a broken heart.";
	String pattern = "broken";
	StringBuffer sb = new StringBuffer();
	
	Pattern P = Pattern.compile(pattern);
	Matcher M = P.matcher(source);
	System.out.println("source : " + source);
	
	int i=0;
	
	//반복을 통해 처음과 두번째 broken을 찾아내어 치환한다.
	while(M.find()) {
		System.out.println(++i + "번째 매칭:" + M.start()+ "~"+M.end());
		// broken을 drunken으로 치환하여 sb에 저장한다.
		// 처음 sb에 저장된 내용 : "A drunken"
		// 두번째 sb에 저장된 내용 : "A drunken hand works, but not a drunken"
		M.appendReplacement(sb, "drunken");
	}
	
	//m.appendTail(sb)가 호출되면 마지막으로 치환된 이후의 부분을 sb에 덧 붙인다.
	//sb : "A drunken hand works, but not a drunken heart."
	M.appendTail(sb);
	System.out.println("Replacement count : " + i);
	System.out.println("result : " + sb.toString());
}
}
