package ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ReferenceMethod {
	public static void main(String[] args) {
//		람다식을 더욱 더 간결하게 줄일 수 있는 방법이 있다.
//		람다식이 하나의 메서드만 호출하는 경우 사용
		
		Function<String, Integer>f = (s) -> Integer.parseInt(s);
		
//		위 람다식은 다음 표현과 같다.
//		Integer wrapper(String s) {
//			return Integer.parseInt(s);
//		}
	
//		위 람다식을 더 줄여서 메서드 참조를 만들면 이렇게 된다.
		Function<String,Integer> f1 = Integer::parseInt;
		
	 BiFunction<String, String, Boolean> f2 = (s1,s2) -> s1.equals(s2);
	 BiFunction<String, String, Boolean> f3 = String::equals;
	 
//	 이미 생성된 객체의 메서드를 람다식에서 사용한 경우에는 클래스 이름 대신 그 객체의 참조변수를 적어줘야 한다.
	 
//	 MyClass obj= new MyClass();								//새로운 객체
//	 Function<String, Boolean> f = (x) ->obj.equals(x);			///이미 생성된 객체이므로 참조변수를 적어준다.
//	 Function<String, Boolean> f2 = obj::equals;
	 
	 
//	  정리
//	 1. static 메서드 참조 : (x) ->ClassName.method(x)				ClassName::method
//	 2. 인스턴스 메서드 참조 : (obj.x obj의 변수) -> obj.method(x)		ClassName::method
//	 3.	특정 객체 인스턴스메서드 참조 : (x) -> obj.method(x)				obj::method
	 
	 
//	 생성자의 메서드 참조
//	 Supplier<MyClass> s = () -> new MyClass();			람다식
//	 Supplier<MyClass> s = MyClass::new;				메서드 참조
	 
//	 매개변수가 있느 ㄴ생성자라면, 매개변수의 개수에 따라 알맞은 함수형 인터페이스를 ㅏㅅ용하면 된다.
//	 필요하다면 새로 함수형 인터페이스를 정의한다.
	 
//	 Function<Integer, MyClass> f = (i) -> new MyClass(i);	람다식
//	 Function<Integer, MyClass> f2 = MyClass::new;
	 
//	 BiFunction<integer,string,MyClass> bf= (i,s) -> new MyClass(i,s);
//	 BiFunction<Integer,String, MyClass> bg2 = MyClass::new;
	 
//	 배열을 생성할 때
//	 Function<integer, int[]> f = x -> new int[x];
//	 Function<integer, int[]> f2 = int[]::new;
	}//main
}
