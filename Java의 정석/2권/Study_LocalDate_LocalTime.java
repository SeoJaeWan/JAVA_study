package hi2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;   // 년 월 일 등 날짜와 시간의 필드를 정의
import java.time.temporal.ChronoUnit;    // 날짜와 시간의 단위를 정의

// 날짜를 나타내는 클래스 LocalDate
// 시간을 나타내는 클래스 LocalTime
// 날짜와 시간 모두 나타내는 클래스 LocalDateTime
// LocalDateTime에 시간대도 함께 나타내는 클래스 ZonedDateTime

public class Study_LocalDate_LocalTime {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();  // 오늘의 날짜를 알려는 클래스 LocalDate
		LocalTime now = LocalTime.now();    // 현재 시간을 알려주는 클래스 LocalTime
		// 현재 날짜와 시간을 받아오는 메서드 now() -> static 메서드이다.
		
		LocalDate birthDate = LocalDate.of(1997, 3, 21);  // 년 월 일을 특정 날로 지정
		LocalTime birthTime = LocalTime.of(23, 59,59);    // 시간을 특정 시간대로 지정
		// 지정된 날짜와 시간으로 객체를 생성하는 of() -> static 메서드이다.
		
		System.out.println("today : " + today);
		System.out.println(today.getMonthValue());       // 날짜 정보에서 월을 받아오는 메서드
		System.out.println("now : " + now);
		System.out.println("birthDate : " + birthDate);
		System.out.println("birthTime : " + birthTime);
		// LocalDate, LocalTime에서 특정 필드 값을 가져오는 메서드 get();
		
		System.out.println(birthDate.withYear(2019));  // 년도를 특정 년도로 변경
		System.out.println(birthDate.plusDays(1));     // 정해진 날짜에 +1
		// 필드의 값을 변경하기 위해서 사용되는 with(), plus(), minus()
		
		System.out.println(now.compareTo(birthTime));   // 시간을 비교 ( 같으면 0 now가 이전이면 -1 이후이면 1)
		System.out.println(today.isAfter(birthDate));   // today가 birthDate보다 이후인지 알려주는 boolean 메서드
		
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));    //  시간 아래로 전부 버리기 -> 23:59:59  => 23:00
		// 지정된 값보다 작은 단위의 값을 전부 버리는 truncatedTo() 메서드
		
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());   // 시간의 범위를 알아내는 방법 1  
		System.out.println(ChronoField.HOUR_OF_DAY.range());         // 시간의 범위를 알아내는 방법 2
	}

}
