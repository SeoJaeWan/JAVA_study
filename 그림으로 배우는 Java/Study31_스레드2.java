package hello;

class Machine2 implements Runnable{   	// Thread를 상속해주는 것이 아닌 Runnable인터페이스를 구현하였다.
										// Runnable 인터페이스는 구현할 메서드가 run() 하나뿐인 함수형 인터페이스이다.
	private String name;
	
	public Machine2(String nm) {
		
		name = nm;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(name);
		}
	}
	
}

public class Study31_스레드2 {

	public static void main(String[] args) {
		
		Machine2 mc = new Machine2("잉여인간");
		Thread th = new Thread(mc);    //Runnable 인터페이스를 구현한 클래스를 Thread 객체에게 전달하였다.
		
		th.start();		//Thread 객체의 start()메서드를 호출하여 스레드를 작동시킨다.
		//스레드를 사용하려면 클래스가 Thread클래스를 상속받아야 한다.
		//하지만 전시간에 사용한 Car클래스들은 이미 다른 클래스를 상속받고 있는 경우가 있다.
		//그떄를 위해서 다른방법의 스레드를 생성하는 방법이다.
		//클래스에 Thread 클래스를 상속하는 것이아닌 Runnable인터페이스를 구현하여 사용하는 것이다.
		//Runnable 인터페이스는 구현할 메서드가 run() 하나뿐인 함수형 인터페이스이다.
		//그후 호출할때 Runnable 인터페이스를 구현한 클래스의 객체를 Thread 객체에세 전달하여서 
		//Thread 객체의 start()메서드를 호출하여서 사용한다. 
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("main()메서드가 실행중입니다.");
		}
	}

}
