package hello;

import java.util.Scanner;

public class Study05_단일문자입력 {

	public static void main(String[] args) {
		
		System.out.println("a혹은 b를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		char res = scan.next().charAt(0);
		
		switch (res) {
		
		case 'a':
			System.out.println("a를 입력하였습니다.");
			break;
			
		case 'b':
			System.out.println("b를 입력하였습니다.");
			break;
			
		default:
			System.out.println("a혹은 b를 입력하여 주세요");
			break;
		
		}
		//문자 1개를 입력받아서 switch문을 사용한 문장인다.
		//흔히 Scanner를 사용할때 next뒤에 해당 문자형을 입력하면 된다고 
		//지난번에 말했지만 단어 1개를 입력받기 위해서는
		//nextChar()가 아닌 next().charAt(0)을 사용한다.
		//문자열을 입력받고 싶다면 next()이다!
		////next()와 nextLine()의 차이점은 next()는 스페이스바를 누르면 입력을 종료하고
		//nextLine()은 엔터키를 누르고 사용한다 .
		//즉 nextLine은 엔터키를 입력종료키로 사용하기 떄문에 스페이스바를 사용할 수 있지만
		//next()는 스페이스바를 입력종료키로 사용하기떄문에 스페이스바를 사용하면 그 뒤 내용은 사라진다.

		scan.close();
	}

}
