package hi2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Study_TreeMap {

	public static void main(String[] args) {
		
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "K", "Z", "D"};
		TreeMap map = new TreeMap();
		
		for(int i = 0; i < data.length; i ++) {
			if(map.containsKey(data[i])) {
				Integer it = (Integer)(map.get(data[i]));
				map.put(data[i], (Integer)(it + 1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		
		Iterator it = map.entrySet().iterator();             // 키와 값을 it에 저장
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();           // 엔트리(키와 값의 결합)를 새로운 객체에 저장
			int value = ((Integer)entry.getValue());          // 값만 value에 int형으로 저장
			System.out.println(entry.getKey() + " : " + printBar('#',value) + " " + value);
		}
	}
	
	public static String printBar(char ch, int num) {
		
		char[] chars = new char[num];
		
		for(int i = 0; i < num; i++) {
			chars[i] = ch;
		}
		
		return new String(chars);
	}
}
