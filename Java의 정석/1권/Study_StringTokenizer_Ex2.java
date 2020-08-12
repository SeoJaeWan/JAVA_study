package hi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Study_StringTokenizer_Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.next();

		System.out.println(num);
		System.out.println(NumToKorNum(num));
	}
	
	public static String NumToKorNum(String num) {
		
		final String UNIT = ("123456789");
		final String[] NUMBER = {"일","이","삼","사","오","육","칠","팔","구"};
		final String[] NUMBER_UNIT = {"천","백","십","조","천","백","십","억","천","백","십","만","천","백","십",""};
		
		String result = "";
		String tmpresult;
		int tkc,j = 0;
		
		if ("0".equals(num))
			return "영";
		else {
			StringTokenizer st = new StringTokenizer(num,UNIT,true);
			tkc = st.countTokens();
			
			for(int i = 15; i >= 0 ; i--) {
				
				if(i < tkc)  {
					System.out.println(j);
					String token = st.nextToken();
					
					tmpresult = NUMBER[UNIT.indexOf(token)] + NUMBER_UNIT[j];
					if ("일백일천일십".indexOf(tmpresult) != -1) {
							String tmp = tmpresult.replaceAll("일", "");
							tmpresult = tmp;
					}
					
					result += tmpresult; 			
				}
				j++;
			}
		}
		return result;
	}

}
