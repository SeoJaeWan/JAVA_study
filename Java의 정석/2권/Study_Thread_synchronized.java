package hi2;

public class Study_Thread_synchronized {
	
	public static void main(String[] args) {
		
		Runnable r = new RunnableEx();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	private int balance = 1000;
	
	public int getBalance(){
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
			balance -= money;
		}
	}
}

class RunnableEx implements Runnable{
	
	Account acc = new Account();
	
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println(acc.getBalance());
		}
	}
}