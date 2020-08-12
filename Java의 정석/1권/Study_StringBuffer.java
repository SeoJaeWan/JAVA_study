package hi;

public class Study_StringBuffer {

	public static void main(String[] args) {
	//	자바의 정석 476p
		StringBuffer str1 = new StringBuffer("abc");
		StringBuffer str2 = new StringBuffer("abc");
		
		System.out.println(str1 == str2);			// String 클래스와는 달리 StringBuffer클래스는
		System.out.println(str1.equals(str2));		// equals()메서드를 오버라이딩 하지 않아서
													// 등가비교연산자(==)와 쓰임이 같다.
		
		String s1 = str1.toString();
		String s2 = str2.toString();
		
		System.out.println(s1 == s2);		// 하지만 toString()메서드는 오버라이딩 하였기 때문에
		System.out.println(s1.equals(s2));	// StringBuffer형 변수의 값을 비교할때 toString()메서드를
											// 이용해서 String으로 변환시켜 비교한다.
		
		String st1 = new String("안녕하세요!");
		StringBuffer st2 = new StringBuffer("안녕하세요!");
		
	//	st1.append("반갑습니다.");
		st2.append("반갑습니다.");	// StringBuffer는 String과 달리 내용을 변경할 수 있다.
		
		System.out.println(st2);
		
		st2.append("잉여인간입니다.").append("잘부탁드립니다.");
								// append()메서드의 반환타입이 자기자신이기떄문에 append()를 추가로 사용할 수 있다.
		System.out.println(st2);
		
		StringBuffer stri1 = new StringBuffer("abc");
		StringBuffer stri2 = stri1.append(true);
		stri1.append("휴~").append("흠..");
		
		StringBuffer stri3 = stri1.append("dds");
		
		System.out.println(stri1);
		System.out.println(stri2);
		System.out.println(stri3);
		
		System.out.println(stri1 == stri2);	// stri2와 stri3는 stri1.append()메서드의 내용 값만 복사하는 것이 아닌
											// 주소값 자체를 복사하여 대입하였기 때문에 stri1값이 변경되면 다같이 변경된다.
		
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append("23");
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));				// 10번째 문자를 삭제하는 메서드이다.
		System.out.println("sb = " + sb.delete(3, 6));					// 3번째부터 6번째까지 삭제하는 메서드이다. 단 끝위치는 제외
		System.out.println("sb = " + sb.insert(3,"abc"));				// 3번째 자리에 abc를 삽입하는 메서드이다.
		System.out.println("sb = " + sb.replace(6,sb.length(), "END"));	// 6번째 자리의 수브터 sb.length()자리까지의 문자를 "END"로 바꾼다 단 끝자리는 제외 
		
		System.out.println("capacity = " + sb.capacity());				// StringBuffer인스턴스가 가지고 있는 버퍼의 크기를 알려준다.
		System.out.println("length = " + sb.length());					// StringBuffer문자열의 길이를 나타낸다.
	}

}
