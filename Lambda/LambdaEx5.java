package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
	public static void main(String[] args) {
//		매개변수는 없고 반환값만 있다.
		Supplier<Integer> s = () -> (int)(Math.random()*100+1);
//		매개변수만 있고 반환값이 없다.
		Consumer<Integer> c = i -> System.out.print(i+",");
//		매개변수 하나 반환값은 boolean
		Predicate<Integer> p = i-> i%2==0;
//		하나의 매개변수를 받아 반환값을 반환
		Function<Integer, Integer> f = i-> i/10*10;		//i의 일의 자리를 없앤다.
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s,list);
		System.out.println(list);
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	
	
	}//main
	static <T> List<T> doSomething(Function<T,T> f, List<T> list) {
		List<T> newList = new ArrayList<>(list.size());
		
		//apply 는 Function메서드
		for(T i : list) newList.add(f.apply(i));
		
		return newList;
	}
	static <T> void printEvenNum (Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}
	static<T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0;i<10;i++) list.add(s.get());
	}
}
