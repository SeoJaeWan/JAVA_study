package hi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Study_StringTokenizer_Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("숫자를 입력하세요 : ");
		str = sc.next();
		
		System.out.println(str);
		
		System.out.println(KorNumToNum(str));
	}
	
	public static long KorNumToNum(String str) {
		
		final String UNIT = "십백천만억조";
		final String UNIT_NUM = "영일이삼사오육칠팔구";
		final long[] NUMBER = {10,100,1000,10000,(long)1e8,(long)1e12};
		
		long result = 0;
		long tmpResult = 0;
		long num = 0;
		
		StringTokenizer st = new StringTokenizer(str,UNIT,true);	// true를 추가한 이유는 구분자도 토큰으로 간주하게 하기위해서이다.
		
		while(st.hasMoreTokens()) {
			
			String token = st.nextToken();
			int check = UNIT_NUM.indexOf(token);
			
			if(check == -1) {		// 단위 일경우
				
				if("만억조".indexOf(token) == -1) // 만,억,조 단위가 아니일 경우
					
					tmpResult += (num != 0 ? num : 1) * NUMBER[UNIT.indexOf(token)];
				else { 			// 만,억,조 단위일 경우
					
					tmpResult += num;
					result += (tmpResult != 0 ? tmpResult : 1) * NUMBER[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			}
			else {
				num = check;
				System.out.println(num);
			}
		}
		return result + tmpResult + num;
	}

}
