package hi;

public class Study_StringBuilder {

	public static void main(String[] args) {
	// 	자바의 정석 482p
		StringBuilder sb = new StringBuilder("abc");
		sb.append("defg");
		
		System.out.println(sb);	// StringBuilder는 StringBuffer에서 동기화 기능만 뺸 클래스이다.
								// 그외에 기능은 모두 동일하고 동기화 기능을 뺸 이유는
								// 멀티쓰레드가 아닌경우 StringBuffer의 동기화 기능은 오히려
								// 성능을 감소시키기 떄문이다. 하지만 기존 StringBuffer도
								// 충분히 성능이 좋기 때문에 성능향상이 반드시 필요한 경우에만 사용한다.
	}

}
