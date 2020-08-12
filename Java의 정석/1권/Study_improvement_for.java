package hi;

public class Study_improvement_for {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		
		for(int tmp : arr)
			System.out.print(tmp + " ");
		//첫번째 반복문은 우리가 흔히 쓰는 반복문이다.
		//두번째 반복문은 향상된 반복문으로
		//for(타입 변수명 : 배열 또는 컬렉션){
		// 반복할 문장;
		//} 으로 사용한다.
		//이때 변수의 타입은 배열 또는 컬렉션의 타입과 같아야한다
		//향상된 반복문은 배열 또는 컬렉션에 저장된 값을 순서대로 읽어서 변수에 저장하고
		//배열 또는 컬렉션에 저장된 값을 모두 저장하면 반복문에서 나가진다.
		//배열이나 컬렉션에 저장된 요소를 읽어내는 용도로 사용하면 된다!
	}
}
