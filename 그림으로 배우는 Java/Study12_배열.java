package hello;

import java.util.Scanner;

public class Study12_배열 {

	public static void main(String[] args) {
		
		int[] test;
		test = new int[5];
		
		test[0] = 1;
		test[1] = 2;
		test[2] = 3;
		test[3] = 4;
		test[4] = 5;
		
		int[] test2 = new int[5];
		
		int[] test3 = {1,2,3,4,5};
		
		//이번엔 배열을 알아볼것이다.
		//배열은 같은 형의 값을 동시에 여러 개를 기억할 수 있는 변수이다.
		//int[] test;는 우선 배열을 선언하는 방법이다.
		//변수형[] 변수명; 으로 선언 할 수 있다.
		//test = new int[5];는 배열을 생성하는 방법이다.
		//앞서 배열을 선언 할 때는 이 배열이 어느 크기를 가지는지는 없기때문에 따로 선언해줘야한다.
		//변수명 = new 변수형[크기];로 선언할 수 있다.
		//이때 new가 저번부터 자꾸 나오는데 이것은 메모리에 데이터를 저장할 공간을 할당하기 위해서 사용하는 것이다.
		//그리고 Java에서 배열은 0부터 시작하기 때문에 5를 선언했다면 0~4까지의 상자가 생겼다고 보면 된다.
		//그렇기 때문에 5를 선언했을때 test[10]이라는 배열공간은 사용 할 수 없다.
		//근데 위의 배열 선언은 너무 긴 느낌이 있다.
		//int[] test; test = new int[5]를 한줄로 바꿔보자!
		//int [] test = new int[5]; 이렇게 한줄로 만들 수 있다.
		//변수형[] 변수명 = new 변수형[크기]; 이렇게 선언하면 된다.
		//이 외에도 변수형[] 배열 변수명 = {값 1 , 값2, 값3, ...}을 이용해도 된다.
		//{}안에 ,의 수만큼 배열의 크기가 결정된다.
		
		test2[0] = 1;
		System.out.println(test3[1]);
		
		System.out.println("시험 응시자 수를 입력하세요!");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("응시자들의 점수를 순서대로 입력하세요!");
		
		int[] tmp = new int[num];
		
		for(int i = 0;i<num;i++) 
			tmp[i] = scan.nextInt();
		
		for(int i = 0;i<num;i++)  
			System.out.println((i+1) + "번째 학생의 성적은 " + tmp[i] + "입니다.");
		
	
		//키보드로 점수를 입력하여 그 값을 배열에 입력하여 문장을 만들었다.
		//이 코드를 입력하면서 나도 방금 실수를 한게 있는데
		//for문을 사용할떄 i의 값을 0이 아닌 1로 지정하여서 코드가 오류가 생겼다.
		//이처럼 배열은 0부터 시작한다는 사실을 꼭 명심하길 바란다!
		
		scan.close();
	}

}
