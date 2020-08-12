package hi2;

import java.util.Set;
import java.util.TreeSet;

public class Study_TreeSet_RangeSearch {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		String from = "b";
		String to = "d";
		
		set.add("abc");		set.add("alien");	set.add("bat");		set.add("car");
		set.add("Car");		set.add("disc");	set.add("dance");	set.add("dZZZZ");
		set.add("dzzzz");	set.add("elephant");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);	// 정렬을 할때 대소문자를 구분하여 
		System.out.println("result1 : " + set.subSet(from,to));				// 소문자보다 대문자를 우선하기 때문에 
		System.out.println("result2 : " + set.subSet(from, to + "zzzz"));   // 대문자 또는 소문자로 통일하는 것이 좋다.
	}

}
