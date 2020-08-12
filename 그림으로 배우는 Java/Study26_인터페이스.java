package hello;

interface Movable {  //슈퍼 인터페이스
	
}
//클래스를 확장한 것처럼 인터페이스도 확장이 가능합니다.
//이때 확장되는 인터페이스를 슈퍼인터페이스라고 하고 확장하는 인터페이스를 서브인터페이스라고 합니다.
//이때 인터페이스를 확장할 때에는 extends를 사용하고 구현할때에는 implements를 사용하는 것을 잊으면 안된다.

interface iVehicle extends Movable { //인터페이스를  확장할때 서브 인터페이스에 implements가 아닌 extends를 사용해서 확장한다.
	
	void vshow();    //추상메서드 입니다.
}

interface iMaterial{
	
	void mshow();
}

class Carz3 implements iVehicle,iMaterial {         //다중상속을 할 때에는 인터페이스 뒤에 ,붙이고 2번쨰 인터페이스를 입력하면 된다.
	//인터페이스를 구현할때는 extends가 아닌 implements를 사용한다.
	//인터페이스를 구현한 클래스(Carz3,Plane1)는 인터페이스의 메서드를 모두 정의해야 합니다. 
	
	private int num;
	private double gas;
	
	public Carz3(int n,double g) {
		
		num = n;
		gas = g;
		
		System.out.println("차량 번호가 " + num + "이고 연료 량이 " + gas  + "인 자동차가 만들어졌습니다.");
	}
	
	public void vshow() {   
		
		System.out.println("차량 번호는 " + num + "입니다.");
		System.out.println("연료 량은" + gas + "입니다.");
	}
	
	public void mshow() {
		
		System.out.println("자동차의 재질은 철입니다.");
	}
}

class Plane1 implements iVehicle {
	
	private int flight;
	
	public Plane1(int f) {
		
		flight = f;
		System.out.println("비행기 번호가 " + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void vshow() {  
		
		System.out.println("비행기 번호는 " + flight + "입니다." );
	}
}

public class Study26_인터페이스 {

	public static void main(String[] args) {
		
		iVehicle[] ivc;
		//ivc = new iVehicle();    <----인터페이스도 추상 클래스처럼 객체를 생성할 수 없다.
		//추상클래스와 거의 비슷한 메커니즘의 인터페이스이다.
		//인터페이스 선언은 
		//interface 인터페이스이름 {
		//형명 필드명 = 식;         <---제한자가 없지만 public static final을 붙인것과 같다. (상수)
		//리턴값의형 메서드명();	   <--- 제한자가 없지만 abstract가 붙은것과 같다.	 (추상메서드)
		//}
		//으로 class대신 interface를 붙이서 선언한다.
		//이때 인터페이스의 멤버에는 어떠한 제한자도 붙이지 않는데
		//필드에는 public static final, 메서드에는 abstract 제한자가 붙인것과 다름없습니다.
		//즉 인터페이스의 필드는 상수이고 메서드는 추상메서드인 셈입니다.
		
		ivc = new iVehicle[2];
		ivc[0] = new Carz3(1235,23.5);
		ivc[1] = new Plane1(5);
		
		for(int i = 0; i < ivc.length;i++) {
			
			ivc[i].vshow();
		}
		//추상클래스 배열에 서브클래스의 객체를 담아  한번에 처리한 것 처럼
		//인터페이스 또한 추상클래스와 동인한 처리가 가능합니다.
		//하지만 인터페이스의 모든 필드는 상수이고 메서드는 추상 메서드임을 알아야합니다.
		//즉 추상클래스 Vehicle처럼 값을 변경할 수 있는 필드speed,메서드setSpeed() 처럼 몸체가 있는 메서드는 가질 수 없습니다.
		//인터페이스를 사용하는 이유는 틀을 만들어서 공통된 기능을 인터페이스에서 정의하여 묶어 
		//인터페이스를 상속받은 클래스가 그 내부의 기능만 구현해서 사용하게하기위해서 사용한다고 합니다.
		//또 다중상속이 가능하기 떄문이다.
		
		Carz3 car1 = new Carz3(1235,25.5);
		car1.vshow();
		car1.mshow();
		//위 Carz3클래스에 iVehicle와 iMaterial 두개의 인터페이스를 구현하였습니다.
		//기존 클래스들은 다중상속이 불가능하지만 인터페이스는 비록 몸체가 없는 메서드지만 다중상속이 가능하여
		//필요한 몸체를 클래스 안에 정의해주어서 사용할 수 있습니다.
	}
	
	//전시간에 배운 추상클래스와 인터페이스를 사용하면 한번에 많은 클래스를 한번에 제어할 수 있습니다.
	//그렇기 떄문에 대규모 프로그램을 작성할 때 추상클래스와 인터페이스를 조합한 클래스 계층구조를 설계하면 도움이 됩니다.

}
