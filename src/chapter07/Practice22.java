package chapter07;

/* [7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스의 Rectangle클래스를 작성하시오.
 * 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다.
 * (1) 클래스명 : Circle
 * 조상클래스 : Shape
 * 멤버변수 : double r - 반지름
 * 
 * (2) 클래스명 : Rectangle
 * 조상클래스 : Shape
 * 멤버변수 : double width - 폭
 * double height - 높이
 * 메서드 :
 * 1. 메서드명 : isSqure
 * 기능 : 정사각형인지 아닌지를 알려준다.
 * 반환타입 : boolean
 * 매개변수 : 없음
 */

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

class Circle extends Shape {
	
	double r;
	
	Circle(double r) {
		this(new Point(0,0), r);
	}
	
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return 3.14 * r * r;
	}
	
}

class Rectangle extends Shape {
	
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		return width * height != 0 && width == height;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
	
}

public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
