package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx03 {
public static void main(String[] args) {
	String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자마,80,90,90";
	StringTokenizer st = new StringTokenizer(source,"|");
	
	//1,김천재 ,...,100 2,박수재,...90  3,이자마...90 으로 토큰이 나뉜다.
	
	while(st.hasMoreTokens()) {
		String token = st.nextToken();
		
		StringTokenizer st2 = new StringTokenizer(token,",");
		// ,를 기준으로 1 김천재 ... 100과 구분선이 출력된다.
		// ,를 기준으로 2 박수재 ... 90이 구분선과 함께 출력된다. 3도 동일
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		System.out.println("----------");
		}
	}
}
}
