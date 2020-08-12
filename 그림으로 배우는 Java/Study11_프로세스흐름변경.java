package hello;

import java.util.Scanner;

public class Study11_프로세스흐름변경 {

	public static void main(String[] args) {
		
		System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까??");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int test = 0; test <=5; test++) {
			for (int i = 1; i <= 10; i++) {
			
				System.out.println(i + "번째 반복중입니다.");
			
				if (i == num) {
				
					System.out.println("반복을 종료합니다.");
					break;
				
				}
			
			}
			System.out.println("테스트 중입니다.");
			
			scan.close();
		}
		//break문은 앞서 Switch문에서 공부를 했을 것이다.
		//break문을 사용하면 처리의 흐름을 강제로 종료시키고 해당 블록을 빠져나가게 한다.
		//그래서 입력받은 값과 i의 값이 같아지면 if문이 실행되서 반복문을 빠져나가게 되는 것이다.
		//위 반복문에서 test를 사용한 반복문은 break문을 사용하면 전체 반복문 
		//즉 test의 반복문 까지 나가지는가를 테스트 해봤지만 그것은 아니고 
		//바로 위에있는 반복문 까지 영향을 미치는 것 같다.
		
		System.out.println("점수를 입력하세요.");
		
		num = scan.nextInt();
		
		switch(num) {
		
		case 1:
		case 2:
			System.out.println("노력하세욧!");
			break;
		case 3:
		case 4:
			System.out.println("아쉽습니다!");
			break;
		case 5:
			System.out.println("잘했어요!");
			break;
		default:
			System.out.println("점수를 입력하세요!");
			break;
		}
		//앞에 switch문에서 case에서 break를 사용하지 않으면 끝내지 않고 다음 case까지 이어간다고 배웠다
		//그걸 이용하여서 case의 범위를 지정하는 명령문이다.
		//이처럼 break문을 잘 이용하면 프로그램의 흐름을 제어할 수 있다.
		
		System.out.println("몇 번째 반복을 건너 뛰겠습니까??");
		num = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == num) {
				
				continue;
			}
			
			System.out.println(i + "번 반복하였습니다.");
			
		}
		//break문이 명령문을 중료한다면 continue문은 반복처리를 진행하는 중 
		//(자신이 지정한)특정 구간을 건너 뛴 다음, 블록의 시작 위치로 돌아가서 다음 작업을 진행한다.
		
	}

}
