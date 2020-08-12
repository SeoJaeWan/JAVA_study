package hi;

public class Study_arraycopy {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50};
		int[] New_Num = new int[num.length*2];
		
		System.arraycopy(num, 0, New_Num, 0, num.length);
		
		for(int i = 0; i < New_Num.length;i++)
			System.out.println(New_Num[i]);
		//배열을 복사할때 for문을 사용해서 하나하나 복사 했었는데
		//arraycopy()를 사용하면 빠르게 복사할 수 있다.
		//arraycopy를 사용하는 방법은
		//System.arraycopy(복사할배열,복사할배열의시작요소,값을넣을배열,넣을배열의시작요소,배열의길이);로 사용할 수 있다.
		//이렇게만 말하면 무슨말인지 잘모르겠는데
		//System.arraycopy(num, 0, New_Num, 0, num.length);를 사용하면
		//num[0]에서 New_Num[0]으로 num.length 길이만큼 복사한다는 뜻입니다.
	}
}
