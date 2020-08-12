package hello;

//자바는 이미 설계된 클래스를 바탕으로 새로운 클래스를 만들수 있도록 할 수 있습니다.
//이렇게 새로운 클래스를 만드는 행위를 '클래스를 확장한다'고 합니다.
//class 자동차 {
//차량번호;
//연료 양;
// ...
//}
//
//class 레이싱카 상속받는다 자동차{
//경기용 코스;
//경기용 코스를 표시하는 기능 ..
//}
//자동차 클래스를 먼저 설계하고 
//레이싱카 클래스가 자동차 클래스의 맴버를 상속받습니다.
//그렇기 때문에 따로 레이싱카의 맴버코드를 작성할 필요가 없습니다.
//새로 확장된 클래스가 기존 설계된 클래스의 맴버를 물려받는 것을 '상속'이라고 합니다.
//이때 바탕이 되는 자동차 클래스를 '슈퍼클래스'라고 하고 
//상속받는 레이싱카 클래스를 '서브클래스'라고 합니다.

class TrueCar{
	
	protected int num; 					
	protected double gas;
	//private를 사용하면 같은 클래스 외엔 접근할 수 없다는 사실을 배웠다.
	//그러므로 서브클래스에서는 슈퍼클래스의 private제한자가 붙은 맴버를 
	//호출 할 수 가없다. 그렇게 되면 제한사항이 너무 많아진다.
	//그렇기 때문에 private제한자를 대신하면 protected제한자를 사용한다.
	//이는 같은 클래스,같은 패키지, 상속 class까지 접근을 허용하게 해준다.
	//그래서 서브클래스인 RacingCar가 해당 맴버들에게 접근할 수 있다.
	
	public TrueCar(){
		
		num = 0;
		gas = 0.0;
		
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public TrueCar(int n) {
		 
		num = n;
		
	}
	
	public TrueCar(int n, double g) {
		this(n);                       //super(원하는 인수)가 슈퍼클래스의 원하는 생성자를 호출하는 명령어라면
									   //this(원하는 인수)는 같은 클래스 안에서의 다른 생성자를 호출하는 명령어다
									   //Study16_클래스의 기능에서 this()의 기능을 설명했지만 추가로 ()안에
								       //원하는 인수를 넣으면 같은 클래스에서 해당 인수를 가진 생성자가 호출된다.
		
		if(n>999 &&(g>0&&g<1000)) {
			
			gas = g;
			
			System.out.println("차량 번호가 " + num + "이고 연료 양이 " + gas + "인 자동차가 만들어 졌습니다..");
			
		}
		else {
			
			System.out.println("차량 번호와 연료 량을 다시한번 확인해 주세요!");
			
		}
		
	}
	
	void setCar(int n, double g) {
		if(n>999 &&(g>0&&g<1000)) {
			
			num = n;
			gas = g;
			
			System.out.println("차량 번호를 " + num + "연료 양을 " + gas + "로 변경하였습니다.");
			
		}
		else {
			
			System.out.println("차량 번호와 연료 량을 다시한번 확인해 주세요!");
			
		}
		
	}
	
	void show() {
		
		System.out.println("차량 번호는 " + num + "이고");
		System.out.println("연료 량은 " + gas + "입니다.");
	} 
	
}

class RacingCar extends TrueCar{  // RacingCar라는 클래스에 extends TrueCar를 추가하여 TrueCar의 맴버를 상속받았다.
	
	private int course;  		  // TrueCar에는 없는 맴버들을 추가해준다.
	
	public RacingCar() {  		
		
		course = 0;
		System.out.println("레이싱카가 만들어 졌습니다.");
	}
	
	public RacingCar(int n, double g, int c) {
		
		super(n,g);				  //super(n,g)를 사용하여 슈퍼클래스의 생성자 중 필요한 생성자인 TrueCar(int n,double g)를 호출하였습니다.
								  //따로 지정하지 않으면 슈퍼클래스의 인수 없는 생성자가 자동으로 호출됩니다.
		course = c;
		System.out.println("코스 번호가 " + course + "인 레이싱카가 만들어 졌습니다.");
		//서브클래스의 객체를 생성하면 서브클래스의 생성자가 호출되기 전에 슈퍼클래스의 생성자가 먼저 호출된다.
		//그때 따로 지정하지 않으면 호출되는 슈퍼클래스의 생성자는 슈퍼클래스의 인수 없는 생성자가 자동으로 호출이 됩니다.
		//하지만 TrueCar처럼 생성자가 2개이거나 다수이고 필요로 하는 슈퍼클래스의 생성자가 다른경우 super()를 사용하여 원하는 생성자를 호출할 수 있다.
		//서브클래스의 생성자 시작부분에 super(원하는 슈퍼클래스의 생성자의 인수)를 추가하면 원하는 슈퍼클래스의 생성자를 골라서 호출할 수 있다.
	}
	
	public void setCourse(int c) {
		
		course = c;
		System.out.println("레이싱 코스를 " + course + "로 설정하였습니다.");
	}
}
//TrueCar이라는 클래스를 만들고 
//RacingCar라는 TrueCar를 상속받는 클래스를 만들었습니다.
//그러므로 TrueCar는 슈퍼클래스이고 RacingCar는 서브클래스입니다.
//상속받는 방법은 
//class 서브클래스명 extends 슈퍼클래스명 {}으로 선언할 수 있습니다.
//RacingCar클래스는 TrueCar클래스의 모든 맴버를 사용할 수 있기 떄문에
//추가로 TrueCar에는 없는 고유 맴버만 표현해주면 됩니다.
//RacingCar클래스는 course와 setCourse를 추가로 선언했습니다.

public class Study21_상속 {

	public static void main(String[] args) {
		
		RacingCar racingcar = new RacingCar();  	// 서브클래스도 객체를 생성하는 방법은 기존과 같다.
		
		racingcar.setCar(1234,56.6);			    // TrueCar에서 상속받은 setCar메서드를 사용하고 있습니다.
		racingcar.setCourse(2);						// 추가된 메서드를 호출하고 있습니다.
		//서브클래스도 기존에 클래스를 호출하는 방법과 같은 방법으로 
		//상속받은 맴버와 추가한 맴버를 호풀할 수 있습니다.
	}

}
