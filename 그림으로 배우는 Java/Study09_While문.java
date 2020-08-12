package hello;

public class Study09_While문 {

	public static void main(String[] args) {

		int i = 1;
		
		while( i <= 5) {
			
			System.out.println(i + "번째 반복됩니다.");
			i++;
			
		}
		System.out.println("반복이 끝났습니다.");
		//2번째 반복문인 while문이다.
		//while(조건식){명령문}으로 선언이 가능하다
		//for문과 같이 조건식이 거짓(False)가 될때 까지 반복하여 안에 명령문을 수행한다.
		//for문과 다르게 여기선 초기식을 ()안에서 선언하는게 아니고 while문 밖에서 선언하고 그걸 while문에 사용한다.
		//또 변화식도 따로 명령문 안에 넣어줘야 반복문을 종료할 수 있다.
		
		i = 1;
		
		do {
			
			System.out.println(i+ "번째 반복입니다.");
			i++;
			
		}while( i<= 5);
		
		System.out.println("반복이 끝났습니다.");
		//while문과 비슷한 do~while문이다.
		//do {명령문} while(조건식);으로 선언이 가능하고 while()뒤엔 꼭 ;를 넣어줘야 한다.
		//while문과 다르게 조건식인 while()문이 do 뒤에 있기 때문에 최소한 1번은 반복문이 실행된다는 점을 유의해야한다.
		//또 while문과 do~while문은 둘다 반복문 밖에서 변수를 가져오기 때문에 반복문 블록을 나와서도 그 값이 유지된다는 점도 알아둬야한다.
		
	}

}
