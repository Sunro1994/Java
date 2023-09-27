package ch14;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class FunctionPackage {
public static void main(String[] args) {
	
//	1.Function패키지
//	java.lang.Runnable	void run() 			: 매개변수와 반환값 모두 없음
//	Supplier<T>			T get()				: 매개변수는 없고, 반환값만 있음
//	Consumer<T>			void accept(T t) 	: Supplier와 반대로 매개변수만 있고, 반환값이 없음
//	Function<T,R>		R apply(T t) 		: 일반적인 함수, 하나의 매개변수를 받아 결과를 반환
//	Predicate<T>		boolean test(T t) 	: 조건식을 함수로 표현하는데 사용됨, 매개변수 하나, 반환 타입은 boolean
	
//  2. 매개변수가 두 개인 함수형 인터페이스
//	매개변수의 개수가 2개인 함수형 인터페이스는 이름 앞에 접두사 Bi가 붙는다.
//	매개변수의 타입으로 보통 T를 사용하므로, 알파벳에서 T의 다음 문자인 U, V, W를 매개변수의 타입으로 사용하는 것일 뿐 다른 의미는 없다.
	
//	BiConsumer<T,U>		void accept(T t, U u) 	:	두 개의 매개변수만 있고, 반환값이 없음
//	BiPredicate<T,U>	boolean test(T t ,U u) 	:	조건식을 표현하는데 사용, 매개변수는 둘, 반환값은 boolean
//	BiFunction<T,U,R>	R apply(T t, U u)		: 	두 개의 매개변수를 받아서 하나의 결과를 반환
	
//	3. 3개 이상의 매개변수를 갖는 함수형 인터페이스
//	필요하다면 직접 만들어 써야한다.
//	만일 3개 이상의 매개변수를 갖는 함수를 만들경우 아래와 같이 만든다.
//	interface TriFunction<T,U,V,R> {
//	R apply(T t, U u , V v); }
	
	
//	4. UnaryOperator 와 BinaryOperator
//	매개변수의 타입과 반환형이 일치한다는 점을 제외하고는 Function과 동일하다.
	
//	UnaryOperator<T>	T apply(T t)	Function의 자손
//	BinaryOperator<T>	T apply(T t)	Function의 자손
	
//	5. 컬렉션 프레임웍과 함수형 인터페이스
//		컬렉션 프레임웍의 인터페이스에 다수의 디폴트 메서드가 추가되었는데 그 중 일부가 함수형 인터페이스를 사용한다.
	
//	Collection	boolean removeIf(Predicate<E> filter) 		조건에 맞는 요소를 삭제
//	List		void replaceAll(UnaryOperator<E> operator)	모든 요소를 변환하여 대체
//	Iterable	void forEach(consumer<T> action)			모든 요소에 작업 action을 수행
//	Map			V compute(K key, Function<K,V> f)			지정된 키의 작업 f를 수행
//				V computeIfAbsent(K key, Function<K,V> f)	키가 없으면, 작업 f 수행  후 추가
//				V computeIfPresent(K key, Function<K,V> f)	지정된 키가 있으면, 작업 f수행
//				V merge(K key, BiFunction<K,V,V> f)			모든 요소에 병합작업 f를 수행
//				void forEach(BiConsumer<K,V> action)		모든 요소에 작업action을 수행
//				void replaceAll(BiFunction<K,V,V> f)		모든 요소에 치환작업 f를 수행
	
//	6. 기본형을 사용하는 함수형 인터페이스
//	DoubleToIntFunction		int applyAsInt(double d)		A ToBFunction은 입력이 A타입 출력이 B타입이다.
//	ToIntFunction<T>		int applyAsInt(T value)			ToBFunction은 출력이 B타입이다. 입력은 지네릭 타입
//	IntFunction<R>			R apply(T t, U u)				AFunction은 입력이 A타입이고 출력은 지네릭 타입
//	ObjIntCounsumer<T>		void accept(T t, U u)			ObjAFuction은 입력이 T,A타입이고 출력은 없다.
	
	
}
}
