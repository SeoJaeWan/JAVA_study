package hello;

import java.util.Scanner;

public class Study19_클래스라이브러리 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		System.out.println("정수를 입력하세요!");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("입력한 값은 " + num + "입니다.");
		//우리는 그동안 클래스를 설계하는 코드를 작성하고 클래스를 이용하여 코드를 만들었다.
		//우리가 입력을 하기위해서 사용하는 Scanner은 클래스를 따로 지정하지 않았는데 
		//사용이 가능하다. 
		//우린 이러한 클래스를 클래스 라이브러리라고 한다.
		//클래스 라이브러리 안에 있는 기본적으로 제공되는 클래스를 사용하여 클래스의 기능을 사용할 수 있습니다.
		
		String name = scan.next();
		char ch1 = name.charAt(1);
		int namelength = name.length();
		
		System.out.println(name + "이고" + ch1 + "이고 " + namelength + "이다");
		//String을 우리는 사용하는데 
		//String이란 클래스 안에는 charAt(인자값) , length();
		//처럼 다양하고 유용한 메서드가 안에 들어가있다.
		//흔히 String name = "hello";도
		//클래스 객체를 만들떄 처럼 String name = new String("hello");로 선언이 가능하지만
		//앞선 방법이 더욱 간단하고 효율적이다.
		
		String hi = "Hello";
		
		String stru = hi.toUpperCase();
		String strl = hi.toLowerCase();
		
		System.out.println(hi + "를 대문자로 변경하면 " + stru + "입니다.");
		System.out.println(hi + "를 소문자로 변경하면 " + strl + "입니다.");
		//String클래스의 메서드들 중에 포함된
		//toUpperCase();와 toLowerCase();이다
		//각각 문자열을 대문자와 소문자로 변환해주는 메서드들이다.
	
		String his = scan.next();
		String want = scan.next();
		
		num =his.indexOf(want);
		
		if(num != -1) {
			System.out.println("찾아시는 " + want + "단어는 " + his + "의 " + (num+1) + "번쨰에 있습니다.");
			System.out.println(num);
		}
		else {
			System.out.println("없어욧!");
			System.out.println(num);
			//특정문자를 검색하게 해주는 명령어로 indexiOf()가 있다.
			//his의 문장중에서 want의 단어를 찾게해주는 명령어인데
			//num은 want의 단어가 his의 문장의 몇번째에 있는지를 나타낸다.
			//-1이면 찾는 단어가 없다는 뜻이고 0~문장의 길이만큼의 숫자가 있다.
			
		}
		System.out.println("원하는 문자을 입력하세요!");	
		String str1 = scan.next();
		
		System.out.println("추가하고싶은 문장을 입력하세요!");
		String str2 = scan.next();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.println(str1 +"에 " + str2 + "를 추가하면 " + sb + "입니다.");
		//문자열을 편집하고 싶으면 StringBuffer클래스를 이용하면 된다.
		//append()메소드를 사용하면 원하는 문자를 문자열마지막에 추가할 수 있다.
		//이 외에 다양하게 문자열을 편집하고 싶다면 StringBuffer클래스의 메서드를 확인하면 된다.
		
		String number1 = scan.next();
		String number2 = scan.next();
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		//문자열로 입력받은 값을 숫자로 바꾸는 방법입니다.
		//Integer클래스와 같은 기본형을 다루는 클래스를 래퍼클래스라고 한다.
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1 + "과 " + num2 + "중 큰 값은 " + ans + "입니다.");
		//수학적 계산 기능이 가능한 Math클래스가 있다.
		//많은 기능이 있지만 max(int a, int b);로 사용이 가능한
		//max()메서드가 있다.
		//이름만 봐도 알 수 있겠지만 두개의 인자값중 큰 값을 반환해주는 메서드이다.
		//그 외에도 유용한 random()메서드가 있다. 
		//이는 난수라는 임의의 값을 구해줍니다. 
		//random()메서드는 0.0 ~ 1.0 미만의 값을 반환해줍니다.
		//이처럼 클래스 라이브러리 안의 클래스를 확인하고 싶다면
		//오라클 홈페이지에서 api항복을 참조하면 된다.
		
		scan.close();
	}

}
