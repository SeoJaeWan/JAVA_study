package hello;

class Carz{
	
	int num;
	double gas;
	static final int Num_Type = 4;
	
	public Carz(){
		
		num = 0;
		gas = 0.0;
		
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public Carz(int n,double g) {
		
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
	
	final void show2() {
		
		System.out.println("이건 오버라이딩못해!");
		
	}
}

class RcCarz extends Carz{
	
	int course;
	
	public RcCarz(){
		
		course = 0;
		System.out.println("레이싱카가 만들어 졌습니다.");
		System.out.println(Carz.Num_Type);
		
	}
	
	public RcCarz(int n,double g,int c) {
		
		super(n,g);
		course = c;
		System.out.println("코스 번호가 " + c + "인 레이킹카가 만들어 졌습니다.");
		
	}
	
	public void setCourse(int c) {
		
		course = c;
		System.out.println("코스 번호를 " + c + "로 변경하였습니다.");
	}
	
	public void show() {
		
		super.show();   //슈퍼클래스에 있는 show()를 호출합니다.
						//만약 자신의 클래스 내에 있는 맴버를 호출할 떄에는 super를 뺴고 호출하거나 this를 붙여주면 됩니다.
		System.out.println("코스 번호는 " + course + "입니다.");
		//서브클래스에서 앞에 super를 붙이면 슈퍼클래스의 해당 메서드를 호출할 수 있습니다.
		//이렇게 하면 서브클래스의 메서드는 슈퍼클래스에서 호출한 메서드에서 추가로 필요한 코드만 
		//작성하면 되기떄문에 코드가 더욱 간편해집니다.
		//위처럼 슈퍼클래스에도 있고 서브클래스에도 있는 같은 이름을 가지는 맴버(필드,메서드)를
		//서브클래스에서 슈퍼클래스에 있는 맴버를 호출하려면 앞에 super를 붙여주면 됩니다.
		//서브클래스에서 앞에 super를 붙이지 않는다면 자신의 클래스 안에 있는 맴버를 호출하는 것이지만
		//가독성을 위해서 같은 이름을 가진 맴버를 호출할 떄에는 this를 붙여줘도 좋습니다.
	}
	/*public void show2() {
	
		System.out.println("헐! 오버라이딩이 안돼!");
		
	}*/
	//슈퍼클래스에서 show2()앞에 final을 붙였더니 서브클래스에서는 show2()라는 메서드를 만들수 없다.
	//슈퍼클래스의 메서드 앞에 final을 붙이면 서브클래스에서 오버라이딩을 할 수 없습니다.
	//뿐만 아니라 class이름 앞에 final을 붙이면 서브클래스를 만들 수 없습니다.
	//변수 앞에 final을 붙일 경우 해당 객체의 final을 붙인 변수를 사용하는 모든 객체의 값에 변경이 불가능한 
	//상수로 만든다.
	//Carz의 Num_Type앞에 final을 붙이고 4라는 값을 주면 다른 모든 Carz의 Num_Type을 사용하는 객체는
	//모두 4라는 고정된 값을 받는다. 이는 수정할 수 가 없다. 70번쨰줄
	//필드 앞에 final을 붙이는 경우 보통 static도 함께 사용한다.
	//그 이유는 static을 사용하면 메모리를 절약할 수 있기 떄문이다!
	
	
	//클래스 앞에 final을 붙이면 서브클래스를 만들수 없다.
	//메서드 앞에 final을 붙이면 오버라이딩이 불가능하다.
	//필드 앞에 final을 붙이면 그 값을 변경할 수 없다.
}

public class Study23_오버라이딩2 {
	
	public static void main(String[] args) {
		
		RcCarz car1 = new RcCarz();
		
		car1.show();
		
		test();
	}
	
	static void test() {
		
		System.out.println(Carz.Num_Type);
		
	}

}
