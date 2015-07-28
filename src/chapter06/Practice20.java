package chapter06;

// [6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
// 메서드명 : shuffle
// 기능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
// 반환타입 : int[]
// 매개변수 : int[] arr - 정수값이 담긴 배열

public class Practice20 {
	
	static int[] shuffle(int[] arr) {
		for (int i = 0; i < 20; i++) {
			int count = (int) (Math.random() * arr.length);
			int temp = 0;
			temp = arr[0];
			arr[0] = arr[count];
			arr[count] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {

		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
