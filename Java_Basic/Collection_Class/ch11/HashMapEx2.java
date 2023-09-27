package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map= new HashMap();
		
		map.put("김자바", 100);
		map.put("이자바", 40);
		map.put("강자바", 80);
		map.put("인자바", 70);
		map.put("바자바", 80);
		
		Set set= map.entrySet();
		Iterator it= set.iterator();
		
		while(it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println("이름 :" + e.getKey() + " 점수 :"+ e.getValue());
		}//while
		
		set = map.keySet();
		System.out.println("참가자 명단 :"+set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total=0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점"+total);
		System.out.println("평균 : "+ (float)total/set.size());
		System.out.println("최고 점수" + Collections.max(values));
		System.out.println("최고 점수" + Collections.min(values));
		
	}//main
}
