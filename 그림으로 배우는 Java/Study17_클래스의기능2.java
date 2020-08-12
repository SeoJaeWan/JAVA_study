package hello;

class realCar {
	
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g) {
			
			if(n > 999 && (g>0 && g<1000)) {
				
				num = n;
				gas = g;
				
				System.out.println("차량 번호는 " + num + "이고 연료 양은 " + gas + "입니다.");
				
			}
			else {
				
				System.out.println("차량 번호나 연료량을 제대로 입력하셨는지 확인하여 주세요!");
				
			}
	}
	
	private realCar() {
	
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어 졌습니다.");
	}
	
	public realCar(int n,double g) {
		
		this();
		num = n;
		gas = g;
		
		System.out.println("차량 번호가 " + num + "이고 연료 양이 " + gas + "인 자동차로 바꾸었습니다.");
		//메서드, 필드에도 제한자가 있는 것 처럼 
		//생성자에도 제한자가 사용이 된다.
		//이때 private를 생성자에게 사용하면 외부 클래스에서 이 생성자를 호출하여 객체를 생성할 수 없습니다.
		//생성자에 제한자를 붙이는 방법은 생성자가 2개 이상일 경우에만 사용해야합니다.
	}
	
	void show() {
		
		System.out.println("차량번호는 " + num + "이고 연료 양은 " + gas + "입니다.");
		
	}
	
}

public class Study17_클래스의기능2 {

	public static void main(String[] args) {

		//realCar car1 = new realCar();
		//realCar() 앞에 private라는 제한자가 붙어서 realCar()로는 호출할 수 가없다.
		
		realCar car2 = new realCar(1234,50.25);
		
		car2.show();
	}

}
