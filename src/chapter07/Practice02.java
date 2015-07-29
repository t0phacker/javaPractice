package chapter07;

// [7-2] 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
// 1. 메서드명 : shuffle
// 기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random() 사용)
// 반환타입 : 없음
// 매개변수 : 없음
// 2. 메서드명 : pick
// 기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
// 반환타입 : SutdaCard
// 매개변수 : int index - 위치
// 3. 메서드명 : pick
// 기능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환하다.(Math.random() 사용)
// 반환타입 : SutdaCard
// 매개변수 : 없음
public class Practice02 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		System.out.println();
		
		System.out.println(deck.pick(0));
	}

}
