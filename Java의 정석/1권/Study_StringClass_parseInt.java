package hi;

public class Study_StringClass_parseInt {

	public static void main(String[] args) {
    //  자바의 정석 474p
		int i,j;
		i = 300;
		String str7 = i + ""; 		// 정수 300을 문자열로 형변환 할때 간단하게 ""을 사용했다.
	//	String str7 = String.valueOf(int i); 와 같이 사용할 수 있다.
		j = Integer.parseInt(str7);	// 문자열을 다시 정수형으로 바꿀때는 Integer.parsenInt()메서드를 사용해주면 된다.
		
	//	String.valueOf()는 int 뿐만아니라 boolean, char, long, float, double을 대신 넣으면 각각에 맞는 자료형을 String형으로 바꿔준다.
	//	Integer.parseInt()도 Integer, Int 대신 Boolean, Byte, Short, Long, Float, Double을 대신 넣으면 각각에 맞는 자료형으로 String형에서 바꿀수 있다.
		
		int iVal = 100;
		String strVal1 = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+" + strVal1) + Double.parseDouble(strVal2);	//	Integer.parseInt("+" + strVal1)에서 +나 -와 같이 부호를 나타내거나
		double sum2 = Integer.valueOf(strVal1) + Double.valueOf(strVal2);			//  소수점을 의미하는 ., float을 뜻하는 f와 같은 자료형 접미사는 허용된다.
		
		System.out.println(sum);
		System.out.println(sum2);

       int a,b,c,d;
       
       a = Integer.parseInt("FF",16);   // FF를 16진수로 계산하여 255을 a에 집어넣다.
       b = Integer.parseInt("100",2);   // 100를 2진수로 계산하여 4을 b에 집어넣다.
       c = Integer.parseInt("100",8);   // 100를 8진수로 계산하여 64을 c에 집어넣다.
       d = Integer.parseInt("100",16);  // 100를 16진수로 계산하여 256을 d에 집어넣다.  즉 뒤에 2 8 16 이 진수를 나타내고 아무값도 적지 않고 
      //																	  Integer.parseInt("100")만 사용하면 10진수라고 생각한다.
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);

       a = Integer.valueOf("FF",16);   // FF를 16진수로 계산하여 255을 a에 집어넣다.     
       b = Integer.valueOf("100",2);   // 100를 2진수로 계산하여 4을 b에 집어넣다.
       c = Integer.valueOf("100",8);   // 100를 8진수로 계산하여 64을 c에 집어넣다.
       d = Integer.valueOf("100",16);  // 100를 16진수로 계산하여 256을 d에 집어넣다.

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
    // valueOf는 문자열로만 변경하는 것이 아닌 앞에 Integer, 등등을 넣어주면 각각에 맞는 자료형으로 변경하여 준다.
    // 물론 parseInt도 앞에 integer와 Int대신 각각에 맞는 자료형을 쓰면 그값으로 변경된다.
	}

}
