package ch14;

class Outer{
	int val =10;	//Outer.this.val
	
	class Inner{
		int val =20; //thsi.val
	
		void method(int i) {	//void method(final int i) {
			int val =30;
//			i =10;				//Err 상수의 값을 변경할 수 없음;
			
			MyFunction2 f = () -> {
				System.out.println("		i:"+ i);
				System.out.println("		val:"+val);
				System.out.println("		this.val:"+ ++this.val);
				System.out.println("		Outer.this.val:" + ++Outer.this.val);
			};
			f.myMethod();
		}//method
	}//Inner
}//Outer
public class LambdaEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
}
