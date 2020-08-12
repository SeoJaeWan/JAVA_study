package hello;

class Company{
	
	private int sum = 0;
	
	public synchronized void add(int a) {  	//synchronized를 사용하면 스레드에 의해 해당 메서드가 호출되는 동안 다른 스레드는 해당 메서드를 호출 할 수 없습니다.
		
		int tmp = sum;
		
		System.out.println("현재 금액은 " + tmp + "입니다.");
		System.out.println(a + "원 벌었습니다.");
		
		tmp += a;
		
		System.out.println("총 금액은 " + tmp + "입니다.");
		
		sum = tmp;
	}
}

class Driver extends Thread{

	private Company comp;
	
	public Driver(Company c) {
		
		comp = c;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			comp.add(50);
		}
	}
}

public class Study32_동기화 {

	public static void main(String[] args) {

		Company cmp = new Company();
		
		Driver dr1 = new Driver(cmp);
		Driver dr2 = new Driver(cmp);
		
		dr1.start();
		dr2.start();
		//다중 스레드를 사용하면 한번에 다양한 작업을 했을떄 장점이 있습니다.
		//하지만 회사 객체와 운전자 객체를 만들고 운전자가 돈을 벌면 회사에서 번돈을 관리하게 
		//프로그래밍을 실행 시켰을때 오류가 나는것을 확인할 수 있습니다.
		//1명의 운전자가 50원씩 5번 돈을 추가시키면 총 500원이 되어야 하는데
		//250원만 적용이 되어있습니다.
		//이는 dr1이 50원을 추가하는 과정이 다 끝나지 않았는데 dr2가 돈을 추가하는 작업을 해서 값이 제대로 올라가지 않는 것입니다.
		//매우 치명적인  문제입니다.
		//이것을 해결하기 위해서 Company 클래스의 add메서드에 synchronized를 추가시켜줍니다.
		//synchronized가 붙은 메서드는 스레드에 의해 실행되는 동안 다른 스레드는 이 메서드를 호출할 수 없게 만들어 줍니다.
		//synchronized를 이용하여 스레드와 스레드 사이의 처리 타이밍 제어 메커니즘을 '동기화'라고 합니다.
	}

}
