package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx01 {
public static void main(String[] args) {
	  /*
    정규식 : 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아 내기 위해 사용하는 것
    정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
    정규식을 이용하면 많은 양의 텍스트 파일 중에서 원하는 데이터를 손쉽게 뽑안낼 수 있으며, 형식도 체크할 수 있다.
    html 문서에서 전화번호나 이메일 주소만을 따로 추출도 가능하다.
    내용이 너무 방대하기 때문에 자주 쓰이는 정규식만 알아본다.
*/    
String[] data = {
        "bat", "baby", "bounus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};

// 1. 정규식을 매개변수로 Pattern클래스의 static메서드인 Pattern compile(String regex)을 호출하여 pattern인스턴스를 얻는다.
Pattern P = Pattern.compile("c[a-z]*");

for(int i=0; i<data.length;i++) {
	// 2. 정규식으로 비교할 대상을 매개변수로 Pattern클래스의 Matcher matcher(CharSequence input)를 호출해서 Matcher인스턴스를 얻는다.
    Matcher m  = P.matcher(data[i]);
    // 3. Matcher 인스턴스에 boolean Matches()를 호출해서 정규식에 부합하는지 확인한다.
    if(m.matches()) System.out.print(data[i] + ",");
}
}
}
