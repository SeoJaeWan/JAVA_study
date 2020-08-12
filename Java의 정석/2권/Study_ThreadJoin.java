package hi2;

public class Study_ThreadJoin {

	static long startTime;
	
	public static void main(String[] args) {
		
		Join gc = new Join();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for(int i = 0; i < 20; i ++ ) {
			requiredMemory = (int)(Math.random() * 10 ) * 20;
			
		// 	필요한 메모리가 사용할 수 있는 양보다 크거나 천제 메모리의 60%이상을 사용했을 경우 gc를 깨운다.
			if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4) {
				gc.interrupt();
			}
			
			gc.usedMemory += requiredMemory;
			System.out.println("usedMemory : " + gc.usedMemory);
		}
	}
}

class Join extends Thread {
	
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000 * 10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			gc();
			System.out.println("Garbage Collection. FreeMemory : " + freeMemory());
		}
	}
	
	public void gc() {
		usedMemory -= 300;
		if(usedMemory < 0)
			usedMemory = 0;
	}
	
	public int totalMemory() { return MAX_MEMORY;}
	public int freeMemory() { return MAX_MEMORY - usedMemory;}
}