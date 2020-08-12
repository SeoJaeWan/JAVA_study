package hi;

class Product{
	
	int price;
	int bonusPoint;
	
	Product(int price) {
		
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	
	Tv() {
		super(100);
	}
	public String toString() {
		
		return "Tv";
	}
}

class Computer extends Product{
	
	Computer() {
		super(200);
	}
	public String toString() {
		
		return "Computer";
	}
}

class Buyer{
	
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		
		if(money < p.price) {
			
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다.");
	}
	// 다형성을 이용한 예제이다.
	// Product 타입의 참조변수를 받아 연산을 이용하는데 
	// Product 자체를 호출하는 것이 아닌 상속받은 클래스를 호출하여
	// 문장이 반복되는 점을 줄였다.
	// 이때 생성된 객체는 Product형이기 때문에 본인클래스(Tv,Computer)의 생성자와 상속받은 맴버 뺴고
	// 본인 클래스 자체에 있는 인스턴스는 사용할 수 없다.
	// 자바의 정석3_1 368p
}

public class Study_polymorphism {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("잔액은 " + b.money + "입니다.");
		System.out.println("보너스 점수는 " + b.bonusPoint + "입니다");
	}

}
