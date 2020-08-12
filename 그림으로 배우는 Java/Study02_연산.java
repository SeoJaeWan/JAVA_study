package hello;

import java.util.Scanner;

public class Study02_연산 {

	public static void main(String[] args) {
		// 
		
		System.out.println("1+2 = " + (1+2) + "입니다.");
		System.out.println("1+2 = " + 1+2 + "입니다.");
		System.out.println("2*3 = " + (2*3) + "입니다.");
		System.out.println("2*3 = " + 2*3 + "입니다.");
		//계산식을 사용할때 덧셈을 할때 () 안에 값을 넣지 않으면 각각 1과2를 문자열로 생각하고 문자열 자체를 합친다.
		//곱셈은 ()없어도 숫자열로 생각하는 것 같지만 가독성 등을 위해서라도 ()를 꼭 사용하도록 하자!
		
		int num1 = 2;
		int num2 = 3;
		int sum = num1+num2;
		
		System.out.println("num1+num2의 값은 " + sum + "입니다.");
		
		System.out.println("num1의 값은 " + (num1+=1) + "입니다.");
		//변수 안에 값을 넣고 새로운 sum이라는 변수를 만들어 미리 값을 sum이라는 변수에 합쳐 넣은 후 출력이 가능하다.
		//아니면 출력문에서 수식을 넣어서 출력문 자체에서 값을 더할수도 있다.
		
		
		Scanner scan = new Scanner(System.in);
		
		//num1 = scan.nextInt();
		//num2 = scan.nextInt();
		//후에도 계속 연산을 해야하기 때문에 입력을 필요로 하는 명령어는 주석처리하여 스킾한다.
		
		System.out.println("num1과 num2의 값의 합은 " + (num1+num2) + "입니다.");
		//앞서 배운 키보드 입력으로 변수에 값을 받아 이용할수도 있다.
		
		int a = 0;
		int b = 0;
		
		b = a++;
		
		System.out.println("a의 값은" + a + "입니다." );
		System.out.println("b의 값은" + b + "입니다." );
		
		a = 0;
		
		b = ++a;
		
		System.out.println("a의 값은" + a + "입니다." );
		System.out.println("b의 값은" + b + "입니다." );
		//a++ 과 ++a는 결국 둘다 a에 +1을 해주는 식이다.
		//하지만 둘의 차이는 a++은 이미 있는 a의 값을 먼저 보여주고 +1을 하는것이고
		//++a는 +1을 먼저하는 것이다.
		//즉 위 a++을 사용한 b의 값은 0이고 a의 값은 1인 것이고 ++a를 사용한 b의 값은 1이고 a의 값은 1이다.
		//++과 비슷하게 --도 값에 -1을 해주는 식이다.
		
		sum = 0;
		
		//sum += scan.nextInt();
		//sum += scan.nextInt();
		//이 식도 후에 계속 식을 전계할때 입력을 필요로 하기때문에 주석처리했다.
		
		System.out.println("2개의 정수를 받은 값의 합은 " + sum + "입니다.");
		//위 sum처럼 +=등을 잘 활용하면 입력받은 값을 바로 더하는 명령어를 만들수도 있다.
		
		a= 0;
		b= 0;
		
		a = b = 1;
		
		System.out.println("a의 값은 " + a + " b의 값은 " + b + "입니다.");
		//우선 순위가 같은 a b 1을 한 식에 넣어서 그걸 출력하면 어떻게 나오는지 확인하는 문장입니다.
		//a와 b, 1의 우선순위가 같으니 보통 생각해보면 a에 먼저 b의 값이 들어갈거라는 생각을 하지만 b에 먼저 1의 값이 들어간다는 사실을 알수있습니다.
		//뭐 처음부터 알고있었으면 ... 으쯔라구요 ㅡㅡ
		
		int inum = 160;
		System.out.println("키는 " + inum + "센티미터 입니다.");
		
		System.out.println("double형 변수에 대입해보겠습니다.");
		
		double dnum = inum;
		System.out.println("키는 " + dnum + "센티미터 입니다.");
		//사이즈가 작은 변수에서 큰 사이즈의 변수형에 대입하는 식입니다.
		
		dnum = 160.5;
		System.out.println("키는 " + dnum + "센티미터 입니다.");
		
		System.out.println("int형 변수에 대입해보겠습니다.");
		
		//inum = dnum;
		inum = (int)dnum;
		System.out.println("키는 " + inum + "센티미터 입니다.");
		//우리가 작은사이즈의 변수형에서 큰사이즈의 변수형으로 변형할떄 처럼
		//단순하게 변수값 안의 값으로만 대입해주면 안되고
		//큰 변수형의 앞에 (변수형)으로 해당 변수형의 값을 미리 입력해주어야 한다.
		//이때 부동소수에서 정수로 변수형이 변형되니 소수점 뒤의 값은 전부 버림으로 한다.
		//위와같은 형변환을 캐스트 연산자라고 한다.
		
		int d = 2;
		double pi = 3.14;
		
		System.out.println("지름이 " + d + "센티미터인 원의 ");
		System.out.println("둘레는 " + (d*pi) + "센티미터 입니다.");
		//서로 변수형이 다른 변수를 연산하면 둘중 큰 데이터의 변수형으로 형변환 후 연산을 수행한다.
		
		num1 = 5;
		num2 = 4;
		
		double div = num1/num2;
		System.out.println("5/4는 " + div + "입니다.");
		
		div = (double)num1/(double)num2;
		System.out.println("5/4는 " + div + "입니다.");
		//처음 div의 값을 구했을때는 우리가 원하던 1.25값이 안나오고 1.0이 나왔습니다.
		//이는 div연산식에서 num1과 num2가 int형으로 연산이 되고 나서 double형에 대입되었기 떄문입니다.
		//즉 num1/num2가 int형 연산의 값인 1로 연산하고 해당 값을 double형인 div에 대입했기때문에 1.0이 나온것입니다.
		//이를 해결하기 위해선 위에서 공부한 캐스트 연산자를 사용하여 피연산자에 적용시켜서 double형으로 변형시켜야합니다.
		//위 연산은 처음 공부하기 위해서 각각 변수 모두에 캐스트 연산자를 사용했지만 둘중 1개만 캐스트 연산자를 사용하여 형 변환 시켜도 문제가 없습니다.
		
		scan.close();
		
	}

}
