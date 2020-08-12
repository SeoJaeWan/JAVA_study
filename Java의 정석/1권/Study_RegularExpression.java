package hi;

import java.util.regex.*;

public class Study_RegularExpression {

	public static void main(String[] args) {
	//	자바의 정석 505p	
		String[] data = {"bat","bonus","cA","ca","cB","co","cb","c.","combat","data","disc","CP","COMBO"};
		String[] pattern = {"c[a-z]*","C[A-Z]*"};		// c로 시작하는 소문자 영단어 , C로 시작하는 대문자 영단어
		
		
		for(int i = 0; i < pattern.length;i++) {
			
			Pattern p = Pattern.compile(pattern[i]);	// String형 배열 pattern에서 패턴을 받아온다.
			System.out.print("Pattern : " + pattern[i] + " 결과 : ");
			
			for(int j = 0; j < data.length; j++) {
				
				Matcher m = p.matcher(data[j]);	// Pattern형 객체변수 p와 data[]를 비교하여 Matcher형 객체변수 m에 저장한다.
				if(m.matches())					// 이때 Pattern클래스의 matcher()메서드를 사용하고 값은 boolean형으로 저장된다.
					System.out.print(data[j] + " ");
			}
			System.out.println();
		}
	//	Pattern클래스는 정규식을 정의하고 Matcher클래스는 정규식을 데이터와 비교하는데 사용된다.
	//	예제에 사용된 c[a-z]뿐만아니라 다양한 정규식 패턴이 있기때문에 자바의 정석 507p를 참조하자!
	}

}
