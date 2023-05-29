package ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterface {
public static void main(String[] args) {
	/* 함수형 인터페이스
	interface MyFunction() {
		public abstract int max(int a, int b);
	}
	
	이 인터페이스를 구현한 익명 클래스의 객체는 다음과 같이 생성된다.
	MyFunction f = new MyFunction() {
		public int max(int a, int b) {
		return a> b? a : b;
	 
	 int big = f.max(5,3);	//익명 객체의 메서드를 호출
	
	
	MyFunction f = (int a, intb) -> a> b? a:b;
	int big = f.max(5,3);
	
	위처럼 익명 객체를 람다식으로대체가 가능한 이유
	(1) 람다식도 실제로는 익명 객체이며 , max도한 익명 객체이다.
	(2) max()메서드와 람다식의 매개변수의 타입,개수, 반환값이 일치하기 때문
	
	그래서 인터페이스를 통해 람다식을 다루기로 결정되었다. 이를 함수형 인터페이스로 부르기로 했다.
	단, 함수형 인터페이스는 오직 하나의 추상메서드만 정의되어 있어야 한다.
	반면에 static 메서드와 default메서드의 개수는 제약이 없다.
	
	@FunctionalInterface                                     //이와 같은 어노테이션을 붙이면 올바르게 정의하였는지 컴파일러가 확인해준다.
	interface MyFunction {
		public abstract int max(int a, int b);
	 */
	
	List<String>list = Arrays.asList("abc","aaa","bbb","ddd","aaa");
	//람다식 사용 전
	Collections.sort(list, new Comparator<String>() {
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	});
	
	
	//람다식 사용 후
	Collections.sort(list,(s1,s2)-> s2.compareTo(s1));
	
	//함수형 인터페이스 타입의 매개변수와 반환타입
	
/*	@FunctionalInterface
	Interface MyFunction {
		void MyFunction();	
	}
	
	void aMethod(MyFunction f) {
		f.myMethod();
	
 	MyFunction f = () -> System.out.println("myMethod()");
 	aMethod(f)
 	
 	또는 참조변수 없이 아래와 같이 직접 람다식을 받는 것도 가능하다.
 	aMethod(() -> System.out.println("myMethod()"));	//람다식을 매개변수로 지정
 	
 	
 
  
  
	}
	
	*/
}
}
