package hi;

public class Study_ObjectClass_clone_deep {

	public static void main(String[] args) {
	//	자바의정석 459p 
		RCircle c1 = new RCircle(new Pointz(1,1), 2.0);
		RCircle c2 = c1.shallowCopy();
		RCircle c3 = c1.deepCopy();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	//	일반적으로 clone을 사용하면 객체의 인스턴스 값을 저장하기 때문에
	// 	c2는 c1의 p의 주소값을 가져오기 때문에 c1.p의 x,y값이 변하게 되면 주소값을 복제하였기때문에
	// 	c2도 함께 값이 변하지만
	// 	c3는 주소값을 새롭게 지정하였기 때문에 c1.p의 x,y값을 바꿔도 문제가 없다.
	// 	c2처럼 주소값 그대로 복제하는 복제를 얕은 복사라고 하고
	// 	c3처럼 주소값을 복제하는것이 아닌 새롭게 만들어 줘서 복제하는 방법은 깊은 복사라고 한다.
}

class RCircle implements Cloneable{
	
	Pointz p;
	double r;
	
	RCircle(Pointz p,double r){
		
		this.p = p;
		this.r = r;
	}
	
	public RCircle shallowCopy() {
		
		Object obj = null;
		
		try {
			
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		
		return (RCircle)obj;	// p의 주소값을 그대로 복제한다.
	}
	
	public RCircle deepCopy() {
		
		Object obj = null;
		
		try {
			
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		
		RCircle c = (RCircle)obj;
		c.p = new Pointz(this.p.x,this.p.y);	// p의 값을 따로 복제하여 준다.
		return (RCircle)obj;
	}
	
	public String toString() { 
		return "[P = " + p + ", R = " + r + "]";
	}
}

class Pointz{

	int x,y;
	
	Pointz(int x,int y){
		
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}