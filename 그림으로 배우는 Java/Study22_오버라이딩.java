package hello;

class Cr{
	
	protected int num;
	protected double gas;
	
	public Cr() {
		
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public Cr(int n,double g) {
	
		if(n>999 &&(g>0&&g<1000)) {
			
			num = n;
			gas = g;
			
			System.out.println("차량 번호가 " + num + "이고 연료 양이 " + gas + "인 자동차가 만들어 졌습니다.");
			
		}
		else {
			
			System.out.println("차량 번호와 연료 량을 다시한번 확인해 주세요!");
			
		}
		
	}
	
	public void setCar(int n,double g) {
		
		if(n>999 &&(g>0&&g<1000)) {
			
			num = n;
			gas = g;
			
			System.out.println("차량 번호를 " + num + "연료 양을 " + gas + "로 변경하였습니다.");	
		}
		else {
			
			System.out.println("차량 번호와 연료 량을 다시한번 확인해 주세요!");
		}
	}
	
	public void show() {
		
		System.out.println("차량 번호가 " + num + "이고\n연료 량이 " + gas + "입니다." );
	}
}

class RcCar extends Cr{
	
	int course;
	
	public RcCar(){
		
		course = 0;
		System.out.println("레이싱카가 만들어 졌습니다.");
		
	}
	
	public RcCar(int n,double g,int c) {
		
		super(n,g);
		course = c;
		System.out.println("코스 번호가 " + c + "인 레이킹카가 만들어 졌습니다.");
		
	}
	
	public void setCourse(int c) {
		
		course = c;
		System.out.println("코스 번호를 " + c + "로 변경하였습니다.");
	}
	
	public void show() {
		
		System.out.println("레이싱카의 차량 번호는 " + num + "입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
		System.out.println("코스 번호는 " + course + "입니다.");
	}
	
}

public class Study22_오버라이딩 {

	public static void main(String[] args) {
		
		RcCar rccar = new RcCar();
		
		rccar.setCar(1235, 54.5);
		rccar.setCourse(2);
		
		rccar.show();  			//Cr클래스의 show()가 호출되는게 아닌 RcCar클래스의 show()가 호출된다.
		//슈퍼클래스와 서브클래서 모두 show()라는 메서드를 가지고있습니다.
		//이때 서브클래스의 객체를 생성하고 show()메서드를 호출했을 경우
		//서브클래스의 새롭게 정의된 show()메서드가 호출됩니다.
		//이처럼 메서드의 형,인수의 개수,이름이 모두 같은 메서드가 슈퍼클래스와 서브클래스
		//모두 정의되어 있을떄는 서브클래스의 메서드가 호출됩니다.
		//이처럼 서브클래스의 메서드가 슈퍼클래스의 메서드를 대신하는 기능을 '오버라이딩'이라고 합니다.
		
		Cr car1 = new RcCar();
		car1.setCar(2546, 25.4);
		
		car1.show();
		//car1.setCourse(4);   <---서브클래스에만 있는 새롭게 정의한 맴버
		//car1.course = 20;	   <---서브클래스에만 있는 새롭게 정의한 맴버
		//슈퍼클래스인 Cr의 변수에 서브클래스인 RcCar의 객체를 가르키는 car1의
		//show()메서드를 호출하면 RcCar의 show()메서드가 호출된다.
		//즉 객체를 가리키는 변수의 클래스(Cr)에 관계없이 객체 자신의 클래스(RcCar)에 따라 
		//적절한 메서드를 호출합니다.         
		//하지만 car1.setCourse();처럼 서브클래스에서 새롭게 정의한(서브클래스에만있는)
		//맴버는 호출할 수 없습니다.
		//즉 레이싱카 고유의 기능은 호출할 수 없습니다.
		
		Cr[] cars = new Cr[2];
		
		cars[0] = new Cr(1234,25.5);
		cars[1] = new RcCar(1234,23.5,2);
		
		for (int i = 0; i < cars.length; i++) 
			cars[i].show();
		//슈퍼클래스 배열 변수인 cars에 슈퍼클래스의 객체와 서브클래스의 객체를 함께 생성하였습니다.
		//배열의 변수형 클래스(Cr)와 관계없이 배열 안에 담긴 객체(Cr,RcCar)의 고유의 메서드가 호출됩니다.
		//같은 변수형의 클래스의 배열에 슈퍼클래스와 서브클래스가 담겨있더라도 오버라이딩 기능이 동작합니다.
		//Study16_클래스의기능에서처럼 메서드의 이름이 상황에 맞춰 다른 기능을 가지는 것을 '다형성'이라고 합니다.
		
		//Study16_클래스의기능에서 배운 오버로딩은 메서드의 이름은 같지만 인수의 형과 개수가 다른 메서드를 정의하는 것이고
		//오버라이딩은 서브클래스의 이름과 인수형,개수까지 슈퍼클래스의 메서드와 같은 메서드를 정의하는 것입니다.
	}
}
