package hi;



public class Study_recursive_call {

	public static void main(String[] args) {
		
		int result = factorial(4);
		
		System.out.println(result);
		
		
	}
	
	static int factorial(int x) {
		
		int result = 1;
		
		if (x == 1) result = 1;
		else result = x * factorial(x-1);
		
		return result;
	}

}
