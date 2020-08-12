package hello;

class TestCar{
	
	private int num;
	private double gas;
	String name;
	//int와 double은 기본형 변수이고
	//String은 참조형 변수이다.
	//이것때문에 클래스형 변수를 사용한 필드라고 하는데 도대체 어디서
	//클래스형 변수를 사용했는지 찾아보았는데 
	//String은 int처럼 new사용하지 않고 바로 변수를 선언할 수 있을 뿐이지
	//기본형 변수가 아닌 클래스를 참조하는 클래스형 변수이다.
	
	public TestCar() {
		
		num = 0;
		gas = 0.0;
		name = "무명";
		
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	void setCar(int n,double g) {
		
		num = n;
		gas = g;
		
		System.out.println("차량번호를 " + num + "으로 연료 양은 " + gas + "로 변경하였습니다.");
		
	}
	
	void setName(String nm) {
		
		name = nm;
		System.out.println("차량 이름을 " + name + "으로 바꾸었습니다.");
		
	}
	
	void show() {
		
		System.out.println("차량번호는 " + num + "입니다.");
		System.out.println("연료량은 " + gas + "입니다.");
		System.out.println("차량 이름은" + name + "입니다.");
		
	}
	
}

public class Study20_클래스형변수 {

	public static void main(String[] args) {
		
		TestCar car1 = new TestCar();
		System.out.println("car1을 선언했습니다.");
		car1.setCar(1234,20.5);
		
		TestCar car2 = car1;
		System.out.println("car2을 선언했습니다.");
		
		System.out.println("car1이 가리키는 ");
		car1.show();
		System.out.println("car2이 가리키는 ");
		car2.show();
		
		car1.setCar(1542, 32.14);
		
		System.out.println("car1이 가리키는 ");
		car1.show();
		System.out.println("car2이 가리키는 ");
		car2.show();
		//car1과 car2를 만들고 car1의 값을 지정한 다음 car2에 개별적인 값을 넣은게 아닌
		//car1을 대입해 보았다.
		//car2의 값은 car1의 값과 같게 나오지만 
		//대입한 후 car1의 값을 변경하면 car2의 값도 같이 변경된다.
		//배열에서의 대입과 같은 현상이 나온다
		//즉 car2이 car1과 같은 값을 가지는 클래스 변수가 아닌
		//동인한 객체를 가르키는 변수가 되는것이다.
		//대입 받은 변수가 대입하는 변수를 가르키게 하겠다는 뜻이다.
		//배열의 대입과 같은 특성을 지니는데 이러한 점을 유의하자
		
		car1 = null;
		//car1.show();
		//클래스 형 변수에 null을 대입하면 클래스 형 변수는 어떠한 객체도 가르킬 수 없게 됩니다.
		//해당 객체를 어떤 변수에서도 참조하지 않게 되면 객체는 소멸되고 메모리는 객체를 생성하기 전의 상태로 돌아간다고 한다.
		//이러한 메커니즘을 가비지 컬렉션이라고한다.
		//car1에 null을 대입하니 car1.show()가 실행되지 않는다.
		car2.show();
		//하지만 두개의 변수가 같은 객체를 가리킬 경우 한쪽 변수에 null을 대입한다고 객체가 소멸되는 일은 없다.
		//앞서 위에 car1 = car2로 같은 객체를 가르키고 car1에 null을 대입하여 car1이 객체를 가리킬 수 없게 되었지만
		//car2는 여전히 객체를 가르킬수 있습니다.
		
		String str = "1호차";
		car2.setName(str);
		//클래스형 변수인 str을 인수로 사용하면 실인수인 str과 가인수인 nm은 같은 객체를 가리키게된다.
		//즉 nm과 str이 같은 주소값에서 값을 받아온다 
		//이 주소값이 있는 값이 바뀌면 nm과 str이 받아오는 값도 바뀐다.
		//자바의 정석 265p에 자세하게 정리 되어있다!
		car2.show();
		
		test(car2);
		
		car2.show();
		
		test2(car2.name);
		
		car2.show();
		//위 테스트를 보면 test2의 결과를 보면 클래스형 변수를 전달한게 아니고 
		//기본형 변수를 넣었기 떄문에 메서드 안에서의 값의 변화는 적용이 안된다.
		
		TestCar[] cars;
		cars = new TestCar[3];
		
		for(int i = 0;i<cars.length;i++) {
			
			cars[i] = new TestCar();
			
		}
		//변수를 배열로 사용한거 처럼 객체도 여러가지 객체들을 모아 한번에 다루도록 
		//배열로 만들어서 사용할 수 있다.
		//클래스명[] 배열변수명;
		//배열변수명 = new 클래스명[배열크기];로 배열을 선언하고
		//배열변수명[인자값] = new 클래스명();으로 객체를 생성합니다.
		//클래스명[] 배열변수명;
		//배열변수명 = new 클래스명[배열크기];은
		//클래스명[] 배열변수명 = new 클래스명[배열크기];로 선언할 수 있습니다.
		//for문에서 배열의 길이는 배열변수명.length로 구할 수 있고
		//변수 값의 길이는 변수명.length();로 선언할 수 있다.
		//플레이어 수를 정하고 케릭을 만들떄 사용하면 될듯?
	}
	
	static void test(TestCar car2) {
		
		System.out.println("여기가 1");
		System.out.println(car2.name);
		car2.name = "2호차";
		System.out.println("여기가 2");
		System.out.println(car2.name);
		//메서드에서 클래스형 변수를 받았기때문에 참조값을 바꾸면 
		//클래스형 변수 자체의 값도 바뀌게 된다.
	}
	
static void test2(String str) {
		
		System.out.println("여기가 1");
		System.out.println(str);
		str = "2호차";
		System.out.println("여기가 2");
		System.out.println(str);
		//str이 변수의 값만 복사하여 받았기 떄문에 해당 메서드 안에서
		//str의 값을 변경한다고 실제 실인수의 값은 바뀌지 않는다.
	}
	

}
