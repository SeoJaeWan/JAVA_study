package hello;

abstract class Vehicle{
	
	protected int speed;
	
	public void setSpeed(int s) {
		
		speed = s;
		System.out.println("속도를 " + speed + "로 변경하였습니다.");
	}
	
	abstract void show();   //몸체가 없는 메서드를 가질 수 있다.
}

class Carz2 extends Vehicle{
	
	private int num;
	private double gas;
	
	public Carz2(int n,double g) {
		
		num = n;
		gas = g;
		
		System.out.println("차량 번호가 " + num + "이고 연료 량이 " + gas  + "인 자동차가 만들어졌습니다.");
	}
	
	public Carz2(int n,double g, int s) {
		
		num = n;
		gas = g;
		speed = s;
	}
	
	public void show() {   //슈퍼클래스인 Vehicle의 show()를 오버라이딩 시켰다.
		
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 량은" + gas + "입니다.");
		System.out.println("속도는 " + speed + "입니다.");
	}
}

class Plane extends Vehicle {
	
	private int flight;
	
	public Plane(int f) {
		
		flight = f;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void show() {   //슈퍼클래스인 Vehicle의 show()를 오버라이딩 시켰다.
		
		System.out.println("비행기 번호는 " + flight + "입니다." );
		System.out.println("속도는 " + speed + "입니다.");
	}
}

public class Study25_추상클래스 {

	public static void main(String[] args) {
		
		Vehicle[] vc;
		//vc = new Vehicle();    //객체를 생성할 수 없습니다.
		//추상(abstract)클래스는 클래스 앞에 abstract를 붙여서 사용하고
		//객체를 생성할 수 없습니다.
		//abstract class 추상클래스명 {
		//	필드 선언;
		//	abstract 리턴값의형 메서드명(인수목록);
		//}로 선언할 수 있고
		//abstract void show();처럼 몸체가 없는 메서드를 가질 수 있고 이를 추상 메서드라고 합니다.
		
		vc = new Vehicle[2];
		
		vc[0] = new Carz2(1235,25.5);
		vc[0].setSpeed(1234);
		
		vc[1] = new Plane(125);
		vc[1].setSpeed(5555);
		
		for (int i = 0; i < vc.length;i++) {
			
			vc[i].show();
		}
		//추상 클래스는 추상클래스 형 변수를 선언할 수 있지만 객체를 만들 수 없습니다.
		//추상 클래스는 직접적인 객체는 생성할 수 없기떄문에 반드시 서브클래스에 상속을 시킨다음에 
		//Vehicle의 show()와같은 몸체없는 메서드를 서브클래스에서 오버라이딩해서 구현시켜야합니다.
		//추상 클래스를 상속받은 모든 서브 클래스는 추상 메서드(위 예제에선 show())와 같은 이름의 메서드를 가지고 있습니다.
		
		for(int i = 0; i < vc.length;i++) {
			
			if(vc[i] instanceof Carz2)
				System.out.println( (i+1) + "번째 객체는 Carz2 클래스입니다.");
			else
				System.out.println((i+1) + "번째 객체는 Carz2 클래스가 아닙니다.");
		}
		//추상 클래스를 사용하다보면 다루는 서브 클래스의 양이 많아집니다.
		//이때 각각 객체의 클래스를 알아내기위해서 'instanceof'를 사용합니다.
		//객체명 instanceof 클래스명 
		//으로 사용이 가능하고 좌변의 변수가 우변의 클래스와 같은지 확인해 true, false로 반환해줍니다.
		
		Carz2 vec;
		vec = new Carz2(1234,25.5,40);
		
		vec.show();
	}
}
