package stringtokenizer;

import java.util.StringTokenizer;



public class aboutStringTokenizer {
public static void main(String[] args) {
	/*
	 	delimiter를 기준으로 token이라는 여러 개의 문자열로 잘라내는데 사용된다.
	 	예를 들어 100,200,300,400이라는 문자열이 있을 때 , 를 구분자로 잘라내면 "100","200","300","400"이라는 4개의 문자열을 얻을 수 있다.
	 	String의 split(String regex)나 Scanner의 userDelimiter(String pattern)을 사용할 수도 있지만 정규식 표현을 해야 하므로
	 	간단하면서도 명확한 결과를 얻을때 사용한다.
	 	하지만 단 하나의 구분자만 사용가능하다.
	 	
	 	StringTokenizer(Stirng str, string delim)
	 	문자열을 지정된 구부낮로 나누는 StringTokenizer을 생성
	 	
	 	StringTokenizer(String str, String delim, boolean returnDelims)
	 	문자열을 지정된 구분자로 나누는 StringTokenizer를 생성, returnDelims의 값을 true로 하면 구분자도 토큰으로 간주
	 	
	 	int countTokens()
	 	전체 토큰의 수를 반환
	 	
	 	boolean hasMoreTokens()
	 	토근이 남아있는지 알려준다.
	 	
	 	String nextToken()
	 	다음 토큰을 반환한다.
	 */
	
	String source = "100,200,300,400";
	StringTokenizer st = new StringTokenizer(source, ",");
	
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
}
}
