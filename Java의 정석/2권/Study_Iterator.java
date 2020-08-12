package hi2;

import java.util.*;

public class Study_Iterator {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator it = list.iterator();     // 컬렉션 프레임웍에 저장된 요소를 읽어오는 방법은 Iterator로 표준화 되어있다.
		                                   // Iterator() 메서드는 Collection에 정의되어 있기 때문에 자손인 List와 Set에도 포함되어있다.  
		while(it.hasNext()) {              // hasNext() 메서드는 읽어올 다음 요소가 남아있는지 확인해준다.
			System.out.println(it.next()); // next() 메서드는 다음 요소를 읽어 온다. <= 다음 요소가 없을 수 있기 때문에 hasNext()메서드로 확인하는 것이 안전하다. 
		}
		
		Map map = new HashMap();
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		Iterator itK = map.keySet().iterator();
		Iterator itE = map.entrySet().iterator();
		
		while(itK.hasNext()) {
			System.out.println(itK.next());
			System.out.println(itE.next());
		}
	}
}
