package hi;

public class Study_ExceptionThrow {

	public static void main(String[] args) {
		
		try {
			
			Exception e = new Exception("고의로 발생시킴");
			throw e;
		}
		catch (Exception e) {
			
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		// Exception 클래스를 사용하여 객체를 생성하고 throw 키워드를 사용하여 예외를 고의로 발생시킨다.
	}
}
