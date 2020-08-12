package hi;

public class Study_ObjectClass_getClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException  {
	//	자바의 정석 463p
		Card c1 = new Card("HEART",3);			// 기존에 객체를 생성할때 사용한 방법이다.
		Card c2 = Card.class.newInstance();  	// Class 객체를 이용해서 객체를 생성하는 방법이다. 
												// newInstance()는 예외가 발생할 수 있기 떄문에 throws 이용하여 예외를 미리 선언해 주어야한다.
		Class cObj = c1.getClass();				// c1의 클래스에 대한 정보를 받아오는 메서드이다.
												// 외에도 자바의 정석 463p에 더 있으니 확인해보자!
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cObj.getName());
	}

}

class Card{
	
	String kind;
	int num;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind,int num){
		
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		
		return "kind : " + kind; 
	}
}