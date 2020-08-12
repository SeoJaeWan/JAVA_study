package hi2;

public class Study_ThreadSuspend {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Suspend th1 = new Suspend("*");
		Suspend th2 = new Suspend("**");
		Suspend th3 = new Suspend("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(1000);
			th1.suspend();
			Thread.sleep(1000);
			th2.suspend();
			Thread.sleep(1000);
			th1.resume();
			Thread.sleep(1000);
			th1.stop();
			th2.stop();
			Thread.sleep(1000);
			th3.stop();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Suspend  implements Runnable {
	
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	public Suspend(String name){
		th = new Thread(this,name);
	}
	
	public void run(){
		while(!stopped){
			if (!suspended) {
				
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {	}
			}
			else {
				Thread.yield();                         // yield() 사용
			}
		}
		System.out.println(Thread.currentThread().getName() + " stop");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();	                                // interrupt() 사용				
	}
	public void resume() {suspended = false;}
	public void stop() {
		stopped = true;
		th.interrupt();		                            // interrupt() 사용
	}
	public void start() {th.start();}
	
}
