package ch14;

import java.util.Arrays;

public class AboutLamda {
//		1.자바의 큰 변화
	/*
	 	JDK1.5 부터 추가된 generics, JDK 1.8 부터 추가된 람다식의 등장
	 	
	 	메서드를 람다식으로 하면 메서드의 이름과 반환값이 없어진다. 람다식을 익명 함수라고도 한다.
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Arrays.setAll(arr,(i) -> (int)(Math.random()*5)+1);
		
/*	위의 식에서 람다식은 아래와 같이 표현된다.
/
	 int method() {
	 return (int) (Math.random()*5)+1;
	 }
*/
		
		
//	2.람다식 작성하기
/*
 	반환타입 메서드이름(매개변수 선언) {
 	문장들
 	}
 	int max(int a, int b) {return a>b?a:b;
 	
 	(1) 반환타입과 메서드 이름을 삭제한다.
 	(int a, int b) {return a>b?a:b;}
 	
 	(2) 매개변수 선언부와 몸통{} 사이에 '->'을 추가한다.
 	(int a, int b) -> {return a>b?a:b;}
 	
 	(3) 반환값이 있는 메서드의 경우, return문 대신 '식(expression)으로 대신할 수 있다.' 이때 끝에';'이 붙지 않는다.
 	(int a, int b) -> a>b? a: b
 	
 	(4)람다식에 선언된 매개변수의 타입은 추론이 가능한 경우 생략 가능하다.
 	(a , b) -> a > b ? a : b
 	
 	(5)선언된 매개변수가 하나뿐인 경우에는 괄호()를 생략할 수 있다. 단 매개변수 타입이 있으면 괄호()를 생략할 수 없다.
 	(a) -> a* a             =>             a - > a * a //OK
 	(int a) -> a * a		=>		   int a - >  a *a //Err
 
 	(6) 괄호 안의 문장이 return문일 경우 생략할 수 없다.
 
 */	
	}
	
	
}
