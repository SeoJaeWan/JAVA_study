package hi;

public class Study_varargs {

	public static void main(String[] args) {
		
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("[" + concatenate(",", new String[1]) + "]");
		System.out.println("[" + concatenate(",") + "]");
		}
	// 기존 메서드의  매개변수는 고정적이었지만 동적으로 지정해주는 '가변인자'가 있다.
	// 사용하기 위해서는 '타입... 변수명'과 같이 사용할 수 있다.
	// 몇개의 인자값을 받을지 모르는 상황일때 위와같이 사용하면 넣는 많큼 인자의 개수가 가변적으로 증가한다.
	// 가변인자를 매개변수를 사용하면 호출될때마다 배열이 생성된다고 생각하면 된다.
	// 즉 concatenate("", "100","200","300")를 사용하면 args라는 이름에 "100","200","300"이라는 값을 저장한 배열이 생성된다.
	
	static String concatenate(String delim,String...args) {    // 가변인자 String...args를 사용
		
		String result = "";
		
		for (String str : args) result += str + delim;
		
		return result;
	}
	
	/*static String concatenate(String...args) {
		
	}*/    // 보기에는 concatenate 두개가 서로 다른 인자의 개수를 가지고 있어 오버로딩을 하는거 같아 보이지만
		   // 가변인자를 선언한 메서드를 모버로딩을 하면 구별하지 못하는 문제가 생기기 때문에  가변인자를 사용한 메서드는
		   // 오버로딩을 시키지 않는다.

}
