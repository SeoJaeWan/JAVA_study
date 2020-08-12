package hi;

class InitTest{
	
	int x;
	int y = x;    // 인스턴스 변수는 초기화를 하지 않은 변수를 값으로 사용하여 초기화를 하여도 
	 			  // 타입의 기본값이 저장이 된다.
	
	void mathod1() {
		
		int a;
	  //int b = a;  // 지역변수는 값을 초기화 하지 않으면 다른 지역변수의 초기화 값으로 사용할 수 없다.
	}
	// 이처럼 멤버변수(클래스 변수,인스턴스 변수)와 배열의 초기화는 선택이지만 
	// 지역변수의 초기화는 필수이다.
	
	int count;
	int serialNo;
	String color;
	
	InitTest(){
		
	//	count++;
	//	serialNo = count;
		color = "white";
	}
	
	InitTest(String c){
		
	//	count++;
	//	serialNo = count;
		color = c;
	}
	// 각 생성자에 count++;와 serialNo = count; 은
	// 중복이 된다.
	// 이러한 중복으로 인스턴스의 값을 초기화 시킬때는 
	// 인스턴스 초기화 블럭을 사용하면 된다.
	{
		count++;
		serialNo = count;
	}
	// {}안에 중복되는 인스턴스 변수의 값 초기화 코드를 넣어주면 인스턴스가 생성될때 자동으로 생성자보다 먼저 사용된다.
	// 이러한 초기화 블록 안에는 조건문 반복문 등 다양한 작업이 가능하다.
	// 클래스 변수 또한 static {}으로 초기화 블록을 만들 수 있다.
	// 클래스 변수의 초기화 블록은 클래스가 메모리에 처음 로딩될 때 1번만 수행이 된다.
}

public class Study_initialization {

	public static void main(String[] args) {
		
		
	}

}
