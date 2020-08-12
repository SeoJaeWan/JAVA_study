package hi2;

import java.util.*;

public class Study_Stack_Ex {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");
		
		printStatus();
		
		goBack();
		System.out.println(" = 뒤로가기 버튼을 누른후 = ");
		printStatus();
		
		goBack();
		System.out.println(" = 뒤로가기 버튼을 누른후 = ");
		printStatus();
		
		goForward();
		System.out.println(" = 앞으로 가기 버튼을 누른후 = ");
		printStatus();

		goForward();
		System.out.println(" = 앞으로 가기 버튼을 누른후 = ");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println(" = 새로운 주소로 이동 후 = ");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("Back : " + back);
		System.out.println("Forward : " + forward);
		System.out.println("현재 화면은 " + back.peek() + " 입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}

}
