package chapter06;

// [6-4] 문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void info() {
		System.out.println(this.name + "," + this.ban + "," + this.no + "," +
	this.kor + "," + this.eng + "," + this.math);
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}
}

public class Practice04 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		s.info();
	}

}
