package hello;

import java.util.Scanner;

public class Study07_조건연산자 {

	public static void main(String[] args) {
		
		System.out.println("몇번 코스를 선택하시겠습니까?");
		System.out.println("정수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int res = scan.nextInt();
		
		char ans = (res == 1)? 'A':'B';
		
		System.out.println(ans + "코스를 선택하셨습니다.");
		//이번엔 조건문을 사용하지 않고 조건을 사용하는 문장을 만들었다.
		//보면 특이한 문장이 있을 것이다.
		//char ans = (res == 1)? 'A':'B';인데
		//여기서 ()안이 조건식이고 그 뒤에 'A':'B'가 참일경우 A 거짓일 경우 B를 나타내게 한다.
		//간단하게 조건식을 사용할때는 if문 보다는 해당 조건연산자가 더욱 쉬울것이다.
		//(조건)? 참(true)인 경우의 식 : 거짓(false)인 경우의 식;
		
		scan.close();
	}
}
