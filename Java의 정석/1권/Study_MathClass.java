package hi;

import java.util.Scanner;

public class Study_MathClass {

	public static void main(String[] args) {
	// 	자바의 정석 483
		Scanner sc = new Scanner(System.in);
		int r = 0;
		
		double area;
		
		/*System.out.print("입력값을 입력하세요 : ");
		r = sc.nextInt();

		area = Math.PI * r * r;
		System.out.println(area);	// Math클래스 안에는 2개의 상수가 있는데
									// PI(원주율)와 E(자연로그의 밑)이 있다.
									// 이 둘을 사용하고자 할때 만들지 말고 Math()클래스에서 가져오면 된다.
		*/
		double val = 90.7552;
		System.out.println("round(" + val + ") = " + Math.round(val));	// round()메서드는 소수점 1자리에서 반올림하는 메서드이다.
	
		val *= 100;
		System.out.println("round(" + val + ") = " + Math.round(val));
		
		System.out.println("round(" + val + ") / 100 = " + Math.round(val)/100);	// 100으로 나누어주면 버림이 된다.
		System.out.println("round(" + val + ") / 100.0 = " + Math.round(val)/100.0);// 100.0으로 나누면 실제값(90.7552)에서 
																					// 소수점 둘째자리에서 반올림한 값이 된다.
		System.out.println();
		
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.1,Math.ceil(1.1));	// Math.ceil()메서드는 올림을 해주는 메서드이다. 
		
		System.out.printf("floor(%3.1f) = %3.1f\n",1.1,Math.floor(1.1));// Math.floor()메서드는 버림을 해주는 메서드이다.
		
		System.out.printf("round(%3.1f) = %d\n",1.5,Math.round(1.5));	// Math.round()메서드는 반올림을 해주는 메서드이다.
		System.out.printf("rint(%3.1f) = %3.1f\n",1.5,Math.rint(1.5));	// rint()메서드는 반올림을 해주는 메서드이다.
		
		System.out.printf("round(%3.1f) = %d\n",-1.5,Math.round(-1.5));	// round()메서드와 rint()메서드의 차이점은
		System.out.printf("rint(%3.1f) = %3.1f\n",-1.5,Math.rint(-1.5));// 음수를 반올림했을때 rint는 소수 첫째자리가 
																	 	// 5미만일때 반올림을 하고 5 이상이면 버림을 한다.
																		// -1.4에 rint()메서드를 사용하면 -1이 된다.
		
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i);
		System.out.println("-1 = " + -i);	// i의 값에 -연산자로 부호를 반대로 바꾸었지만 비트연산자로 ~이 적용되어서 
											// 값에 +1을 하기때문에 오버플로우가 발생하였다. <- 이부분은 자바의정석 124p에 있다.
		
		try {
			
			System.out.printf("negateExact(%d) = %d\n",10,Math.negateExact(10));
			System.out.printf("negateExact(%d) = %d\n",-10,Math.negateExact(-10));
			System.out.printf("negateExact(%d) = %d\n",i,Math.negateExact(i));
		}catch(ArithmeticException e) {
						
			System.out.printf("negateExact(%d) = %d\n",(long)i,Math.negateExact((long)i));
		}	// 연산자를 사용하여 연산을 하면 오버플로우가 발생해도 오버플로우가 발생한지 모르고 값이 연산이 된다.
			// 하지만 Math.negateExact()메서드를 사용하면 오버플로우가 발생하면 예외를 발생시킵니다.
			// 이때 발생하는 예외는 ArithmeticException 이다.
		
		// 외에도 삼각함수, 지수, 로그등 수학 관련 메서드는 자바의 정석 486p~ 필요하다면 확인하면 된다.
	}

}
