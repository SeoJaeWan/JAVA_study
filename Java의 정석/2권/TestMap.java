package hi2;

import java.util.*;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		
		Map map1 = new HashMap();

		Iterator it;
		
		map1.put("123",147);
		map1.put("456",258);
		map1.put("789",369);
		
		System.out.println(map1.values());    // [147, 258, 369]  값 전체 
		System.out.println(map1.entrySet());  // [123=147, 456=258, 789=369]  키와 값의 묶음
		System.out.println(map1.keySet());    // [123, 456, 789]  키 전체
		
		it = map1.entrySet().iterator();
		
		System.out.println(it.next());        // 123=147
		
		Map.Entry entry = (Entry) it.next();
		
		System.out.println(entry);            // 456=258
		System.out.println(entry.getKey());   // 456  // 키
		System.out.println(entry.getValue()); // 258  // 값
	}

}
