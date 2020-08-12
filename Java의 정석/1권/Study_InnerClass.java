package hi;

public class Study_InnerClass {

	class InstanceInner{
		
		int iv = 100;
	//	static int cv = 100;         // 인스턴스 클래스이기 때문에 static변수를 만들 수 없다.
		final static int CONST = 100;// final static은 상수이기때문에 허용된다.
	//	내부 클래스 중에서 static클래스만 static멤버를 가질 수 있다.
	// 	단 상수(final static)는 예외이다.
	}
	static class StaticInner{
		
		int iv = 200;
		static int cv = 200;
	}
	
	InstanceInner iv = new InstanceInner();
// 	인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	StaticInner cv = new StaticInner();
// 	스테틱 멤버 간에는 서로 직접 접근이 가능하다.
	
	static void myMethod() {
		
		StaticInner cv = new StaticInner();
	//	InstanceInner iv = new InstanceInner();
	// 	스테틱 멤버는 인스턴스 멤버를 직접 호출할 수 없다.
		
		Study_InnerClass iv = new Study_InnerClass();
		InstanceInner obj = iv.new InstanceInner();
	// 	스테틱 멤버에서 인스턴스 클래스에 굳이 접근을 하려면 
	// 	객체를 새로 생성해주어야 한다.
	}
	
	void localMethod() {
	//	인스턴스 메서드 안에서도 인스턴스클래스와 스테틱 클래스에 접근이 가능하다.
		InstanceInner iv = new InstanceInner();
		StaticInner cv = new StaticInner();
		
	//	LocalInner lc = new LocalInner();
	//	다른 메서드에 선언된 지역 클래스에 접근은 불가능하다. 
	}
	
	void myMethod1(){
		
		class LocalInner{
			
			int iv = 300;
		//	static int cv = 200;			// 지역 클래스도 static변수를 만들 수 없다.
			final static int CONST = 300; 	// 마찬가지로 상수는 허용된다.
		}
	}
	
	public static void main(String[] args) {
		
	}

}
