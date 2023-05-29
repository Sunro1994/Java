package ch14;

public class LambdaEx2 {
	public static void main(String[] args) {
		
		MyFunction f = () ->{};	//MyFunction f = (MyFunction)(()->{});
		Object obj = (MyFunction)(()->{});		//Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunction)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(()->{});  Err. 람다식은 Object타입으로 형변환 안됨
		System.out.println((MyFunction)(()->{}));
//		System.out.println((MyFunction)(()->{}).toString); Errr
		System.out.println(((Object)(MyFunction)(()->{})).toString());
	
	/*
	  ch14.LambdaEx2$$Lambda$1/531885035@6ce253f1
	  컴파일러가 람다식의 타입을 어떤 형식으로 만들어내는지 알 수있다.
	  익명 객체라면 객체의 타입이 외부클래스의이름$번호 와 같은 형식이지만 
	  람다식의 타입은 외부클래스이름$$Lambda$번호와 같은 형식으로 되어 있다.
	 */
	
	
	
	}
}
