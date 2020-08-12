package hi;

import java.util.Scanner;

public class Study_char {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		int i = c1 + 1;
		
		c2++;
		c2++;
		c3 = (char)(c1 + 1);
		
		System.out.println(i);
		System.out.println(c2);
		System.out.println(c3);
		//문자 변수를 연산하면 문자 자체가 연산이 되는 것이 아닌 문자의
		//유니코드의 값을 연산하여 그 값을 다시 문자로 바꾼다.
		//즉 c3는 c1의 a의 유니코드 97에 +1을 하여 98로 연산하여 
		//98의 유니코드인 b라는 값을 얻었다
		
		
	}

}
