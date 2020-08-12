package hello;

public class Study28_예외처리 {

	public static void main(String[] args) {
		
		int[] test1;
		test1 = new int[10];
		
		//System.out.println("test1[20]에 값을 대입합니다.");
		
		//test1[20] = 10;   배열의 첨자가 배열의 길이보다 길다
		
		//System.out.println("test[20]의 값은 " + test[20] + "입니다.");
		//System.out.println("종료하겠습니다.");
		//프로그램을 실행시키면 java.lang.ArrayIndexOutOfBoundsException: 20 ~ 라는 오류가 생길것입니다.
		//배열을 사용할때 배열의 첨자(test[20])가 배열의 길이를 넘어섰기 때문에 이러한 오류가 발생했습니다.
		//자바는 이러한 오류들을 일컬어 ArrayIndexOutOfBoundsException라는 종류의 예외가 발생했다.
		//라고 합니다.
		//이때 예외가 발생했다를 대신하여 '예외가 던져졌다'라고도 합니다.

		int[] test2;
		test2 = new int[10];
		
		try {
		
			System.out.println("test2[20]에 값을 대입합니다.");
			
			test2[20] = 10;
			
			System.out.println("test2[20]의 값은 " + test2[20] + "입니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 길이를 넘어섰습니다.");
			test2[9] = 10;  //test2[10]처럼 try에서 발생한 예외를 catch에서 받아 처리할 수 있습니다.
			
		}
		System.out.println("무사히 종료하겠습니다.");
		//test1배열은 예외가 발생했을때를 대비하여 별다를 처리를 하지 않았습니다.
		//하지만 test2배열처럼 예외를 적절하게 처리하는 코드를 작성하면 견고한 프로그램을 작성할 수 있습니다. 
		//이를 '예외 처리'라고 합니다.
		//예외 처리 방법은
		//try{
		//	예외 발생을 조사할 문장;
		//	...
		//}
		//catch(예외클래스 변수명){
		//	예외가 발생했을 때 실행시킬 코드;
		//	...
		//}
		//로 사용할 수 있습니다.
		//test1배열을 실행시켰을 때  java.lang.ArrayIndexOutOfBoundsException라는 예외(에러)가 나왔고
		//이때 클래스인 ArrayIndexOutOfBoundsException를 catch의 ()안에 넣어줍니다.
		//그후 코드를 실행했을때 try에서 해당 예외 클래스가 나오면 catch로 넘어가 안에 코드를 실행한 후 
		//catch이후의 코드를 실행합니다.
		
		int[] test3;
		test3 = new int [10];
		
		try {
			
			System.out.println("test3[20]에 값을 대입합니다.");
			
			test3[20] = 10;
			
			System.out.println("test3[20]의 값은 " + test3[20] + "입니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 길이를 넘어섰습니다.");
			test3[9] = 10;
			
		}
		finally {
			
			System.out.println("마지막에 반드시 이 코드가 실행되야 합니다.");
		}
		//catch에서 예외가 발생된 것을 받아 처리할 수 있다고 했습니다.
		//finally는 예외 발생 유무와 관계없이 반드시 블록에 선언된 멤버를 실행합니다.
		//예외를 받아낼 catch가 없더라도 finally는 실행이 됩니다.
		//파일 쓰기 작업이나 네트워크 연결 종료처리같이 중요한 작업을 하는 경우 
		//예외의 발생유무와 관계없이 메서드 내에서 반드시 실시하고 싶은 중요한 프로세스는 반드시
		//finally블록안에 작성해주어야합니다.
		//그렇지 않으면 중요한 작업중 예외가 발생했을 때 중요한 작업은 날라가버린 상태로 프로그램의 처리가 진행되는 경우가 있습니다.
	
		try {
			
			System.out.println("test3[20]에 값을 대입합니다.");
			
			test3[20] = 10;
			
			System.out.println("test3[20]의 값은 " + test3[20] + "입니다.");
		}
		catch(Exception e) {  //Exception은 모든 예외 클래스의 슈퍼클래스이다.
			
			System.out.println("배열의 길이를 넘어섰습니다.");
			System.out.println(e + "라는 예외가 발생했습니다.");
		}
		//catch에서 ()안의 예외클래스가 발생할 경우 e라는 변수가 예외를 받아냅니다.
		//e를 이용하면 어떠한 예외가 발생했는지 예외의 종류를 알 수 있습니다.
		//배열의 길이를 넘어설떄 나오는 ArrayIndexOutOfBoundsException 외에도 
		//다양한 예외 클래스가 있으니 찾으려는 예외가 있으면 클래스 라이브러리에서 찾아보는 것도 좋다.
		//ArrayIndexOutOfBoundsException클래스는 RuntimeException의 서브 클래스이고
		//RuntimeException은 Exception의 서브클래스이다
		//그러므로 catch의 ()안에 Exception클래스를 넣으면 상속받은 모든 예외 클래스를 받아내어처리할 수 있다.
	}
	//네이버를 사용하는데 우리가 로그인에 실패했을 때 아이디 및 비밀번호를 확인하라는 알림 창이 나온다
	//만약 이러한 알림창이 없을 경우 우린 무엇이 잘못되었는지 알지 못한채 하나하나 찾아야한다.
	//이처럼 예외처리를 적절하게 사용하면 사용하는 사람 입장에서 좀더 편하게 사용할 수 있다.
}
