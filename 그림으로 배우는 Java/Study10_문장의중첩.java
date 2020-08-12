package hello;

public class Study10_문장의중첩 {

	public static void main(String[] args) {
		
		for (int i = 0; i<5; i++) {
			
			for (int j = 0; j<5; j++) {
				
				System.out.println("i의 값은 " + i + "j의 값은 " + j + "입니다." );
				
			}
			
		}
		//위처럼 for문도 명령문이기 때문에 for문 안에 다른 for문을 사용하여 반복문을 중첩으로 사용할 수 있다.
		
		boolean bl = false;
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if(bl == false) {
					
					System.out.print("*");
					bl = true;
					
				}
				else {
					
					System.out.print("-");
					bl = false;
					
				}
			}
			System.out.println();
			//System.out.print("\n");
		}
		//boolean이란 변수형과 if문을 사용하여 좀더 복잡한 for문을 만들어 봤다.
		//boolean문은 true와 false만을 값으로 가질수 있는 변수형이다.
		//줄바꿈을 위해서 System.out.println();을 넣었지만
		//System.out.print("\n");을 사용하여 대체할수도 있다.
		
	}

}
