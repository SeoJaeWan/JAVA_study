package hi2;

import java.util.ArrayList;

public class Study_ThreadWaitNotify {

	public static void main(String[] args) throws Exception {
		Table table = new Table();

		new Thread(new Cook(table),"COOK1").start();
		new Thread(new Customer(table,"donut"),"CUST1").start();
		new Thread(new Customer(table,"burger"),"CUST2").start();
		
		Thread.sleep(100);
		System.exit(0);
	}
}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
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

class Cook implements Runnable{
	private Table table;
	
	public Cook(Table table) { this.table = table;}
	
	public void run() {
		while (true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {Thread.sleep(1); } catch(Exception e) {}
		}
	}
}

class Table {
	String[] dishNames = { "donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD)
			try {
				wait();             // 테이블에 음식이 가득 찰 경우 기다린다.
			} catch (InterruptedException e) {}
		
		dishes.add(dish);
		notify();                   // 기다리고 있는 CUST를 깨운다.
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public boolean remove(String dishName) {
		
		synchronized(this) {
		
			while (dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				
				System.out.println(name + "is wait");
				try {
					wait();        // 음식이 추가될때 까지 기다린다.
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			for(int i = 0; i < dishes.size(); i++)
				if(dishName.contentEquals(dishes.get(i))) {
					dishes.remove(i);
					notify();      // 기다리고 있는 Cook을 깨운다.
					return true;
				}
		}	
			notify();           // 기다리고 있는 Cook을 깨운다.
			return false;
	}
	
	public int dishNum() { return dishNames.length;}
}