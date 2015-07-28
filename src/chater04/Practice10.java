package chater04;

public class Practice10 {

	public static void main(String[] args) {
		// [4-10] int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.

		int num10 = 12345;
		int sum10 = 0;
		while (num10 > 0) {
			sum10 += num10 % 10;
			num10 /= 10;
		}
		System.out.println("sum10=" + sum10);
	}

}
