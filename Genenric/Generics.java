package ch12;


public class Generics {
/*제네릭스의 장점 
	1. 타입의 안정성을 제공
	2. 타입체크와 형변환의 생략이 가능하여 코드가 간결해짐
*/
	public static void main(String[] args) {
		class Box<T> {} 				// Box : 원시 타입 BOX<T> : T의Box또는 T Box라고 읽음
										// T : 타입 변수 또는 타입 매개변수
	Box<String> b = new Box<String>(); //String : 대입된 타입(매개변수화된 타입), 지네릭 타입 호출
	
	
	
	
//	지네릭 타입으로 배열의 생성을 위한 참조는 가능하나 배열 생성은 불가하다.
//	꼭 배열을 생성해야 한다면 newInstance()또는 Object배열을 생성해서 복사한 다음 T[]로 형변환시켜준다.
	class Box2<T> {
		T[] itemArr;							//T타입의 배열을 위한 참조 변수
		
//		T[] toArray() {
//			T[] tmpArr = new T[itemArr.length];  Err.지네릭 배열 생성 불가
			
	}//Box2
		
/*	두 타입이 상속관계에 있어도 마찬가지로 대입된 타입이 다르기 떄문에 에러가 발생한다.
	Box<Fruit> appleBox = new Box<Apple>();	
	하지만 타입 T가 Fruit인 경우 void add(Fruit item)가 되므로 Fruit의 자손들은 이 메서드의 매개변수가 될 수 있다.
	Box<Fruit> fruitBox = new Box<Fruit>();		OK
	fruitBox.add(new Fruit());					OK
	fruitBox.add(new Apple());					OK
*/
	
	
	
/*	제한된 지네릭 클래스 
 	
 	class FruitBox<T extends Fruit> { 이와 같이 extends를 통해 상속하여 특정 타입의 자손만 타입으로 지정 가능하다.
 	ArrayList<T> list = new ARrayList<T>();
 	}
 	
 	만일 클래스가 아니라 인터페이스를 구현해야 한다는 제약이 필요하다면 이때도extends를 사용하는 것을 명심하자
 	interface Eatable{}
 	class FruitBox<T extends Eatable> {...}
 	
 	클래스가 Fruit의 자손이면서 Eatable인터페이스도 구현해야 한다면 &기호로 연결한다.
 	
 	
 	<? extends T> : 와일드 카드의 상한 제한, T와 그 자손들만 가능
 	<? super   T> : 와이드 카드의 하한 제한. T와 그 조상들만 가능
 	<?>			  : 제한 없음. 모든 타입이 가능.<? extends Object>와 동일
 */
	
	/*	지네릭 메서드
	 	
	 	static <T> void sort(List<T> list, comparator<T> c) 여기서 타입을 Apple로 정한다.
	 	static <Apple> void sort(List<Apple> list, comparator<Apple> c) Grape가 필요하면 또 하나의 지네릭 메서드를 만들어야 한다.
	 	static <Grape> void sort(List<Grape> list, comparator<Grape> c) 
	 	이처럼 번거로운 작업을 효율적으로 하기 위해 <? super Apple>을 사용한다. 
	 	이처럼 번거로운 작업을 효율적으로 하기 위해 <? super Grape>를 사용한다. 
	 	
	 	class FruitComp implements Comparator<Fruit> {
	 	public int compare(Fruit t1, Fruit t2)	return t1.weight-t2.weight;
	 	}
	 	이 처럼 FruitComp를 만들면 Apple과 Grape를 모두 정렬할 수 있다.
	 	
	 	Collections.sort(appleBox.getList(), new FruitComp());
	 	Collections.sort(grapeBox.getList(), new FruitComp());
	 	
	 	public static void printAll(ArrayList<? extends Product> list, ArrayList<? extends Product>list2) {
	 	}
	 	
	 	public static <T extends Product> void printAll(ArrayList<T> list, ArrayList<T> list2)로 코드를 간략화 가능
	 	
	 	
	 	복잡한 제너릭 메서드
	 	public static <T extends Comprable<? super T>> void sort(List<T> list)
	 	해석 : list는 Comparable을 구현해야하며 T또는 그 조상의 타입을 비교하는 Comparable이어야 한다는 것
	 	
	 */
	
	
	/*지네릭 타입의 형변환
		
		Box<Object> objBox = null;
		Box<String> strBox = null;
		
		objBox = (Box<Object>)strBox;	Err
		strBox = (Box<String>)objBox;	Err
		
		Box<? extends Object> wbox = new Box<String>(); 	Ok
		
		FruitBox<? extends Fruit> box = null;
		
		FruitBox<Apple> appleBox = (FruitBox<Apple>)box; 	OK, 미확인타입으로 경고
		경고가 뜨는 이유 : extends Fruite의 조건을 가진 box의 Fruit타입이 여러개인데다가 Apple을 제외한 다른 타입은 Apple로 
					   변환될 수 없기 때문이다.
					   
		Optional<?> EMPTY = new Optional<>();
		여기서 ?은 <? extends Object>를 줄여 쓴것
		
		== Optional<?> EMPTY = new Optional<>();
		== Optional<?> EMPTY = new Optional<Object>();
		!= Optional<?> EMPTY = new Optional<>(?); Err 미확인 타입의 객체는 생성 불가
	
	
		정리
		Optional<Obejct> -> Optional<T>   Err 형변환 불가능
		Optional<Object> -> Optional<?> -> Optional<T>	형변환 가능하나 경고 발생
		
		와일드 카드가 사용된 지네릭 타입끼리도 형변환이 가능하긴 하다.
		FruitBox<? extends Object> objBox = null;
		FruitBox<? extends String> strBox = null;
		
		strBox = (FruitBox<? extends String>)objBox;	OK,하지만 경고
		objBox = (FruitBox<? extends Object>)strBox;	OK,하지만 경고
		
	*/
	}//main
	}

