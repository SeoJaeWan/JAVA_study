package hello;

import java.util.Scanner;

public class Study13_배열2 {

	public static void main(String[] args) {
		
		int[] test1 = new int[3];
		
		test1[0] = 1;
		test1[1] = 2;
		test1[2] = 3;
		
		System.out.println("test1 배열을 만들었습니다.");
		System.out.println("test2배열에 test1배열을 삽입합니다!");
		
		int[] test2 = test1;
		
		System.out.println("test2배열의 값을 출력합니다.");
		for (int num = 0;num <3;num++) 
			System.out.println(test2[num]);
		
		System.out.println("test1배열의 값을 변경하겠습니다.");
		
		test1[0] = 3;
		test1[1] = 2;
		test1[2] = 1;
		
		System.out.println("test1의 값을 출력합니다.");
		for (int num = 0;num <3;num++) 
			System.out.println(test1[num]);
		
		System.out.println("test2의 값을 출력합니다.");
		for (int num = 0;num <3;num++) 
			System.out.println(test2[num]);
		//위를 보면 test1이란 배열을 만들고 test2 배열에 test1배열의 값을 넣었다.
		//우리가 보통생각해보면 test1[]의 값을 test2[]의 값에 넣는다고 생각하지만 이것은
		//test2[]에 test1[]자체를 넣기 떄문에 test1[]의 값이 바뀌면 test2[]의 값도 같이 바뀐다.
		//test1[]의 값만 넣고 싶다면 		test2[0] = test1[0]; test2[1] = test1[1]; test2[2] = test1[2];
		//이렇게 지정해주면 된다.
		
		int[] test = {80,60,22,50,75};
		
		for(int i = 0;i<5;i++)
			System.out.println((i+1) + "학생의 성적은 " + test[i] + "입니다.");
		
		System.out.println("학생의 수는 " + test.length + "입니다." );
		//배열의 길이를 알기위해서 반복문 등을 사용하여 변수에 값을 카운팅하여 구할수도 있지만
		//length를 사용하여 배열의 길이를 구하는 방법이 있다.
		
		for(int out:test)
			System.out.println(out);
		//위처럼 다양하게 반복문을 사용할 수 있는데 out변수안에 test배열 값을 하나씩 넣어
		//test배열이 모두 out에 들어가면 반복을 종료하는 반복문이다.
			
		Scanner scan = new Scanner(System.in);
		
		int[] test3 = new int[5];
		
		System.out.println(test3.length + "명 학생의 점수를 입력하세요!");
		
		for(int i = 0;i<test3.length;i++) 
			test3[i] = scan.nextInt();

		for(int i = 0;i<test3.length-1;i++) {

			for (int j = i+1;j <test3.length;j++) {
			
				if(test3[i]>test3[j]) {
					
					int tmp = 0;
					tmp = test3[i];
					test3[i] = test3[j];
					test3[j] = tmp;
	
				}
				
			}
			
			scan.close();
		}
		
		for(int i = 0;i<test3.length;i++) 
			System.out.println(test3[i]);
		
		//배열을 정리하는 문장이다.
		//중간 반복문에서 내가 실수한 것이 있는데 i<test3.length-1여기서 -1을 하지 않고 그냥 하면 아래 반복문 j에서 
		//배열의 길이를 초과하는 값을 가지게 되어서 오류가 생긴다.
		//배열을 다룰때는 이러한 점이 있다는 사실을 인지하고 주의해야한다!
	}
	
}
