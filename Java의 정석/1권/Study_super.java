package hi;

import java.util.Scanner;
public class Study_super {

	public static void main(String[] args) {
		
		for (int a = 1;a < 100;a++) {
			for (int b = a;b < 100;b++) {
				for(int c = 1;c < 100;c++) {
					if((a*a)+(b*b)==(c*c)) {
						System.out.printf("( %8f , %d , %d)\n",a,b,c);
					}
				}
			}
		}
	}
}