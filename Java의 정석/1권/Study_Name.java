package hi;

public class Study_Name {

	public static void main(String[] args) {
		
		Loop1 : for (int x = 2; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				System.out.println( x * y);
				if(y == 5) {
					break Loop1;
				}
			}
		//break 문을 사용할때 가장 근접한 for문을 탈출한다고 했는데
		//Loop1 : for()처럼 for문에 이름을 만들어 주고
		//break문에 그 이름을 추가하면 근접한 반복문 뿐만아니라 
		//지정해서 반복문을 탈출할 수 있다.
		//continue도 똑같이 continue Loop1;로 사용할 수 있다.
		//for문에 이름을 붙이는 방법은 
		//이름 : for(){}이다.
		}
	System.out.println(Math.sqrt(4));
	}

}
