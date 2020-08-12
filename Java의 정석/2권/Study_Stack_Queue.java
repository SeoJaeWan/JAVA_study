package hi2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Study_Stack_Queue {

	public static void main(String[] args) {
		
		Stack st = new Stack();            
		Queue q = new LinkedList();        //   Queue는  인터페이스로 구성되어 있기 때문에 LinkedList를 사용한다.
		
		st.push("0");        // Stack에 0 1 2 를 입력해주었다.
		st.push("1");
		st.push("2");
		
		q.offer("0");        //  Queue에 0 1 2 를 입력해주었다.
		q.offer("1");
		q.offer("2");
		
		System.out.println("== Stack ==");
		while(!st.empty()) {
			System.out.println(st.pop());   // Stack의 맨위에 저장된 객체를 꺼낸다.
		}
		
		System.out.println("== Queue ==");
		while(!q.isEmpty()) {
			System.out.println(q.poll());   // Queue에서 객체를 꺼낸다
		}
	}

}
