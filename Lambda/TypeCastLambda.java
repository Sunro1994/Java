package ch14;

public class TypeCastLambda {
/*
 	함수형 인터페이스로 람다식을 참조할 수 있는 것일 뿐, 람다식의 타입이 함수형 인터페이스의 타입과 일치하는 것은 아니다.
 	람다식은 익명 객체이고 타입이 없다. 정확히는 타입은 있지만 컴파일러가 임의로 이름을 정하기 때문에 알 수 없다.
 	그래서 형변환이 필요하다.
 	
 	interface MyFunction {void method(); }라고 가정
 */
	MyFunction f = (MyFunction)(() -> {});		//양변의 타입이 다르므로 형변환이 필요하다.
	
	//람다식은 MyFunction을 직접 구현하지는 않았지만, 이 인터페이스를 구현한 클래스의 객체와 완전히 동일하기 때문에 위와 같은 형변환을 허용한다. 그리고 생략도 가능하다.
	// 분명 객체인데도 Object타입으로는 형변환 할 수 없다.
	// 람다식은 오직 인터페이스로만 형변환이 가능하다.
	
//	Object obj = (Object)(()->{});		Err.The target type of this expression must be a functional interface
//	굳이 형변환을 하겠다면 먼저 함수형 인터페이스로 변형해야 한다.
	Object obj = (Object)(MyFunction)(()->{});
	String str = ((Object)(MyFunction)(()->{})).toString();
}
