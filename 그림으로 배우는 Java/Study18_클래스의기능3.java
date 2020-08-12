package hello;

class Car2 {
	
	private int num;
	private double gas;
	private static int sum = 0;
	//num과 gas는 객체에 연결되어 있는 변수(필드)이다.
	//그래서 객체마다 가지는 값이 다를 수 있는데
	//static을 사용하여 객체와 연결되어 있는 변수가 아닌
	//클래스 전체에 연결되어 있는 변수를 클래스 변수라고한다.
	//num과 gas는 객체마다 값이 전부 다른데
	//sum이라는 클래스 변수는 각 객체가 공유하는 필드입니다.
	//즉 sum의 값이 변경되면 모든 Car2의 sum을 쓰는 객체의 값도 같이 변경된다.
	//메서드도 이처럼 클래스 전체에 연결되어있는 클래스 메서드가 있다.
	//클래스 변수를 선언하는 방법은 
	//제한자 static 변수형 변수명;으로 선언할 수 있다.
	//클래스 메서드를 선언하는 방법은
	//제한자 static 리턴형 메서드명(인수목록){}으로 선언할 수 있다.
	
	public Car2() {
		
		num = 0;
		gas = 0.0;
		sum++;
		
		System.out.println("자동차가 만들어 졌습니다.");
		
	}
	
	public void setNumGas(int n,double g) {
		
		if (n>999 && (g>0 && g<1000)) {
		
			num = n;
			gas = g;
			System.out.println("차량 번호가 " + num + "이고 연료량이 " + gas + "인 자동차로 변경하였습니다." );
			
		}
		else {
			
			System.out.println("차량 번호와 연료 양을 제대로 확인하여 주세요!");
		}
	}
	
	public static void showSum() {
		
		System.out.println("자동차는 모두 " + sum + "대 있습니다.");
		//showSum()의 앞에 static이 붙어있어 위 메서드는 클래스 메서드라고 한다.
		//클래스 메서드는 객체를 생성하지 않더라도 호출할 수 있다.
		//가장 대표적인 클래스 메서드는 우리가 자주 보는 main() 메서드이다.
		//클래스 메서드는 클래스 변수를 출력해야 하거나 객체 전체와 연결된 처리를 해야 할 때 사용하는 메서드이다.
		//클래스 메서드 안에서는 인스턴스 변수와 인스턴스 메서드에 접근할 수 없습니다.
		//인스턴스 메서드와 인스턴스 변수는 모두 특정 객체와 연결되어있기 떄문에
		//객체를 생성하지 않은 상태에서도 호출이 가능해야하는 클래스 메서드로써는 
		//접근할 수 없습니다.
		//클래스 메서드만 클래스 메서드를 호출할 수 있다.
		//즉 static이 붙은 메서드는 static이 붙은 메서드만 호출을 할 수 있다.
		//static이 붙은 메서드가 같은 클래스 안에서 호출할 수 있는 메서드는 
		//같은 static이 붙은 메서드만 가능하다.
		//또한 this도 인스턴스 메서드안에서만 사용할 수 있습니다.
	}
	
	public void show() {
		
		System.out.println("자동차의 차량번호는 " + num + "이고 연료량은 " + gas + "입니다.");
		
	}
	
}

public class Study18_클래스의기능3 {

	public static void main(String[] args) {
		
		Car2.showSum();
		//객체가 생성되지 않는 상태에서도 호출이 가능하다.
		
		Car2 car1 = new Car2();
		car1.setNumGas(1234, 25.65);
		car1.show();
		
		Car2.showSum();
		
		Car2 car2 = new Car2();
		car2.setNumGas(2546, 15.25);
		car2.show();
		//객체를 생성해야 각 객체의 num필드와 gas필드에 값을 대입하거나 출력할 수 있습니다.
		//이때 각각의 객체는 서로 다른 필드 값을 가질 수 있는데
		//이를 'num필드와 gas필드는 클래스 Car2에 연결되어있다'로 부르기도 합니다.
		//show()메소드 또한 객체를 생성하고 나서야 호출이 가능한 것 처럼
		//메소드와 변수(필드)도 객체에 연결 되어있습니다.
		//이처럼 각 객체에 연결된 메소드와 변수를 인스턴스 변수,인스턴스 메소드라고 부릅니다.
		
		Car2.showSum();
		//클래스 메서드를 호출하는 명령어다
		//호출 방법은
		//클래스이름.클래스메서드(인수목록);으로 호출할 수 있다.
		
		
		//우리는 인스턴스 변수와 클래스 변수를 배웠는데
		//지역변수라는 변수도 있다.
		//이 지역변수는 메서드 안에서 선언한 변수들을 가르켜 지역변수라고 하고
		//메서드 안에서 사용하는 가인수 또한 지역번수입니다.
		//지역변수는 해당 메서드 안에서만 유효하고 메서드가 호출될 때마다 초기화됩니다.
		//즉 
		//class test {
		//	public int x  <---인스턴스변수
		//	private int y <---인스턴스변수
		//	public static int z <---- 클래스변수
		//
		//	void test2(int a <--- 지역변수) {
		//
		//	int x <--- 지역변수
		//
		//	}
		//}	
		//라고 생각하면 된다.

	}

}
