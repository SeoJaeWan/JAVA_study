package hi2;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Study_Formalization_DecimalFormat {

	public static void main(String[] args) {
		
		double number = 1234567.89;
		String[] patten = {
				"0",
				"#",
				"0.0",
				"#.#",
				"00000000.0000",
				"########.####",
				"#.#-",
				"#E0",
				"0E0",
				"##E0",
				"00E0",
				"#,###.##+;#,###.##-",   // 양수 일 경우 #,###.##+ 음수일 경우 #,###.##-
				"#.#%"
		};
		
		for (int i = 0; i < patten.length;i++) {
			DecimalFormat df = new DecimalFormat(patten[i]);   // 문자형 patten으로 객체 생성
			System.out.printf("%19s : %s\n",patten[i],df.format(number)); // DecimalFormat 방식으로 number출력
			// DecimalFormat은 숫자를 정해진 형태로 출력해주는 형식화 클래스중 하나이다.
			// # 과 0 의 차이는 0을 자릿수가 없으면 0으로 출력하고 #은 없으면 무시하고 출력한다.
		}

		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		DecimalFormat df3 = new DecimalFormat("#,###E0");
		
		try {
			Number num = df2.parse("1,234,567.89");
			
//			int i = Integer.parseInt(num);  Integer은 콤마(,)가 포함된 문자열은 숫자로 변환하지 못한다.
			
			int i = num.intValue();  // intValue를 사용하면 변경이 가능하다.
			
			System.out.println(i); 
			
		} catch (ParseException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}		
	}
}
