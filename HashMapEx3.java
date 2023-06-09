package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
	//전화번호부 객체 생성
	static HashMap phoneBook = new HashMap();
	public static void main(String[] args) {
		
		addPhoneNo("친구","이자바","010-111-1111");
		addPhoneNo("친구", "김자바","010-123-4567");
		addPhoneNo("친구", "김자바","010-333-4567");
		addPhoneNo("회사", "김대리","010-444-4444");
		addPhoneNo("회사", "박대리","010-555-4444");
		addPhoneNo("회사", "이과장","010-666-4444");
		addPhoneNo("세탁", "010-444-4444");
		
		printList();
	}//main
	
	//그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);		//이름이 중복될 수 있으니 전화번호를 key값으로 한다.
	}	
	//그룹을 추가하는 메서드
		static void addGroup(String groupName) {
			if(!phoneBook.containsKey(groupName))
				phoneBook.put(groupName, new HashMap());
			
//			System.out.println("회사: " + phoneBook.);
		}
		static void addPhoneNo(String name, String tel) {
			addPhoneNo("기타",name, tel);
		}
		
		//전화번호부 전체를 출력하는 메서드
		static void printList() {
			Set set = phoneBook.entrySet();
			Iterator it = set.iterator();
			
			while(it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				
				Set subSet = ((HashMap)e.getValue()).entrySet();
				Iterator subIt = subSet.iterator();
				
				System.out.println("* "+e.getKey()+ "["+subSet.size()+"]");
				
				while(subIt.hasNext()) {
					Map.Entry subE = (Map.Entry)subIt.next();
					String telNo = (String)subE.getKey();
					String name = (String)subE.getValue();
					System.out.println(name +" "+ telNo);
				}
				System.out.println();
			}
		}//printList()
	
}//class
