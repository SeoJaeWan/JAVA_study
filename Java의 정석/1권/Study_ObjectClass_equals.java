package hi;

public class Study_ObjectClass_equals {

	public static void main(String[] args) {
	//	자바의 정석 450p의 내용이다.	
		Value1 v1 = new Value1(10);
		Value1 v2 = new Value1(10);
		
		if (v1.equals(v2)) System.out.println("v1과 v2는 같습니다.");
		else System.out.println("v1과 v2는 다릅니다.");
		
		v1 = v2;
		
		if (v1.equals(v2)) System.out.println("v1과 v2는 같습니다.");
		else System.out.println("v1과 v2는 다릅니다.");
	// 	보통 사용하는 equals는 주소값을 비교하여주기때문에 객체 안에 있는 값은 비교할 수 가 없다.
	// 	즉 v1.value1의 값과 v2.value의 값을 비교할 수 없다.
		
		Value2 v3 = new Value2(10);
		Value2 v4 = new Value2(10);
		
		if(v3.equals(v4)) System.out.println("v3와 v4는 같습니다.");
		else System.out.println("v3와 v4는 다릅니다,");
	/*	Value2클래스 안에서 equals메서드를 오버라이딩하여 
	
	 	public boolean equals(Value2 obj) {
		
		if(obj != null && obj instanceof Value2) return value ==obj.value;
		
		else return false;
		}
		로 바꿔주었기 때문에 기존에 equals가 주소값을 비교하여 주었다면 
		Value2안에 오버라이딩하여 변경한 equals는 객체 안에 있는 값을 비교하여 준다.
	 */
	}
}

class Value1{
	
	int value;
	
	Value1(int v) {
		
		value = v;
	}
}

class Value2{
	
	int value;
	
	Value2(int v){
		
		value = v;
	}
	
	public boolean equals(Value2 obj) {
		
		if(obj != null && obj instanceof Value2) return value ==obj.value;   
		// instanceof는 obj변수가 Value2형 클래스인지 확인하는 키워드이다. 
		else return false;
	}
}