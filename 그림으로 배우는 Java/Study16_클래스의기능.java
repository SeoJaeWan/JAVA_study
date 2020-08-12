package hello;

import java.util.Scanner;

class reCar {
	
	private int num;
	private double gas;
	//전시간에는 본적이 없던 private라는 문장이 int와 double앞에 생겼다.
	//우리가 차량에 연료를 넣을떄 0이상의 값을 넣는데 
	//전시간에 한 코딩은 gas에 -15.2처럼 현실에서는 불가능한 값을 넣어도
	//정상적으로 실행이 되었다.
	//이를 막기위한 방법중 하나인 private이다
	//private는 클래스 외부에서 함부로 접근할 수 없는 맴버를 만들때 사용하는 제한자이다.
	//이러한 맴버를 private 맴버라고 한다.
	//즉 reCar라는 클래스에 있는 num과 gas의 앞에 private가 붙어있기 때문에
	//외부 클래스에서는 해당 필드에 접근할 수 없다.
	
	public void setNumGas(int n,double g) {
	//190번째 줄	
		if(n > 999 && (g>0 && g<1000)) {
			
			num = n;
			gas = g;
			
			System.out.println("차량 번호는 " + num + "이고 연료 양은 " + gas + "입니다.");
			
		}
		else {
			
			System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");
			
		}
		//우리가 num과 gas에 private제한자를 사용하여 외부클래스인 Study16에서의 접근을 제한하였는데
		//reCar클래스 안에 setNumGas라는 메서드를 만든다음 Study16클래스에서 실인수에 값을 넣으면
		//해당 메서드에서 그 값이 올바른 값인지 한번 확인을 하고 오류가 있는 값이라면 else문으로 보내 
		//실행을 막고 정상적인 값이라면 제대로 문장을 실행하게 하였다.
		//이는 외부에서 접근을 한것이 아닌 같은 클래스 내부에 있는 메서드가 해당 변수에 접근한 것이므로
		//접근에 제한을 받지않는다.
		//이처럼 private가 다른 클래스에서의 접근을 제한하는 제한자라면
		//public은 다른 클래스의 접근을 허용하는 제한자이다.
		//이렇게 public과 private를 이용하면 오류가 생기는 것을 방지할 수 있다.
		
	}
	
	//위 방식처럼 클래스에 데이터와 기능을 한 곳에 모은 다음, 보호하고 싶은 맴버에 private을 붙여서 접근을 제한하는 기능을 '캡슐화'라고 한다.
	//보통 필드는 private로 메서드는 public으로 지정한다.
	//또 그동안 메서드 앞에 제한자를 따로 붙이지 않은 메서드들이 있는데 이렇게 제한자를 생략하면
	//같은 패키지(폴더)안의 클래스라면 마음껏 접근할 수 있다.
	
	void setCar(int n) {
	//192부터 194번쨰 줄	
		if(n>999) {
			num = n;
			System.out.println("차량 번호를 " + num + "으로 변경하였습니다.");	
		}
			
		else {	
			System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");		
		}
		
	}
	
	void setCar(double g) {
		
		if(g>0&&g<1000) {
			gas = g;
			System.out.println("연료 양을 " + gas + "로 변경하였습니다.");
		}
			
		else {		
			System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");	
		}
		
	}
	
	void setCar(int n,double g) {
		
		if(n>999 &&(g>0&&g<1000)) {
			num = n;
			gas = g;
			System.out.println("차량 번호를 " + num + "으로 변경하였고 연료 양을 " + gas + "으로 변경하였습니다.");
		}
			
		else {	
			System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");	
		}
			
	}
	//그동안은 메서드를 만들 때 한개의 메서드에 한개의 이름을 사용하였는데
	//setCar메서드처럼 같은 이름을 가지는 메서드 여러 개를 같은 클래스에 정의할 수 있습니다.
	//이를 '메서드 오버로딩'이라고 합니다.
	//이떄는 메서드의 인수형이나 개수가 다르게 만들어야합니다.
	//ex)int setCar(int n);
	//	 void setCar(int n);    <---이렇게 리턴 값은 다른데 인수형만 같을 경우 호출이 되었을 때  
	// 								어느 메서드를 호출해야 할지 판단이 불가능 합니다. 
	//이렇게 선언한 경우 메서드를 호출할 떄의 인수형과 개수가 동일한 메서드가 자동으로 호출됩니다.
	//메서드 오버로딩을 사용하여 하나의 이름을 상황에 맞추어 다른 기능을 가지는 것을 '다형성'이라고 합니다.
	
