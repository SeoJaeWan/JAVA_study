package hi;

import java.util.StringTokenizer;

public class Study_StringTokenizer {

	public static void main(String[] args) {
	//	자바의 정석 513p	
		String source = ("100,200,300,,,400,500");
		StringTokenizer st = new StringTokenizer(source,",+");	// split처럼 문자열을 구분자를 정하여 나누는 클래스이다.
																// source를 ,기준으로 나눈 코드이다.
		while (st.hasMoreTokens()) 		// StringTokenizer를 이용하여 토큰단위로 나누고 남아있는 토큰이 있는지 확인해준다.
			System.out.println(st.nextToken());	// 다음 토큰을 반환한다.
		
		System.out.println();

		String[] sp = source.split(",");
		
		for(int i = 0; i < sp.length; i++)
			System.out.println(sp[i]);
	}
	//	StringTokenizer와 split의 차이점은 300,,,400구간에서 Tokenizer는 들어가는 값이 없다면
	//	무시하고 지나가지만 split은 그런것 없이 무조건 구분자 기준으로 나눠서 들어가는 값이 없어도 나눈다.

}
