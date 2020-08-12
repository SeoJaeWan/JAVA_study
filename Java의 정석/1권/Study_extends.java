package hi;

class Shape {
	
	String color = "black";
	
	Shape(int x,int y){
		
		System.out.println("그냥씀");
	}
	
	void draw() {
		
		System.out.printf("color = %s\n",color);
	}
}

class Point{
	
	int x,y;
	
	Point(){
		
		this.x = 0;
		this.y = 0;
	}
	
	Point(int x,int y){
		
		this.x = x;
		this.y = y;
	}
	
	String getPoint() {
		
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape{
	
	Point center;
	int r;
	
	Circle (){
		
		this(new Point(0,0),100);
	}
	Circle (Point c,int r){
		
		super(1,3);
		center = c;
		this.r = r;
	}

	void draw() {
		
		System.out.printf("(x,y) = %s r = %d color = %s\n",center.getPoint(),r,color);
	}
}

class Triangle extends Shape{
	
	Point[] point = new Point[3];
	
	Triangle(Point[] p) {
		super(1,5);
		point = p;
	}
	
	void draw() {
		
		System.out.printf("p[0] = %s,p[1] = %s,p[2] = %s color = %s\n ",point[0].getPoint(),point[1].getPoint(),point[2].getPoint(),color);
	}
}



public class Study_extends {

	public static void main(String[] args) {
		
		Point[] p = { new Point (100,100),
					  new Point (140,50),
					  new Point (200,100)
					};
		Circle c = new Circle();
		Triangle t = new Triangle(p);
		
		c.draw();
		t.draw();
	}
	// 상속관계와 종속관계에 대한 코드이다.
	// 상속은 앞에서 이미 배웠기때문에 추가로 언급은 종속관계를 하면서 하겠다.
	// Circle클래스와 Triangle클래스는 각각 x축 y축의 값을 필요로 한다.
	// 하지만 매 클래스 마다 각각 선언해주면 변수가 많아지고 코드도 길어지기 때문에
	// Point라는 클래스를 만들어서 각 클래스에 종속시켰다.
	// 종속관계라고 해서 거창한 것이 아닌 각 클래스에서 Point라는 객체를 만들어서 사용하는 것이다.
	// 즉 
	// 상속관계는 ~은 ~이다 ( 원은 도형이다 ) 일때 사용하고
	// 종속관계는 ~은 ~을 가지고있다. ( 원은 좌료를 가지고있다 ) 일때 사용한다.
}
