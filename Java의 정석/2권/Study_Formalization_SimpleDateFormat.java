package hi2;

import java.text.*;
import java.util.*;

public class Study_Formalization_SimpleDateFormat {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 5, 29);
		
		Date today =  cal.getTime();   // format메서드는 Date형만 사용가능 하기 떄문에 Calendar형에서 형변환 시켜야 한다.
		SimpleDateFormat[] sim = new SimpleDateFormat[9];
		
		sim[0] = new SimpleDateFormat("yyyy-MM-dd");
		sim[1] = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sim[2] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sim[3] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		sim[4] = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sim[5] = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sim[6] = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sim[7] = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sim[8] = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		for(int i = 0; i < sim.length;i++)
			System.out.println(sim[i].format(today));
	}

}
