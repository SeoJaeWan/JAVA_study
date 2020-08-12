package hi;

import java.util.Scanner;

public class Study_wrapperClass {

	public static void main(String[] args) {
	//	자바의 정석 490p
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? " + (i == i2));
		System.out.println("i.equals(i2) " + i.equals(i2));			// wrapper클래스도 equals()메서드가 오버라이딩 되어있다.
		System.out.println("i.compareTo(i2) " + i.compareTo(i2));	// compareTo()메서드는 i와 i2의 값을 비교하여 같으면 0
		System.out.println("i.toString() " + i.toString());			// 다르면 좌측값이 큰경우(i>i2) 1 반대인경우 -1의 값을 출력한다.
	//	코딩을 하다보면 매개변수로 객체를 받아야 할 경우 어쩔수 없이 기본형도 객체로 만들어야한다.
	//	그럴때 사용하는게 래퍼(wrapper)클래스이다.
	//	int형과 char형을 대신하여 Integer,Character를 사용하는 것 외엔 각 자료형 앞 글자를 대문자로 사용하면 된다.
		
		Integer i3 = new Integer("100");	// Integer생산자는 String의 값을 받을수는 있지만 
	//	Integer i4 = new Integer("100.0");	// ""안의 값이 클래스의 자료형과 틀릴경우 예외가 발생한다.
		
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE);
		System.out.println("BYTES = " + Integer.BYTES);
		System.out.println("TYPE = " + Integer.TYPE);	// 래퍼클래스에는 다양한 static상수를 공통적으로 가지고 있다.
		
		Integer num = new Integer(100);
		
		System.out.println(num.intValue());		// 숫자와 관련된 래퍼클래스는 number클래스를 상속하고 있기때문에 
		System.out.println(num.doubleValue());	// 인스턴스에 저장된 값을 다양하게 형변환할수있다.
		 
		
		System.out.println(Integer.parseInt("100",2));	// Integer.parseInt()메서드를 사용하면
		System.out.println(Integer.parseInt("100",8));	// 문자형을 단순하게 int형으로만 변경하는게 아닌
		System.out.println(Integer.parseInt("100",16));	// ("100",2)처럼 ,2(8,16)을 입력하면
		System.out.println(Integer.parseInt("FF",16));	// 문자형을 진수에 맞는 값으로 계산하여 10진수로 변경해준다.
		
		int a = 10;
		
		Integer inta = a;	// 기본형인 int형 변수 a를 참조형 Integer형 변수에 따로 형변환 없이 형변환 가능하다.
		Object obja = a;	
		
		int a2 = inta;		// 반대로 참조형 Integer형 변수를 int형 변수로 형변환없이 형변환이 가능하다.
		
		int a3 = inta + a;	// 참조형 inta와 기본형 a의 연산을 하고 int값에 형변환없이 넣을 수 있다.
		Integer inta2 = inta + a;	// 참조형 inta와 기본형 a의 연산을 하고 Integer형에 형변환없이 넣을 수 있다.
		
		Integer inta3 = inta + inta2;	// 참조형 끼리도 연산이 가능하다.
		
		System.out.println("a = " + a);
		System.out.println("inta = " + inta);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
		System.out.println("inta2 = " + inta2);
		System.out.println("inta3 = " + inta3);
	}
}
	