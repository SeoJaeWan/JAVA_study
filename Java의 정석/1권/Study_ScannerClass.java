package hi;

import java.util.Scanner;

public class Study_ScannerClass {

	public static void main(String[] args) {
	//	자바의 정석 510p	
		Scanner sc = new Scanner(System.in);
		String[] arr = null;
		
		while (true) {
			
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = sc.nextLine();
			
			input = input.trim();		// 앞뒤 공백문자를 없애준다.
			arr = input.split(" ");		// ""안에 있는 값을 기준으로 문장을 나눠준다.
										// split을 이용해 + 단위로 나누고 싶다면 \\+를 써야한다.
										// input = ("100+200+300"); input.split("\\+"); 
			String command = arr[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if("q".equals(command))
				System.exit(0);		// 코드 실행을 멈춘다.
			else
				for(int i = 0 ; i < arr.length;i++) 
					System.out.println(arr[i]);
		}
	}
}
