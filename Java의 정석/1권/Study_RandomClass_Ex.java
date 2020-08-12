package hi;

import java.util.Arrays;

public class Study_RandomClass_Ex {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) 
			System.out.print(getRand(5,10));
		
		System.out.println();
		
		int[] result = fillRand(new int[10],new int[] {2,3,4,5,6});
		
		System.out.println(Arrays.toString(result));	// 배열의 요소값을 전부 출력하기 위해서 Arrays.toString(배열명)을 사용했다.
	}

	public static int getRand(int from,int to) {	// from과 to범위의 정수 값을 반환한다. (from과 to 포함)
		return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
	//	Math.abs()메서드는 ()안에 있는 절대값을 반환하여준다. 
	//  ex) Math.abs(5-10) => Math.abs(-5) => 5
	}
	
	public static int[] fillRand(int[] arr,int[] data) {	// arr배열을 data배열로 가득채워 반환한다.
		
		for(int i = 0; i < arr.length;i++) 
			arr[i] = data[getRand(0,data.length-1)];
		
		return arr;
	}
	
	public static int[] fillRand(int[] arr,int to,int from) {	// arr배열에 to와 from 범위의 값으로 채워서 반환한다.
		
		for(int i = 0;i< arr.length;i++) 
			arr[i] = getRand(to,from);
		
		return arr;
	}
}
