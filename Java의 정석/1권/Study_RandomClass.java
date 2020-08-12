package hi;

import java.util.*;

public class Study_RandomClass {

	public static void main(String[] args) {
	// 	자바의 정석 500p
		double randNum1 = Math.random();				// 난수를 얻는 방법
		double randNum2 = new Random().nextDouble();	// Math.random()과 마찬가지로 
														// 0.0~ 0.9사이의 난수값을 얻는다.
		System.out.println(randNum1);
		System.out.println(randNum2);
		
		int num1 = (int)(Math.random()*6) + 1;	// 0~6까지의 난수를 얻는 방법이다.
		int num2 = new Random().nextInt(6) + 1;	// 마찬가지로 0~6까지의 난수를 얻는 방법이다.
												// Random클래스의 장점은 종자값을 설정해 난수의 범위를 지정할 수 있는것이다.
		System.out.println(num1);	
		System.out.println(num2);
		
		Random rand1 = new Random(1);		// rand1과 rand2가 같은 종자값을 사용하기 때문에 같은 값을
		Random rand2 = new Random(1);		// 받는 것을 확인 할 수 있다.
		
		System.out.println("= rand1 = ");
		for(int i = 0;i<3;i++) 
			System.out.println(i  + " : " + rand1.nextInt());
		
		System.out.println("= rand2 = ");
		for(int i = 0;i<3;i++)
			System.out.println(i + " : " + rand2.nextInt());
		
		int[] number = new int[100];
		int[] counter = new int[10];
		int count = 0; 
		
		for(int i = 0; i < number.length; i++) {
			
			System.out.printf("%d\t",number[i] = new Random().nextInt(10));
			count ++;
			if(count % 10 == 0)
				System.out.println();
		}
		
		for(int i = 0; i < number.length; i++) {
			
			counter[number[i]]++;
		}
		
		for(int i = 0; i < counter.length; i++) {
			
			char[] a = {'a','b'};
			String b = new String(a);
			System.out.println(i + "의 개수 : " + printGraph('#',counter[i]) + " " + counter[i]);
		}
	}
	
	public static String printGraph(char ch,int value) { // String형 변수는 println에서 호출하면 자신의 모든 요소를 호출하기 떄문에 printGraph의 리턴형태로 사용했다.
														 // char형 배열 변수는 혼자만 호출했을때는 모든 요소가 출력되지만 다른 값이 함께있으면 타입@주소 형식으로 나온다.
		char[] bar = new char[value];					 // 자세한 내용은 자바의 정석 카테고리에서 배열을 검색하면 나온다.
		
		for(int i = 0; i < bar.length;i++) 
			bar[i] = ch;
		
		return new String(bar);
	}
}
