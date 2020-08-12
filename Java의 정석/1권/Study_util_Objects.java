package hi;

import java.util.Arrays;
import java.util.Objects;	// Object클래스를 보조하기 위해서 사용되는 Objects클래스이다.
							// 객체비교나 널체크에 유용하다.
public class Study_util_Objects {

	public static void main(String[] args) {
	//	자바의 정석 496p
		String str = null;
		
		System.out.println(Objects.isNull(str));	// ()안에 있는 객체가 null값인지 확인하는 메서드이다. null이면 true를 반환한다.
		System.out.println(Objects.nonNull(str));	// ()안에 있는 객체가 null값이 아닌지 확인하는 메서드이다. null값이 아니면 true를 반환한다.
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		String[][][] str3D = new String[][][]  {{{"aaa","bbb"},{"AAA","BBB"}},
												{{"aaa","bbb"},{"AAA","BBB"}},
												{{"aaa","bbb"},{"AAA","BBB"}}};

	    String[][][] str3D_2 = new String[][][]  {{{"aaa","bbb"},{"AAA","BBB"}},
	    										{{"aaa","bbb"},{"AAA","BBB"}},
	    										{{"aaa","bbb"},{"AAA","BBB"}}};
			
		System.out.print("str2D = {");
		for(String[] tmp : str2D)
			System.out.print(Arrays.deepToString(tmp));
		System.out.println("}");
		
		System.out.print("str2D_2 = {");
		for(String[] tmp : str2D_2)
			System.out.print(Arrays.deepToString(tmp));
		System.out.println("}");
		
		System.out.println("equals(str2D,str2D_2) " + Objects.equals(str2D,str2D_2));			// str2D와 str2D_2의 값이 null이라면 true가 반환된다.
		System.out.println("deepEquals(str2D,str2D_2) " + Objects.deepEquals(str2D, str2D_2));	// deepEquals메서드는 다차원 배열도 비교할 수 있다. 
	//	Object클래스의 equals는 사용하려면 str2D.equals(str2D_2)를 사용하고 null값을 따로 검사도 해야하지만 
	//	Object클래스를 보조하기 위한 클래스로 Objects클래스는 위와 같이 사용하고 null값은 메서드 내부에서 진행하기 때문에 
	//	따로 null검사는 할 필요가 없다.
	//	대부분의 Objects클래스는 null값 검사를 메서드 안에서 전부 하기때문에 따로 검사코들르 작성할 필요가 없다.
		
		System.out.println("equals(str3D,str3D_2) " + Objects.equals(str3D,str3D_2));			
		System.out.println("deepEquals(str3D,str3D_2) " + Objects.deepEquals(str3D, str3D_2));	// 3차원 배열도 deepEqauls를 이용하여 비교가 가능하다.
		
		String str2 = null;
		
		System.out.println(Objects.toString(str2,"널이다."));	// toString()메서드도 ()안의 값이 null인지 확인하고 null이라면 
															//	""를 실행한다.
		System.out.println("hashCode(null) " + Objects.hashCode(null));
		// hashCode메서드도 기존에 같은 이름의 메서드가 있었지만 Objects의 메서드는 
		// 내부적으로 널 검사를 진행합니다.
	}

}
