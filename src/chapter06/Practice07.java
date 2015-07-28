package chapter06;

// [6-7] 문제 6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {	
		return Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
	}
}

public class Practice07 {
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
	}
}
