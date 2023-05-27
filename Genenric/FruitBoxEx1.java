package ch12;

import java.util.ArrayList;

class Fruit 					{public String toString() {return "Fruit";}}
class Apple extends Fruit 		{public String toString() {return "Apple";}}
class Grape extends Fruit		{public String toSting() {return "Grape";}}
class Toy						{public String toString() {return "Toy";}}
class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> firstBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy>   toyBox	= new Box<Toy>();
		
		firstBox.add(new Fruit());
		firstBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());	Err. new Toy는 appleBox에 담을 수 없음 오직 Apple타입만 가능
		
		toyBox.add(new Toy());
		
		System.out.println(firstBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}
}
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) 	{list.add(item);}
	T	get(int i)		{ return list.get(i);}
	int size()			{return list.size();}
	public String toString() {return list.toString();}
}
