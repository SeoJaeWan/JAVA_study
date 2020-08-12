package hi;

public class Study_ObjectClass_toString {

	public static void main(String[] args) {
	//	자바의정석 454p
		Card1 c1 = new Card1();
		Card1 c2 = new Card1();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	//	Card1 클래스의 객체를 생성하고 toString()메서드를 호출하면 
	// 	Card1 클래스 내에서는 toString()메서드가 없어 Object클래스에서 
	//	상속받은 toString()메서드를 호출하여 클래스명(Card1)과 해시코드가 출력이 됩니다.
		
		String str = "KOREA";
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	//	String과 Date는 toString()메서드를 호출하였을때 
	//	각각 가지고 있는 문자열, 날짜와 시간을 호출하도록 toString()메서드가 오버라이딩되어있다.
		
		Card2 c3 = new Card2();
		
		System.out.println(c3.toString());
	//	Card1 클래스의 코드를 가지고 오고 toString()메서드를 오버라이딩하여서 
	//	Card2 클래스를 만들었다.
	// 	Object클래스에 있는 toString()메서드가 public식별자 이기 때문에
	//	public 식별자로 생성하여 원하는 출력을 return 시켜주면 된다.
	}
}

class Card1{
	
	String Kind;
	int number;
	
	Card1 (){
		
		this("SPADE",1);
	}
	
	Card1 (String Kind, int number){
		
		this.Kind = Kind;
		this.number = number;
	}
}


class Card2{
	
	String Kind;
	int number;
	
	Card2(){
		
		this("SPADE",1);
	}
	
	Card2 (String Kind, int number){
		
		this.Kind = Kind;
		this.number = number;
	}
	
	public String toString() {
		
		return "Kind : " +  Kind + " number : " + number;
	}
}