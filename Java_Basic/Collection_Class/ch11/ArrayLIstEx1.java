package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstEx1 {
public static void main(String[] args) {
	ArrayList list1 = new ArrayList<>(10);
	list1.add(5);
	list1.add(4);
	list1.add(3);
	list1.add(2);
	list1.add(1);
	list1.add(5);
	
	//1~3까지 인덱스값을 담는다.
	ArrayList list2 = new ArrayList(list1.subList(1, 4));
	System.out.println(list1);
	System.out.println(list2);
	
	System.out.println("--------");
	Collections.sort(list1);
	Collections.sort(list2);
	System.out.println(list1);
	System.out.println(list2);
	System.out.println("--------");
	list2.add("B");
	list2.add("C");
	list2.add(3,"A");
	System.out.println(list1);
	System.out.println(list2);
	System.out.println("--------");
	list2.set(3, "AA");
	System.out.println(list1);
	System.out.println(list2);
	
	System.out.println("---------");
	
	for(int i= list2.size()-1;i>=0;i--) {
		if(list1.contains(list2.get(i))) list2.remove(i);
	}
	System.out.println(list1);
	System.out.println(list2);
	
	System.out.println("---------");
	
	ArrayList list3 = new ArrayList<>();
	list3.add(5);
	list3.add(2);
	list3.add(1);
	list3.add(3);
	list3.add(5);
	
	System.out.println(list3.subList(0, 4));
	System.out.println(list1.retainAll(list3));
	
	
	
	
	
}
}
