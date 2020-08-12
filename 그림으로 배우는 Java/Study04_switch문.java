package hello;

import java.util.Scanner;

public class Study04_switch문 {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력하세요!");
		
		Scanner scan = new Scanner(System.in);
		
		int res = scan.nextInt();
		
		switch(res) {
		
		case 1:
			System.out.println("1이 입력되었습니다.");
			break;
		
		case 2:
			System.out.println("2가 입력되었습니다.");
			break;
			
		default:
			System.out.println("1과 2 이외의 정수가 입력되었습니다.");
			break;
		
		}
		//if문과 유사한 switch문이다.
		//switch()의 ()안에 변수를 입력하고 그 변수의 값에따라 
		//case 뒤에 숫자 혹은 조건을 넣어 그 조건을 충족할 경우 명령문을 수행하고 아니면 다음 case로 이동한다.
		//각 조건안에 break는 문장이 끝나면 switch문을 종료시키기 위해서 사용되는 강제종료문인다.
			
		scan.close();
	}

}
