package hi;

public class Study_ObjectClass_hashCode {

	public static void main(String[] args) {
	//	자바의 정석 453p의 내용이다.	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	// 	hashCode는 값이 저장된 위치를 알려주는 메서드이다.
	// 	String클래스는 문자열이 같으면 같은 해시코드를 반환하도록 hashCode가 오버라이딩 되었기 때문에
	//	str1과 str2의 해시코드는 같지만 
	//	System.identityHashCode()는 Object클래스의 hashCode메서드처럼 객체의 주소값으로 해시코드를
	//	생성하기 때문에 모든 객체가 다른 해시코드 값을 가진다.
	}
}

