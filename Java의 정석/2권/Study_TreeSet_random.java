package hi2;

import java.util.Set;
import java.util.TreeSet;

public class Study_TreeSet_random {

	public static void main(String[] args) {
	
		Set set = new TreeSet();
		
		while(set.size() < 6) {
			int num = (int)(Math.random() * 50) + 1;
			set.add(num);
		}
		
		System.out.println(set);
	}
}
