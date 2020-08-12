package hi2;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Study_ThreadLcok {

	public static void main(String[] args) throws Exception {
		Tables table = new Tables();

		new Thread(new Cooks(table),"COOK1").start();
		new Thread(new Customers(table,"donut"),"CUST1").start();
		new Thread(new Customers(table,"burger"),"CUST2").start();
		
		Thread.sleep(100);
		System.exit(0);
	}
}

class Customers implements Runnable{
	private Tables table;
	private String food;
	
	public Customers(Tables table, String food) {
		// TODO 자동 생성된 생성자 스텁
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);} catch (Exception e) {}
			String name = Thread.currentThread().getName();
			if(eatFood())
				System.out.println(name + " ate a " + food);
			else 
				System.out.println(name + " failed to eat.");
		}
	}
	
	boolean eatFood() { return table.remove(food);}
}

class Cooks implements Runnable{
	private Tables table;
	
	public Cooks(Tables table) { this.table = table;}
	
	public void run() {
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {Thread.sleep(1); } catch(Exception e) {}
		}
	}
}

class Tables {
	String[] dishNames = { "donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCustomer = lock.newCondition();
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public void add(String dish) {
		
		lock.lock();                        // 락을 건다.
		try {
			if (dishes.size() >= MAX_FOOD)
				try {
					forCook.await();        // = wait()  Cook 쓰레드를 기다리게 한다.
				} catch (InterruptedException e) {}
		
			dishes.add(dish);
			forCustomer.signal();           // = notify() 음식이 나오길 기다리는 Customer 쓰레드를 깨운다.
			System.out.println("Dishes : " + dishes.toString());
		} finally {
			lock.unlock();                  // 락을 푼다
		}
		
	}
	
	public boolean remove(String dishName) {
		
		lock.lock();
		
		try {
			while (dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				
				System.out.println(name + "is wait");
				try {
					forCustomer.await();       // 음식이 추가될때 까지 기다린다.
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			for(int i = 0; i < dishes.size(); i++)
				if(dishName.contentEquals(dishes.get(i))) {
					dishes.remove(i);
					forCook.signal();      // 기다리고 있는 Cook을 깨운다.
					return true;
				}
			
			forCook.signal();           // 기다리고 있는 Cook을 깨운다.
			
			return false;
			
		} finally {
			lock.unlock();
		}
			
	}
	
	public int dishNum() { return dishNames.length;}
}