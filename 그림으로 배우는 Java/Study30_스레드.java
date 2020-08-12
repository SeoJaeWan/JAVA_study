package hello;

class Machine extends Thread {  //스레드를 기동시키기 위해서는 Thread클래스를 확장한 클래스를 
								//만들어야 하기 때문에 Thread클래스를 상속받습니다.
	private String name;
	
	public Machine(String nm) {
		
		name = nm;
	}
	
	public void run() { 		//스레드를 확장한 클래스는 반드시 run()메서드를 만들어야 합니다.
								//아래 mc.start()에서 start()메서드는 Thread클래스에서 상속받은 메서드로
								//start()메서드를 호출하면 새로운 스레드를 기동시키고 그 스레드는 가장먼저 run()메서드를 실행시킵니다.
		for(int i = 0; i < 5; i++) {
			
			try {
				sleep(10000);
				System.out.println(name + "이 작동중입니다.");
				//스레드를 일시 정시키는 메서드이다.
				//sleep()메서드는 반드시 try{}안에 sleep()메서드를 넣고 catch(InterruptedException e)와 함께 써주어야 한다.
				//sleep()메서드의 ()안에 1000이 1초를 나타낸다.
				//즉 sleep(1000)은 1초를 지연시키는 것이다.
			}
			catch(InterruptedException e){}
		}
	}
}

public class Study30_스레드 {

	public static void main(String[] args) {
		
		Machine mc = new Machine("1호");
		mc.start();
		//지금까지 작성한 코드는 수행과정을 하나의 흐름으로 실행됬습니다.
		//Java는 하나의 코드에서 여러 개의 처리를 동시에 실행하는 구조를 만들 수 있습니다.
		//이러한 처리 흐름을 스레드(Thread)라고 합니다.
		//스레드를 늘리는 행위를 '스레드를 기동시킨다'라고 합니다.
		
		try {
			
			mc.join();
		}
		catch(InterruptedException e) {}
		//스레드를 일시적으로 지연시키는 기능이 있다면 
		//당연히 종료를 기다렸다가 종료가 되면 다음 스레드를 진행시키는 명령어도 있다.
		//join()메서드가 바로 그 기능을 한다.
		//join()메서드는 Thread클래스의 메서드로 sleep()메서드와 마찬가지로
		//try ~catch를 반드시 사용해야 하고 
		//해당 스레드가 종료되기 전까지 다른 스레드의 작업을 전부 대기 시켰다가
		//해당 스레드의 작업이 종료가 되면 다른 스레드의 작업을 진행시킨다.
		
		Machine mc2 = new Machine("2호");
		mc2.start();
		//스레드는 오직 1개만 더 추가할 수 있는 것이 아니라 새로운 객체를 생성하여 그 객체의 
		//start()메서드를 호출하면 또다른 스레드가 1개 생겨 
		//이 코드는 총 2개였던 처리 흐름이 mc2로 인해 1개가 추가되어 3개의 처리흐름을 가지는 것입니다.
		//즉 3개의 작업을 동시에 진행하는 것입니다.
		
		for(int i = 0;i < 5; i++) {
			
			try {
				Thread.sleep(10000);
				System.out.println("main()메서드를 실행중입니다.");
				//위 run()메서드의 sleep()메서드처럼 Thread클래스의 sleep()메서드를 호출하여 사용하였다.
				//사용 방법은 위 run()메서드에서와 동일하다.
			}
			catch(InterruptedException e){}
		}
		//위 mc.start()메서드로 인해 실행중인 run()메서드 외에도 따로 main()메서드에서 별도로 
		//main()메서드를 실행중입니다.를 반복적으로 출력합니다.
		//run()메서드와 main()메서드의 반복문 총 2개의 작업은 실행 순서가 정해져있지 않고 별도의 순서에 따라 실행됩니다.
		//하지만 작업환경에 따라 출력의 순서는 달라질 수 있습니다.
	}
}
