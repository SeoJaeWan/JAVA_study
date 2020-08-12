package hi;

public class Study_Exception {

	public static void main(String[] args) {
		
		try {
			
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
		//	throw new Exception("고의로 발생시켰음");  한줄로 표현이 가능
		}
		// 예외를 발생시킬때(throw를 사용할 때) try{} catch(){}로 감싸서 안에 입력하거나 
		// 아니면 메서드에 throws Exception을 추가시켜 주어야 한다.
		catch (Exception e) {
			
			System.out.println("예외 : " + e.getMessage());
			e.printStackTrace();
		}
		// throw 키워드를 사용하면 고의로 예외를 발생시킬 수 있습니다.
		
		System.out.println("프로그램이 정상적으로 종료되었음");
	}

}
