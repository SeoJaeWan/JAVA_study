package hello;

import java.util.Scanner;

public class Study08_For문 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=5; i++)	
			System.out.println("반복하고 있습니다.");
				
		
		System.out.println("반복이 끝났습니다.");
		//반복문의 가장 기초 For문
		//for(초기화식;반복조건식;변화를주는식){명령문}으로 사용할 수 있다.
		//초기화식을 넣고 변화를 주는 식을 사용하여 반복조건식이 될때 까지 반복하고 반복조건식에 거짓(False)이 되면 빠져나온다.
		//for문도 if문처럼 명령어가 1개면 {}를 생략할수 있다. 
		
		for(int i = 1;i<=5;i++ ) 	
			System.out.println(i + "번 반복하였습니다.");

		
		System.out.println("반복이 끝났습니다.");
		//반복에 사용한 변수 i를 반복문 안에서 사용하여 명령문을 만들수도 있다.
		//이때 위의 for문과 아래의 for문 둘다 i라는 변수를 사용하지만 각각 반복문 안에서
		//변수를 사용하기 때문에 새롭게 i라는 변수를 선언해주어야한다.
		//반복문 초기화식에서 사용한 i는 반복문 밖에서는 사용할 수 없다.
		//즉 첫번째 for문에서 i라는 변수를 선언하려고 for(int i = 1;~;~)를 사용하고 
		//두번째 for에서도 새롭게 for(int i = 1;~;~)로 선언해주어야한다.
		
		int i;
		
		for(i = 1; i<= 5;i++) {
			
			System.out.println(i + "번째 반복입니다.");
		}
			
		System.out.println("i의 값은 " + i + "입니다.");
		//위에서 반복문 초기화식에서 사용된 변수는 반복문 밖의 블록에서는 사용할수 없다고 했다.
		//반복문 밖에서도 반복문에 사용된 i라는 변수를 사용하고 싶다면 위처럼
		//i라는 변수를 반복문 밖에 미리 선언해두고 반복문에서 초기화식에 i라는 반복문을 선언하지말고 불러오면 된다.
		
		System.out.println("원하는 *의 갯수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(i = 1;i<=num;i++) {
		
			System.out.println("*");
		
		}
		//이처럼 입력받은 수를 이용하여 좀더 다양한 반복문을 만들수도 있다.
		
		System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
		
		int sum = 0;
		num = scan.nextInt();
		
		for (i = 1;i<=num;i++) {
			
			sum +=i;
			//sum = sum + i
			
		}
		
		System.out.println("1부터 num까지의 합은 " + sum + "입니다.");
		//출력뿐만아닌 안에서 연산을 하여 원하는 결과를 만들어 낼 수 있습니다.
		
		scan.close();
	}
	
}
