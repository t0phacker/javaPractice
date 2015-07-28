package chater04;

public class Practice13 {

	public static void main(String[] args) {
		// [4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.
		String value13 = "12o34";
		char ch = ' ';
		boolean isNumber = true;

		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for (int i = 0; i < value13.length(); i++) {
			ch = value13.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				isNumber = false;
				break;
			}
		}

		if (isNumber) {
			System.out.println(value13 + "는 숫자입니다.");
		} else {
			System.out.println(value13 + "는 숫자가 아닙니다.");
		}
	}

}
