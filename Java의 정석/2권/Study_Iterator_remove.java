package hi2;

import java.util.*;

public class Study_Iterator_remove {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		List origial = new ArrayList();
		List copy1 = new ArrayList();
		List copy2 = new ArrayList();
		
		for(int i = 0;i < 10; i++)
			origial.add(i + "");
		
		Iterator it = origial.iterator();
		
		while (it.hasNext())
			copy1.add(it.next());
		
		System.out.println("= Original에서 Copy1로 복사 = ");
		System.out.println("Original : " + origial);
		System.out.println("Copy1 : " + copy1);
		
		it = origial.iterator();
		
		while (it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("= Original에서 Copy2로 복사 = ");
		System.out.println("Original : " + origial);
		System.out.println("Copy2 : " + copy2);
	}

}
