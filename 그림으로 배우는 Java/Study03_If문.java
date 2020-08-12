package hello;

import java.util.Scanner;

public class Study03_If문 {

	public static void main(String[] args) {

		System.out.println("정수를 입력하세요!");
		
		Scanner scan = new Scanner(System.in);
		
		int res = scan.nextInt();
		
		if (res == 1) {
			
			System.out.println("1이 입력되었습니다.");
			
		}
		//if문을 사용했는데 이와같은 문장을 조건판단문이라고 한다.
		//if()의 ()안에는 조건이 들어가는데 지금은 'res변수가 1일 경우'라는 조건이 들어갔다. 
		//해당 조건이 충족할 경우 조건문 안의 명령어를 실행한다.
		//if문을 사용할떄는 꼭 {}가 제대로 들어가있는지 확인하고 가독성을 주의하길 바란다. (조건문 안의 명령문이 1줄일 경우 {}를 스킾해도 된다.)
		
		else if(res ==2) {
			
			System.out.println("2가 입력되었습니다.");
			
		}
		//아래 있는 else문 처럼 if문과 함께 쓰인다.
		//if문 이외의 다른 조건을 만들고 싶을때 if문과 함께 사용된다.
		
		else {
			
			System.out.println("1 이외의 값이 입력되었습니다.");
			
		}
		//if문과 함께 쓰일수 있는 else문이다.
		//else문은 if에 해당하는 조건이 아닌 경우 else문 안에 있는 명령어를 실행한다.
		
		
		System.out.println("처리를 종료합니다.");
		
		scan.close();
	}

}
