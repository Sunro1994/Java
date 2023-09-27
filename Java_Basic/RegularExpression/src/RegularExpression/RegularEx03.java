package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx03 {
public static void main(String[] args) {
	String source = "HP:011-1111-1111, HOME:02-999-9999 ";
	String pattern = "{(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
	
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(source);
	
	int i=0;
	//find()는 주어진 소스 내에서 패턴과 일치하는 부분을 찾아내면 true, 다시 find()를 호출하면 다음부터 다시 패턴매칭을 시작
//	while(m.find()) {
	
//	정규식의 일부를 괄호로 나누어 묶어서 그룹화할 수 있다. 그룹화 부분은 하나의 단위로 묶이는 셈이 되어서 한번 또는 그 이사으이 반복을 의미하는 +,*
//	가 뒤에 나오면 그룹화된 부분이 적용대상이 된다.
//	group() 또는 group(0)은 그룹으로 매칭된 문자열을 전체를 나누어지지 않은 채로 반환한다.
//		System.out.prinln( ++i + ": "+m.group() + " -> " + m.group(1)
//								+ ", " + m.group(2), ", " + m.group(3));
//	{(0\\d{1,2}) >> 0을 포함한 두자리 숫자(최소 두자리 최대 3자리)
//	(\\d{3,4}) >> 최소 3자리 최대 4자리 숫자
//	(\\d{4})	>> 4자리의 숫자
	
	
	}


	}

