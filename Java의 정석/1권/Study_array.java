package hi;

import java.util.Scanner;

public class Study_array {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num1,num2;
		double sum = 0.0;
		char opr;
		
		System.out.print("연산식을 입력하세요 : ");
		opr = scn.next().charAt(0);
		
		System.out.print("숫자를 입력하세요 : ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		if(opr == '+') sum = num1+num2;
		else if(opr == '-') sum = num1-num2;
		else if(opr == '*') sum = num1 * num2;
		else { 
			if(num2 != 0)
			sum = (double)num1/num2;
			else
				System.out.println("0으로 나누지 못합니다.");
		}
		
		System.out.println(sum);
	}

}
