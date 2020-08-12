package hi2;

import java.util.Scanner;

public class Study_ThreadInterrupt {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String st = new String();
		
		Interrupt i = new Interrupt();
		i.start();
		
		System.out.println("값을 입력하세요 ! ");
		st = s.next();
		i.interrupt();
	}
}

class Interrupt extends Thread {
	public void run() {
		int i = 10;
		
		while (i != 0 && !isInterrupted()) {
			System.out.println(i);
			
			i--;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
