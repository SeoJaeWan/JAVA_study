package hi;

import java.util.regex.*;

public class Study_RegularExpression_group {

	public static void main(String[] args) {
		
		String source = "HP : 010-4885-1111, HOME : 02-369-1234";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";	// 0\\d{1,2} : 0으로 시작하는 최소 2자리에서 최대 3자리
		// 정규식 일부를 괄호로 묶어서 그룹화 할 수 있다. 				// \\d{3,4} : 최소 3자리 최대 4자리의 숫자
		Pattern p = Pattern.compile(pattern);				// \\d{4} : 4자리의 숫자
		Matcher m = p.matcher(source);
		
		int i = 0;
		
		while(m.find())	// find()는 주어진 데이터(이 예제에선 source)에서 패턴과 일치하는 부분을 찾아내면 true를 반환하고 못찾으면 false를 반환한다.
						// find()는 일치한 부분을 찾아내고 다시 호출하면 이전 일치한 부분 다음부터 다시 패턴 매칭을 시작한다.
			System.out.println(++i + " : " + m.group() + " - > " 
								   + m.group(1) + ", " + m.group(2) + ", " + m.group(3) );
	//	group()혹은 group(0)은 그룹으로 매칭된 전체 문자열이고 
	//	group(1) .. group(3)은 전체 문자열을 그룹을 나눈 것이다.

	//	m.matches는 완전 일치해야 true를 반환하고 m.find는 일치하는 부분이 있으면 true를 반환한다.
	}

}
