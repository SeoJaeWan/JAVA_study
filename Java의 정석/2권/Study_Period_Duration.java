package hi2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Study_Period_Duration {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);   // date1와 date2의 날짜차이를 나타낸다.
		Period pe2 = date1.until(date2);
	//	until과 between은 둘다 날짜 차이를 나타내지만 between은 static메서드이고 until은 인스턴트 메서드이다. 
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("pe = " + pe);
		System.out.println("pe2 = " + pe2);
		
		System.out.println("YEAR : " + pe.get(ChronoUnit.YEARS));       // 각각 년 월 일을 받아오는 메서드 get이다.
		System.out.println("MONTHS : " + pe.get(ChronoUnit.MONTHS));
		System.out.println("DAY : " + pe.get(ChronoUnit.DAYS));
		
		LocalTime time1 = LocalTime.of(0, 0,0);
		LocalTime time2 = LocalTime.of(12, 34,56);
		
		Duration du = Duration.between(time1, time2);  // time1과 time2의 시간차이를 나타낸다.
		
		System.out.println("time1 : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("du : " + du);
		
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());   // Duration은 Second밖에 받아오질 못하여
		                                                                       // LocalTime으로 변환하여 각각 시 분 초를 받아온다.
		System.out.println("HOUR : " + tmpTime.getHour());
		System.out.println("MINUTE : " + tmpTime.getMinute());
		System.out.println("SECOND : " + tmpTime.getSecond());
		System.out.println(tmpTime);
	}

}
