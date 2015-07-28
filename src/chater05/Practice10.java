package chater05;

public class Practice10 {
	public static void main(String[] args) {
	// [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
	char[] abcCode = {  '\'', '~', '!', '@', '#', '$', '%', '^', '&', 
			'*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', 
			';', ':', ',', '.', '/'};
	
	char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
	
	String src = "abc123";
	String result = " ";
	char temp = '0';
	System.out.println((int)temp);
	// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
	for (int i = 0; i < src.length(); i++) {
		if (src.charAt(i) >= '0' && src.charAt(i) <= '9') {
			result += numCode[src.charAt(i) - 48];
		}
		else {
			result += abcCode[(src.charAt(i) - 97)];
		}
		
	}
	
	System.out.println("src : " + src);
	System.out.println("result : " + result);
	}
}
