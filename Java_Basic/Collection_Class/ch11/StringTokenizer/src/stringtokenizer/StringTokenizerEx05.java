package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx05 {
public static void main(String[] args) {
	String data = "100,,,200,300";
	
	String[] result = data.split(",");
	StringTokenizer st = new StringTokenizer(data,",");
	
	for(int i=0; i< result.length;i++) {
		System.out.print(result[i]+ "|");		// 빈문자열도 토큰으로 인식, 토큰을 한꺼번에 잘라서 반환
	}
	
	System.out.println("개수 : " + result.length);
	
	int i=0;
	for(;st.hasMoreTokens();i++) {
		System.out.print(st.nextToken()+" | "); // 빈문자열은 토큰으로 인식하지 않음, 토큰을 바로바로 잘라서 반환
	}
	System.out.println("개수 : " +i);
}
}
