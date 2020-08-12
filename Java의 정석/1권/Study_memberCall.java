package hi;



public class Study_memberCall {

	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
  //static int cv2 = iv;    클래스 변수는 인스턴스 변수의 값을 받아올 수 없다.
	static int cv3 = new Study_memberCall().iv;  // 객체를 생성해야 가능하다 . 
												 // 단 이경우에는 참조변수를 사용한 것이 아니기때문에 값을 넣고 더이상 인스턴스를 사용할 수 없다.
	
	static void staticMethod1() {
		
		System.out.println(cv);
	  //System.out.println(iv);  클래스 메서드 안에서는 인스턴스 메서드 값을 사용할 수 없다.
		Study_memberCall c = new Study_memberCall();
		System.out.println(c.iv);   // 참조 변수로 객체를 생성하면 사용할 수 있다.
	}
	
	void instanceMethod1() {
		
		System.out.println(cv);  // 인스턴스 메서드는 클래스 메서드 값을 사용할 수 있다.
		System.out.println(iv);  // 인스턴스 메서드도 자유롭게 사용 가능
	}
	
	static void staticMethod2() {
		
		staticMethod1();   // 클래스 메서드는 클래스 메서드를 호출 할 수 있다.
	  //instanceMethod1();    인스턴스 메서드는 호출할 수 없다. 
	}
	
	void instanceMethod2() {
		
		staticMethod1();
		instanceMethod1();  // 인스턴스 메서드는 클래스 메서드와 인스턴스 메서드 둘다 자유롭게 호출할 수 있다.
	}

}
