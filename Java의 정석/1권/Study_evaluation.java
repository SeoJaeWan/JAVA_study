package hi;

public class Study_evaluation {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		System.out.println("a = " + a + " b = " + b);
		System.out.println("a != 0 || ++b !=0 = " + (a != 0 || ++b !=0) );
		System.out.println("a = " + a + " b = " + b);
		//분명 a != 0 || ++b !=0에서 b에 ++연산자를 사용했는데 
		//논리 연산이 끝났을 때 b의 값은 그대로 0이다.
		//이는 a != 0 에서 이미 결과가 나왔기때문에 뒤에 연산은 시행하지 않았다는 뜻이다.
		//이처럼 논리 연산을 할때 효율적으로 먼저 결과가 나오면 뒤에 있는 연산은 시행하지않고
		//바로 연산을 끝내버린다.
		
		System.out.println(a = 8);
		System.out.println(a);
	}

}
