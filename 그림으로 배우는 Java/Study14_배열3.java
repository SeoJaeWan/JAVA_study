package hello;

import java.util.Scanner;

public class Study14_배열3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] test;
		test = new int[2][2];
		
		test[0][0] = 20;
		test[0][1] = 15;
		test[1][0] = 30;
		test[1][1] = 22;
		
		for(int i = 0;i<2;i++) {
			
			for(int j = 0;j<1;j++) {
				
				System.out.println((i+1) + "번 째 학생의 국어성적은 " + test[i][j]);
				System.out.println((i+1) + "번 째 학생의 영어성적은 " + test[i][j+1]);
				
			}
			
		}
		
		for(int i = 0;i<2;i++) {
			
			System.out.println((i+1) + "번 째 학생의 국어성적은 " + test[0][i]);
			System.out.println((i+1) + "번 째 학생의 영어성적은 " + test[1][i]);
			//이 코드가 내가 작성한 코드보다 좀더 간결하다.
			
		}
		//배열은 다차원으로도 만들어서 사용 할 수 있다.
		//다차원(2차원) 배열을 선언하는 방법은
		//형이름 [][] 배열변수명;
		//배열변수명 = new 형이름[2][원하는값];
		//으로 선언하고 
		//위에 for문이 2개가 있는데 내가 예제를 보고 
		//학생 성적을 나타내는 배열을 만든것인데
		//첫번째는 앞의 값이 학생이고 뒤에 값이 성적으로 나타난것으로 내가 작성하였고
		//두번째는 앞의 값이 성적이고 뒤의 값이 학생인 책에서 나온 방법이다
		//이처럼 예제를 풀 때 바로 책을 보고 따라하지말고 먼저 한번 작성하고 책과 비교하여서 
		//다른점을 분석하는 것도 중요한거 같다.
		
		
		for(int i = 0;i<2;i++) {
		
			System.out.println((i+1) + "학생의 국어성적을 입력하세요");
			test[0][i] = scan.nextInt();
			
			System.out.println((i+1) + "학생의 영어성적을 입력하세요");
			test[1][i] = scan.nextInt();
			
		}
		
		for(int i = 0;i<2;i++) {
			
			System.out.println((i+1) + "번 째 학생의 국어성적은 " + test[0][i]);
			System.out.println((i+1) + "번 째 학생의 영어성적은 " + test[1][i]);
			
		}
		//위 책에 나와있는 코드를 사용하여 입력받고 출력하는 코드를 만들어봤다.
		//내가 작성한 코드를 사용하면 for문이 1개씩 더 들어가는데 
		//책에서 나오는 코드를 사용하니 그걸 간결하게 만들 수 있었다.
		//코드를 짤때는 최대한 간결하게 짜는 습관을 들이는게 좋다고 한다.
		
		int[][] test1 = new int[2][2];
		int[][] test2 = {{15,20},{35,23}};
		int[][] test3 = {{15,22},
						 {20,35},
						 {24}};
		//위에 말한 방식 외에 다차원 배열을 선언하는 방법이다.
		//int[][] test3 = {{15,22},{20,35},{24}}; 이게 특이할 텐데
		//이를 보면 아는거 처럼 다차원 배열은 꼭 모든 길이가 일정할 필요가 없다.
		
		for(int i = 0; i<test3.length;i++) 
			System.out.println((i+1) + "번째 배열의 길이는 " + test3[i].length + "입니다.");
		//앞시간에 배열의 길이를 구하는 방법을 알아봤는데
		//다차원 배열의 길이를 확인하는 방법은 배열명[i].length이다.
		//여기서 i는 배당 배열의 첫번째 []의 값이다.
		
		int[][][] test4 = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
				
						   {{1,2,3},
							{4,5,6},
							{7,8,9}},
						   
						   {{1,2,3},
							{4,5,6}}};
		for(int i = 0; i<test4.length;i++) 
			System.out.println((i+1) + "번째 배열의 길이는 " + test4[i].length + "입니다.");
		//3차원 배열의 길이를 구하는 방법을 한번 짜봤다.
		//큰 뭉텅이의 길이를 3차원 배열의 길이로 나타낸다.
		
		test1[0][0] =1;
		System.out.println(test2[0][0]);
		scan.close();
	}

}
