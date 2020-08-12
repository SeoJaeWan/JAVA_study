package hi;

public class Study_Rethrowing {

	public static void main(String[] args) {
		
		try {
			
			method1();
		}catch (Exception e) {
			
			System.out.println("main()메서드에서 예외를 처리했습니다.");
		}
	}
	
	static void method1() throws Exception{
		
		try {
			
			throw new Exception();
		}catch(Exception e) {
			
			System.out.println("method1()메서드에서 예외를 처리했습니다.");
			throw e;
		}
		
	}
//	예외를 처리한 후에 인위적으로 예외를 다시 발생시키는 방법을 예외 되던지기라고 한다.
// 	예외를 try-catch문으로 처리하고 다시 throws를 통해 예외를 호출하여 처리하는 방법이다.
// 	예외를 발생한 메서드와 이를 호출한 메서드 양쪽 모두 예외를 처리해야할 필요가 있을떄 사용합니다.
//  이때 예외가 발생한 메서드(method1)는 반드시 메서드에 throws를 지정해주어야 합니다.

}
