package hi2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Study_HashSet_random {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);   	// 번호를 크기 순으로 저장하기 위하여 Collections 클래스의 sort를 사용하였다.   
		Collections.sort(list); 			// 이 메서드는 List 인터페이스 타입을 필요로 하기 때문에 LinkedList에 담아서 처리했다.
		
		System.out.println(list);
	}
}