	public reCar() {
	//173번쨰 줄	
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	//클래스 안에는 필드와 메소드 외에 생성자라는 것이 있습니다.
	//생성자의 선언 방법은
	//제한자 클래스명 (인수목록){
	// 문장;	
	//}
	//으로 선언할 수 있고 생성자의 이름은 반드시 클래스의 이름과 같아야 합니다.
	//또한 메서드와 다르게 리턴 값이 없습니다.
	//생성자란 클래스의 객체가 생성될 때 생성자 안의 코드가 자동으로 실행 됩니다.
	//객체가 생성될 때 자동으로 실행이 되기 때문에 객체 맴버에 자동으로 초기 값을 설정하는 용도로 사용합니다.
	//즉 reCar car1 = new reCar();이렇게 객체를 생성하면 
	//바로 생성자의 코드가 실행된다는 뜻입니다.
	}
	
	public reCar(int n,double g) {
	//198번쨰 줄	
		if(n>999 &&(g>0&&g<1000)) {
			num = n;
			gas = g;
			System.out.println("차량 번호가 " + num + "이고  연료 양이 " + gas + "인 자동차가 만들어 졌습니다..");
		}
			
		else {	
			System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");	
		}
	//메서드의 인수 형과 개수가 다르다면 오버로딩을 할 수 있다고 배운거 처럼
	//생성자도 인수의 개수와 형이 다르면 오버로딩이 가능합니다.
	//그동안 reCar car1 = new reCar();이렇게 선언했을 때 ()안에 아무것도 입력하지 않았지만
	//reCar car2 = new reCar(number,gasoline)처럼 ()안에 값을 넣어 실인수 값을 받아와서
	//초기화 값을 설정할 수 있습니다.
	//생성자의 오버로딩을 이용하면 다양한 초기 설정 처리가 가능하게 됩니다.
	}
	
	public reCar(int n) {
	//200번쨰 줄	
		this();
		num = n;
		System.out.println("차량 번호가 " + num + "인 차량으로 바꾸었습니다.");
	//생성자 안에서만 사용할 수 있는 this();라는 명령어가 있다.
	//this()는 특정 생성자 안에서 다른 생성자를 호출하는 명령어이다.
	//reCar(int n)에서 this();를 사용하면 
	//this();가 reCar()을 호출하여 reCar()안에 있는 코드를 실행한 뒤에 reCar(int n)의 this()아래 코드를 실행합니다.
	//this();만 가능한 것이 아닌 this(1234,52.5);라고 명령어를 사용하면 
	//reCar(int n,double g)의 코드를 실행하고 다시 reCar(int n)의 this()아래 코드를 실행합니다.
	//이처럼 this()에서 ()안에 생성자의 형만 원하는 값을 사용하면 해당 생성자를 호출할 수 있습니다.
	}
	
	//생성자를 배우기 전에는 생성자를 생략했는데 
	//생성자를 생략하면 
	//reCar() {
	//..
	//}
	//다음과 같이 인수없는 생성자가 호출됩니다.
	//..이 있다고 실제로 reCar()라는 생성자 안에 ..이 있는것이 아닌 
	//속이 비어있는 코드가 생성된다는 것입니다.
	//인수없는 생성자를 기본 생성자라고 합니다.
	
	void show() {
		
		System.out.println("차량번호는 " + num + "이고 연료 양은 " + gas + "입니다.");
		
	}
	
}

public class Study16_클래스의기능 {

	public static void main(String[] args) {
		
		reCar car1 = new reCar();
		
		//car1.num = 1234;
		//car1.gas = 20.5;
		//reCar클래스의 필드인 num과 gas에 private제한자가 붙어있어서 접근이 불가능하다.
		
		int number;
		double gasoline;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("차량번호를 입력해 주세요!");
		number = scan.nextInt();
		
		System.out.println("연료량을 입력해 주세요!");
		gasoline = scan.nextDouble();
		
		car1.setNumGas(number,gasoline);
		
		car1.setCar(2589);
		car1.setCar(56.5);
		car1.setCar(1265,26.5);
		
		car1.show();
		
		reCar car2 = new reCar(number,gasoline);
		
		reCar car3 = new reCar(number);
		
		car2.show();
		car3.show();
		
		scan.close();
	}

}
