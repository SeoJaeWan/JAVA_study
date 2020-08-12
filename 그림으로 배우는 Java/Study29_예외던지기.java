package hello;

class CarException extends Exception {   //Throwable클래스의 서브클래스인 Exception을 상속받습니다.
}
//Study28_예외처리에서 클래스 라이브러리에 있는 Exception클래스의 서브클래스들에서 예외를 받아와
//예외 처리하는 방법을 배웠다.
//우리는 반대로 '예외를 발생시키는 코드'를 작성 할 수있습니다.
//Study28_예외처리 마지막에 네이버 로그인처럼 필요에 따라서 예외 클래스를 만들어서 활용하는 것입니다.
//예외를 만드는 방법은 
//Study28_예외처리의 마지막에 언급된 Exception을 상속받아서 클래스를 만드는 것입니다.
//이러한 예외를 '사용자 정의 예외'라고 한다.

class Carz4 {
	
	private int num;
	private double gas;
	
	public Carz4() {
		
		num = 0;
		gas = 0;
		
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public Carz4(int n, double g) {
		
		num = n;
		gas = g;
		
		System.out.println("차량 번호가 " + num + "이고, 연료 량이 " + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n,double g) throws CarException {   //예외를 던지는 메서드이기때문에 throws CarException을 추가해주었다.
		
		if(n<=999 || g<0) {
			
			CarException e = new CarException();
			throw e;
		}
		else {
			
			num = n;
			gas = g;
			
			System.out.println("차량 번호를 " + num + "으로, 연료 량을 " + gas + "로 변경하였습니다.");
		}
	}
	//예외 클래스(CarException)가 만들어 지면 예외를 던지는 방법을 설명하겠습니다.
	//에외를 던지는 메서드에 throws 예외클래스(throws CarException)를 추가해줍니다.
	//그후 특정 상황if(n<=999 || g<0)에 예외 클래스의 객체를 만들어 
	//throw 예외 객체를 가리키는 변수명;을 입력하여 예외를 던집니다.
	//즉 throw e는 CarException이라는 예외를 발생시키는 것이다.
	
	public void show() {
		
		System.out.println("차량 번호는 " + num + "이고");
		System.out.println("연료 량은 " + gas + "입니다.");
	}
}

public class Study29_예외던지기 {

	public static void main(String[] args) {
		
		Carz4 car1 = new Carz4();
		try {
			
			car1.setCar(1234,-15);
		}
		catch(CarException e) {
			
			System.out.println(e + "가 던져졌습니다.");
		}
		
		car1.show();
	}

}
