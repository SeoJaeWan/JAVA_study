package hello;

//슈퍼클래스 1개에 1개의 서브클래스만 그동안 만들었지만
//슈퍼클래스 1개에 2개 이상의 서브클래스를 만들 수 있고
//서브클래스를 확장하여 서브클래스의 서브클래스도 만들수 있습니다.

//즉   슈퍼클래스 - 서브클래스1 - 서브클래스1_1
//		 			    - 서브클래스1_2 
//			 - 서브클래스2   
//이런식으로 클래스를 설계할 수 있습니다.

//그렇다면  슈퍼클래스가 없는 클래스나 슈퍼클래스는 무슨 클래스를 상속받을까요?
//바로 Object클래스를 상속받습니다.
//즉    Object클래스 - 슈퍼클래스 - 서브클래스 
//혹은  Object클래스 - 클래스
//이처럼 따로 슈퍼클래스를 지정하지 않으면 Object클래스를 상속 받습니다.

class Carz1{
	
	protected int num;
	protected double gas;
	
	public Carz1() {
		
		num = 0;
		gas = 0.0;
		
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public void setCar(int n,double g) {
		
		num = n;
		gas = g;
		
		System.out.println("차량 번호를 " + num + "으로, 연료 량을 " + gas + "으로 변경하엿습니다.");
	}
	
	public String toString() {
		
		String str = "차량 번호 : " + num + " 연료 양 : " + gas;
		return str;
	}
	//Object클래스의 첫번째 메서드인 toString()이다.
	//toString()은 '객체를 나타내는 문자열을 반환'하는 일을 한다.
	//toString을 따로 생성하지 않고 System.out.pringln(car1)을 입력하면 
	//Carz1@숫자(ex. Carz1@15db9742)같은 형식으로 출력된다.
	//따라서 toString()메서드를 따로 재정의해주면 기본 반환값 형식인 Carz1@숫자보다
	//알기 쉬운 문자열이 출력되도록 할 수 있다.
}

class RcCarz1 extends Carz1{
	
	private int course;
	
	public RcCarz1() {
		
		course = 0;
		System.out.println("레이싱카가 만들어 졌습니다.");
	}
}

public class Study24_Object {

	public static void main(String[] args) {
		
		Carz1 car1 = new Carz1();
		
		car1.setCar(1235, 25.56);
		System.out.println(car1);
		
		Carz1 car2 = new Carz1();
		Carz1 car3 = new Carz1();
		
		Carz1 car4;
		car4 = car2;
		
		String s1 = "h1";
		String s2 = "h1";
		String s3 = new String("h1");
		
		boolean b11 = car2.equals(car3);
		boolean b12 = car2.equals(car4);
		
		System.out.println("car2와 car3가 같은지 조사한 결과 " + b11 + "입니다.");
		System.out.println("car2와 car4가 같은지 조사한 결과 " + b12 + "입니다.");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		
		//Object 클래스의 두번째 메서드인 equals()이다.
		//equals()는 '두 변수가 가리키는 객체가 동인한 경우에 true를 반환'하는 일을 한다.
		//비교할 변수명.equals(비교할 변수명);으로 선언할 수 있고
		//같으면 true를 다를 경우 false를 반환한다.
		//위처럼 여러가지 변수가 동인한 객체를 가리키는지 확인할 떄에 유용하게 쓰인다.
		//두 변수가 가리키는 객체가 동인한 경우에 true를 반환하는 일 외에도 
		//두 변수가 가리키는 문자열이 동인한지 조사할때에도 equals를 사용합니다.
		//car4 = car2;처럼 객체의 대입에 관련된 정보는 Study20_클래스형변수에 나와있다.
		
		Carz1[] cars = new Carz1[2];
		
		cars[0] = new Carz1();
		cars[1] = new RcCarz1();
		
		for (int i = 0; i < 2; i++) {
			
			Class cl = cars[i].getClass();
			System.out.println(i+1 + "번째 객체의 클래스는 " + cl + "입니다.");
		}
		//Object 클래스의 세번째 메서드인 getClass()이다.
		//getClass()는 'class 클래스의객체를 반환'하는 일을 한다.
		//즉 객체가 속한 클래스의 정보를 알 수 있다.
		//코드를 실행해 보면 클래스의 객체앞에 페키지이름이 붙어있다.
		//Class 변수명 = 클래스변수명.getClass();로 선언할 수 있다.
		//cars[0]의 객체는 Carz1이기 떄문에 Carz1이 나오고
		//cars[1]의 객체는 RcCarz1이기 떄문에 RcCarz1이 나온다.
	}

}
