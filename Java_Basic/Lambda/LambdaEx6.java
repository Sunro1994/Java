package ch14;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class LambdaEx6 {
public static void main(String[] args) {
	IntSupplier s = ()-> (int)(Math.random()*100)+1;
	IntConsumer c = i -> System.out.print(i+",");
	IntPredicate p = i-> i%2==0;
	IntUnaryOperator op = i-> i/10*10;	//만약 Function을 사용하면 에러 발생  function f = (a) -> 2*a; a의 타입을 알 수 없으므로 연산이 불가하다.
										//이때에는 function<Integer> f= (a) -> 2*a로 타입을 지정해줘야 한다.
	
	int[] arr = new int[10];
	
	makeRandomList(s,arr);
	System.out.println(Arrays.toString(arr));
	printEvenNum(p, c, arr);
	int[] newArr = dsSomething(op, arr);
	System.out.println(Arrays.toString(newArr));
}

static void makeRandomList(IntSupplier s, int[] arr) {
	for(int i=0;i<arr.length;i++) arr[i] = s.getAsInt();			//get이 아닌 getAsint();
}
static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
	System.out.print("[");
	for(int i : arr) {
		if(p.test(i))
			c.accept(i);
	}
	System.out.println("]");
}
static int[] dsSomething(IntUnaryOperator op, int[] arr) {
	int[] newArr = new int[arr.length];
	
	for(int i=0;i<newArr.length;i++) {newArr[i] = op.applyAsInt(arr[i]);}
	
	return newArr;
}
}

