package hello;
import java.util.Scanner;

public class Study06_관계연산자{

	public static void main(String[] args) {

		System.out.println("당신은 남자입니까?");
		System.out.println("Y 또는 N을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		char res = scan.next().charAt(0);
		
		if(res == 'Y' || res == 'y')
			System.out.println("당신은 남자군요!");
		else if(res == 'N' || res == 'n')
			System.out.println("당신은 여자군요!");
		else 
			System.out.println("Y or N를 입력해주세요");
		
		scan.close();
	}
	//조건문에 논리연산자를 추가한 문장이다.
	//논리연산자로는 && || !이 있다.
	//&&는 And를 ||는 Or을 !는 Not으로 표현된다.
	//그리고 위 문장의 조건문안에는 문장이 1개밖에 없기때문에 {}를 빼고 코딩을 하였고
	//바로 앞에서 배운거 처럼 nextChar()가 아닌 next().charAt(0)를 사용하였다.
}
