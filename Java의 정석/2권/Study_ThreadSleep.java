package hi2;

public class Study_ThreadSleep {

	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		th2.start();
		
	}
}

class Thread1 extends Thread{
	public void run() {
		
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		for(int i = 0; i < 300; i++)
			System.out.print("-");
	
		System.out.println("th1 종료");
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.print("I");
		
		System.out.println("th2 종료");
	}
}

