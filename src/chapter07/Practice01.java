package chapter07;

// [7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯다카드 20장을
// 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
// 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && i == 1 || i == 3 || i == 8;
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		for (int i = 0; i < cards.length * 5; i++) {
			int shuffleNum = (int) (Math.random() * cards.length);
			SutdaCard tempCard = cards[0];
			
			cards[0] = cards[shuffleNum];
			cards[shuffleNum] = tempCard;
		}
	}
	 
	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM) {
			return null;
		}
		return cards[index];
	}
	
	SutdaCard pick() {
		int randomPick = (int) (Math.random() * cards.length);
		return cards[randomPick];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}

public class Practice01 {

	public static void main(String[] args) {
		
		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		
	}

}
