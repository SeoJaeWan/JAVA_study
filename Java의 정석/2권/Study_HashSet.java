package hi2;

import java.util.HashSet;
import java.util.Set;

public class Study_HashSet {

	public static void main(String[] args) {
		Object[] o = {"1",new Integer(1), "2", "2", "4", "3", "4", "4",};
		Set set = new HashSet();  

		for(int i = 0; i < o.length; i++) {
			System.out.println(set.add(o[i]));
		}
		
		System.out.println(set);
	}
}
