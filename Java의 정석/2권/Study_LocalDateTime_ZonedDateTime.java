package hi2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.GregorianCalendar;

public class Study_LocalDateTime_ZonedDateTime {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		LocalDate date = LocalDate.of(2019, 07, 01);
		LocalTime time = LocalTime.of(12, 34,56);
		
		LocalDateTime dt = LocalDateTime.of(date, time);
	//  LocalDate과 LocalTime을 합쳐서 LocalDateTime을 만들 수 있다.
		
		date = dt.toLocalDate();
		time = dt.toLocalTime();
	//  마찬가지고 LocalDateTime에서 각각 Date와 Time을 빼낼 수 도 있다.
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
	//  LocalDateTime에 시간대(ZoneId)를 추가하여  ZonedDateTime을 만들 수 있다.
		
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyid = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyid);
	//  withZoneSameInstant() 메서드는 현재 시간에서의 nyid의 시간을 알 수 있게 해주는 메서드이다.
		
		OffsetDateTime odt = zdt.toOffsetDateTime();
	//  ZonedDateTime은 시간대와 관련된 규칙을 포함하여 시간을 계산하는데 컴퓨터가 자칫 시간대 규칙을 마음대로 계산하게 하는 행위는 위함할 수 있다.
	//  OffsetDateTime은 오직 시간의 차이로만 시간대를 구분하게 해주는 클래스이다.
		
		ZoneOffset krOffset = ZonedDateTime.now().getOffset();
	//  ZoneOffset krOffset = ZoneOfferset.of("+9");
		int krOffsetSec = krOffset.get(ChronoField.OFFSET_SECONDS);
	//  UTC로부터 얼마나 떨어져 있는지 확인하는 클래스가 ZoneOffset이다.
		
		GregorianCalendar Gc = GregorianCalendar.from(zdt);   // ZonedDateTime -> GregorianCalendar
		ZonedDateTime ZDT = Gc.toZonedDateTime();             // GregorianCalendar -> ZonedDateTime
	//  GregorianCalendar와 가장 유사한 것이 ZonedDateTime이다.
	//  그래서 서로 변환하는 방법만 알게 된다면 다양한 시간 클래스로 변환할 수 있다.
	}

}
