package hi;

public class Study_StringClass {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String str1 = "abc";				// 문자열 리터럴 "abc"가 str1에 저장됨	<- 리터럴이란 자체의 값을 말한다. 즉 "abc" 그자체
		String str2 = "abc";				// 문자열 리터럴 "abc"가 str2에 저장됨	
		String str3 = new String("abc");	// 새로운 String인스턴스가 생성됨
		String str4 = new String("abc");	// 새로운 String인스턴스가 생성됨
		
		System.out.println("str1 == str2  ? " + (str1==str2));				// "abc"라는 물자열 리터럴을 재활용 한것이기 때문에 true가 된다.
		System.out.println("str1.equals(\"str2\") ? " + str1.equals(str2));
		
		System.out.println("str3 == str4  ? " + (str3 == str4));			// "abc" 문자열 리터럴을 재활용 한것이 아닌 각자 다른 인스턴스가 생성되었기 떄문에 주소값이 다르기 때문에 false다
		System.out.println("str3.equals(\"str4\") ? " + str3.equals(str4));
		
		String str5 = new String("dog,cat,bear");
		System.out.println(str5);
		
		String[] arr = str5.split(",");								// split()메서드는 문자열""을 구분자로 나눠서 배열에 저장한다.
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);	// ","을 구분자로 했기때문에 ,로 나눠진 dog cat bear은 각각 배열에 따로 저장된다.
		
		str5 = String.join("-", arr);								// join()메서드는 문자열""을 구분해서 결합한다.
		System.out.println(str5);									// "-"로 배열의 각 문자열을 하나의 문자열로 합쳤다.
	
		String str6 = String.format("%d 더하기 %d 는 %d 이다.", 3,5,3+5);
		System.out.println(str6);
	}
}
