package hi2;

public class Study_enums {
	
	static enum kind {
		One("A"),Two("B");
		
		private final String name;
		
		kind(String name) {
			this.name = name;
		}
		
		public String toString() {
			return name;
		}
	}	

	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		kind d = kind.One;
		kind c = kind.valueOf("One");
		
		System.out.println(d);
		System.out.println(c);
		
		kind[] ad = kind.values();
		
		for(kind A : ad) {
			System.out.println(A);
		}
	}

}
