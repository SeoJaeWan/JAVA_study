package hi;

public class Study_printf {

	public static void main(String[] args) {
		
		int age = 14;
		int year = 2019;
		double test = 21.5456;
		
		System.out.println("age : " + age);
		System.out.printf("age : %d\n",age);    	  // 10진수의 값을 출력할 때에는 지시자 %d를 쓴다. 
		System.out.printf("age : " + age + "\n");     // printf()도 println()처럼 변수 자체를 출력할 수 있다.
													  //printf()는 ln()처럼 자동으로 줄바꿈을 하지 않는다 그렇기 때문에 \n을 넣어 줄바꿈을 해주어야한다. 
		
		//println은 변수의 값을 그대로 출력하기 때문에 값을 변환하지 않고는 다른 형식으로 출력할 수 없다.
		//printf는 '지시자'를 사용하여 변수의 값을 여러가지 형태로 출력할 수 있다.
		
		System.out.printf("age : %d, year : %d\n",age,year);
		//두개 이상의 값을 호출할 때에도 지시자를 2개이상 사용하면 된다.
		
		// 지시자 
		// %b : boolean형식으로 출력
		// %d : 10진 정수형식으로 출력
		// %o : 8진 정수형식으로 출력
		// %x : 16진 정수형식으로 출력
		// %f : 부동소수점형식으로 출력
		// %e : 지수 표현식으로 출력
		// %c : 문자로 출력
		// %s : 문자열로 출력 
		
		System.out.printf("test를 소수 둘째자리에서 발올림한 값은 %.2f",test);
		//소수 둘째자리에서 반올림한 값을 구하고 싶다면 %f에 .2를 넣어주면 된다.
		//외에도 셋째자리에서 반올림하고 싶다면 .3을 넣으면 된다.
		
		System.out.println('1' + '2');
		
		long x = 9703211815214l;
		float c = 9703211815214l;
		System.out.println(c);
	}
	
	
}
