package hi;

public class Study_ObjectClass_clone {

	public static void main(String[] args) {
	//	자바의 정석 456p
		Pointer original = new Pointer(3,5);
		Pointer copy = (Pointer)original.clone();
		
		copy.x = 2;
		
		System.out.println(original.toString());
		System.out.println(copy.toString());
	//	clone 메서드를 사용하여서 original 안의 내용을 복제하여 copy로 옮겼다.
		
		Pointer2 original2 = new Pointer2(3,5);
		Pointer2 copy2 = original2.clone(); 	// Pointer2 클래스의 clone()메서드에서 return값에 형변환을 미리 해주었기 떄문에 
												// 이 줄에서 형변환을 할 필요가 없다.
		copy.x = 2;
		
		System.out.println(original.toString());
		System.out.println(copy.toString());
	}

}

class Pointer implements Cloneable{  	//  Cloneable 인터페이스를 추가해주어야 clone()메서드를 사용할 수 있는데
										//  이는 클래스 작성자가 인스턴스 데이터를 보호하기 위해서이다.
	int x,y;							//  즉 Cloneable 인터페이스를 추가해주면 복제를 허용해 준다는 뜻이다.
	
	Pointer(int x,int y){
		
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		
		return "x = " + x + " y = " + y;
	}
	
	public Object clone() {
		
		Object obj = null;
		try {
			
			obj = super.clone();		// Object 클래스에서 상속받았기 때문인지 obj의 클래스를 Pointer로 하니 예외가 발생했다.
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
}

class Pointer2 implements Cloneable{  	
	
	int x,y;							//  즉 Cloneable 인터페이스를 추가해주면 복제를 허용해 준다는 뜻이다.
	
	Pointer2(int x,int y){
		
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		
		return "x = " + x + " y = " + y;
	}
	
	public Pointer2 clone() {
		
		Object obj = null;
		try {
			
			obj = super.clone();				// Object 클래스에서 상속받았기 때문인지 obj의 클래스를 Pointer로 하니 예외가 발생했다.
		}catch(CloneNotSupportedException e) {}	// 그렇기 때문에 return에 형변환을 사용해주었다.
		return (Pointer2)obj;
	}
}