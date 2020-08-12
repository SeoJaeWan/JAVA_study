package hello;

import java.io.*;
import java.util.Scanner;

class Study01_기본 {

	public static void main(String[] args) throws IOException {

		//Study01은 기본파트를 다시 한번 정리하는 시간이다!
		//자바프로그램은 기본적으로 바로 위에있는 main(){}부터 작업이 실행된다!
		//주석은 // /* */ 가 있다!
		//아 그리고 main(String[] args) {}에서 String에서 첫 s 대문자임ㅋㅋ 
		//이클립스라서 자동으로 지정되는데 메모장코딩할때는 헷갈리기 쉬움 ㅎ
		
		System.out.println("하이다 시키야!");
		System.out.print("아랫줄이닷!");
		//ln을 사용하면 줄바꿈이 자동으로 적용됨 ㅇㅇ
		
		System.out.println("123");
		System.out.println(123);
		//pirntln안에 ""를 사용하면 문자로 취급되고 println(123)을 사용하면 숫자로 취급
		//그리고 단어 1개만 사용할때는 '' 1개 이상이면 ""을 사용!
		
		System.out.println("10진수의 10은 " + 10 + " 다!");
		System.out.println("2진수의 10은 "+ 0010 + "다!");
		System.out.println("8진수의 10은 " + 010 + " 다!");
		System.out.println("16진수의 10은 " + 0x10 + " 다!");
		//숫자를 10진수로만 표현할 수 있는것이 아닌 2진수 8진수 16진수로도 표현해서 사용할수있다.
		//2진수는 00xx (2진수 형식) 8진수는 앞에 0 (8진수 형식) 16진수는 0x (16진수 형식)
		
		//변수의 형태는 boolean(true , false), char(2바이트 문자 <- 짧은단어) String(문자열), byte(-128~127), short(-32768 ~ 32767)
		//int(-2147483648 ~ 2147483647), long(-9223372036854775808 ~ 9223372036854775807), float(4바이트 부동소수), double(8바이트 부동소수)
		
		String str1 = "어머머머머머머";
		String str2;
		str2 = "어버버버버";
		
		System.out.println(str1);
		System.out.println(str2);
		//변수 선언 방법은 
		//변수형 변수명 = 변수값;
		//혹은 변수형 변수명; 변수명 = 변수값;
		//으로 선언할수 있당!
		//후자의 방법을 변수를 초기화 시킨다라고 한다!
		
		str1 = "변경된 어머머머머머머";
		
		System.out.println(str1);
		//당연한 이야기지만 미리 지정된 str1라는 변수를 바꾸기 위해서 후에 다시 str1값을 지정할수 있다.
		
		int num1,num2;
		num1 = 12;
		num2 = 21;
		
		System.out.println("변수 num1의 값은 " + num1 + " 입니다.");
		
		num1 = num2;
		
		System.out.println("변수 num1에 num2의 값을 넣었습니다 (뾰로롱!)");
		System.out.println("변수 num1의 값은 " + num1 + " 입니다.");
		//미리 지정되어있는 num1에 num2의 값을 위와 같이 대입해주면 num1의 값을 변경할 수 있습니다.
		
		//num1 = 3.14;
		
		System.out.println(num1);
		//주석 처리 해두었지만 num1의 값에 파이(3.14)값을 넣었더니 코딩에 오류가 났습니다.
		//C언어였으면 뒤의 .14값은 사라지고 3만 출력되었겠지만 Java는 얄짤없습니다.
		
		inpt();
		// 메소드 inpt()을 불러내기 위해서 사용한 방법
		
		inpt2();
	}
	
	 public static void inpt () throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(str + " 이 입력되었습니다.");
		
		//잠시 키보드 입력받는 것에 대한 공부를 하려고 했는데 
		//다양하게 보여주기 위해서 일단 메소드(함수)를 사용했다. 이건 후에 다시 설명하겠다.
		//BufferedReader를 사용한 방법은 import java.io.*;를 미리 선언해 두고 메소드에 throws IOException를 포함시켜야 한다.
		//그후 String str = br.readLine();를 사용해서 키보드로 값을 받는 방식이다.
		//문자 외에 숫자 등을 입력하고 싶으면 
		//int num = Integer.parseInt(str);를 입력하면 된다.
		//그렇게 되면 앞서 str에 입력한 문자형이 Integer.parseInt를 거치면서 정수형으로 변형된다.
		//정수 외에 소수로 바꾸고 싶으면 Double.parseInt(str)처럼 앞 Double만 해당 형으로 변형하면 된다.
		
	}
	
	 public static void inpt2 (){
		
		int num3 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력값을 입력하세요");
		
		num3 = scan.nextInt();
		scan.close();
		//Scanner를 사용하면 resource leak이라는 경고문이 나올텐데
		//이건 Scanner로 입력받은 것을 다 입력받은 후 닫아주지 않아서 생기는 메모리 누수에대 대한 경고문입니다.
		//공부할떄 사용하는 적은 코드로는 큰 문제가 생기지 않지만 점차 코드가 방대해지면 그만큼 프로그램이 비대지고
		//Os에 의해서 프로그램이 종료되거나 Pc의 속도가 느려질수 있다고한다.
		//그러므로 마지막에 꼭 객체명.close();해주는 습관을 들이자!
		
		System.out.println("입력된 값은 " + num3 + " 입니다.");
		
		//두번째 방법은 scanner를 사용하는 방법이다.
		//import java.util.Scanner;를 미리 선언해 둬야한다.
		//Scanner scan = new Scanner(System.in);를 사용하여 scan이라는 함수를 미리 만들어 두고 num3에 그값을 입력하는 방식이다.
		//숫자 외에 소수, 문자를 입력하고 싶으면 nextInt()대신 next 옆에 float, String등 원하는 변수형을 입력하면 그 변수형으로 선언된다.
		//본인은 해당방법이 더 편해서 앞으로 해당 방법으로 키보드 값을 입력받을 것이다.
		
	}

}
