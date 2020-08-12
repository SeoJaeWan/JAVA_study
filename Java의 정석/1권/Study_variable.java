package hi;

class Data {int x = 0;
int show () {
	System.out.println(x);
	return x;
}
}

public class Study_variable {

	public static void main(String[] args) {
		
		Data d = new Data();
		Data d2 = new Data();
		d.x = 10;
		
		d2 = copy(d);
		System.out.println(d2.x);
		
		d.x = 5;
		System.out.println(d2.x);
		
		int result = new Data().show();
		System.out.println(result);
	}
	//매개변수뿐만아니라 반환타입도 참조형이 될 수 있다.
	//반환타입을 참조형으로 하고 주소값을 반환시키는 방법을 통해서
	//d2에 d의 값을 넣었다.
	//이는 d2 = d와는 달리 d의 값이 변경되도 
	//d2에는 영향을 끼치지 않는 다른 주소의 값을 가진다.
	
	static Data copy(Data d) {
		
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
		
	}
}
