package hi2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Study_HashMap {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		HashMap map = new HashMap();
		String id,pw;
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Id와 Password를 입력해 주세요");
			
			System.out.print("ID : ");
			id = sc.next();
			
			System.out.print("PW : ");
			pw = sc.next();
			
			System.out.println();
		
			if(!map.containsKey(id)) 
				System.out.println("입력하신 ID는 존재하지 않습니다." + " 다시 입력해주세요");
			else 
				if(!map.containsValue(pw))
					System.out.println("입력하신 비밀번호가 일치하지 않습니다. 다시 입력해주세요");	
			
			System.out.println();
		}	while(!(map.containsKey(id) && map.containsValue(pw)));
		
		System.out.println("ID와 비밀번호가 일치합니다.");
		
		Set set = map.keySet();
		System.out.println("ID : " + set);
		
		Collection value = map.values();
		System.out.println("PW : " + value);
	}
}
