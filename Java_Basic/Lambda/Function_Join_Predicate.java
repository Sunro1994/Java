package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Join_Predicate {
public static void main(String[] args) {
//	Function의 합성
//	default <V> Function<T,V> andThen(Function<? super R,? extends V> after))
//	두 람다식을 합성해서 새로운 람다식을 생성할 수 있다.
//	T >> Function<T,R> >> R값 반환	>> Function<R,V> >> V값 반환	
	
//	default <V> Function<V,R> compose(Function<? super V,? extends T> before))
//	V >> Function<V,T> >> T값 반환		>> Function<V,R> >> R값 반환
	
	
//	static <V> Function<T,T> identity()
//	항등식을 만들때 사용
	
//	andThen예시
	
	Function<String, Integer> f = (s) -> Integer.parseInt(s,16);
	Function<Integer,String> g = (i) -> Integer.toBinaryString(i);
	Function<String,String> h = f.andThen(g);
	
	System.out.println(h.apply("FF"));			//FF= (15*16^1 + 15*16^0)
//	String("FF") >> Function<String,Integer> >> Integer(255) >> Function<Integer,String>	>> String("11111111")
	
	
	
//	compose예시
	Function<Integer,String>	g1 = (i) -> Integer.toBinaryString(i);
	Function<String, Integer>	f1 = (s) -> Integer.parseInt(s,16);
	Function<Integer,Integer>	h1 = f.compose(g);
	System.out.println(h1.apply(2));
//	Integer(2) >> Function<Integer,String> >> String("10") >> Function<String,Integer> >> Integer(16);
	
	
//	Identity예시
	Function<String,String> f2 = x ->x;
//	Function<string,String> f = Function.identity();	//위의 문장과 동일
	
	System.out.println(f2.apply("AAA"));
	
	
	
	
//	Predicate의 결합
//	여러 조건식을 논리 연산자인 &&(and), ||(or) , !(not)으로 연결해서 하나의 식을 구성 할 수 있는 것처럼,
//	여러 prediacte를 and(),or(),negate()로 연결해서 하나의 새로운 Predicate로 만들 수 있다.
	Predicate<Integer> p = i-> i <100;
	Predicate<Integer> q = i-> i <200;
	Predicate<Integer> r =  r = i ->i%2==0;
	Predicate<Integer> notP = p.negate();	// i>=100, negate는 반전식
	
	//100 <= i && (i <200 || i%2 ==0)
	Predicate<Integer> all = notP.and(q.or(r));
	System.out.println(all.test(150));		//true
	
	//동일한 아래식
	Predicate<Integer> all1 = notP.and(i -> i < 200).or(i -> i%2 ==0);
	
//	static메서드인 isEqual()은 두 대상을 비교하는 Predicate를 만들 떄 사용한다.
//	is Equal()의 매개변수로 비교대상을 하나 지정하고, 또 다른 비교대상은 test()의 매개변수로 지정한다.
//	Predicate<String> p1 = Predicate.isEqual(str1);
//	boolean result = p1.test(str2);
	
	//str1과 str2과 같은지 비교
//	boolean result = Predicate.isEqual(str1).test(str2);
	
	
	
	
	
	
	
	
	
	
//	default predicate<T>		and(predicate<? super T> other)
//	default Predicate<T>		or(predicate<? super T> other)
//	default Predicate<T.		negate()
//	static <T>	Predicate<T>	isEqual(Object targetRef)
	
	
	








}
}
