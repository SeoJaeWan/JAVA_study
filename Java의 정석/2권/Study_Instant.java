package hi2;

import java.time.Instant;
import java.util.Date;

public class Study_Instant {

	public static void main(String[] args) {
		
		Instant now = Instant.now();
		Instant now2 = Instant.ofEpochSecond(now.getEpochSecond());
		Instant now3 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());   // 현재 시간의 나노초를 받아온다.
		
		long epochSec = now.getEpochSecond();   // 초 단위
		int nano = now.getNano();               // 나노초 단위
		
		System.out.println(epochSec);
		System.out.println(nano);
		System.out.println(now2);
		System.out.println(now3);
		
		// Instant 클래스는 UTC(00:00)을 기준으로 하고 있기 때문에 한국의 Local시간과
		// 9시간 차이가 있다.
		
		Date date = Date.from(now);       // Instant -> Date로 시간 변환
		Instant now4 = date.toInstant();  // Date -> Instant로 시간 변환 
		// Instant가 Date를 대처하기 위해 만들어 진것이기 때문에 서로 변환이 가능하다.
	}
}
