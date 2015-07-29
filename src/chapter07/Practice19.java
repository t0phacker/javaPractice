package chapter07;
/* [7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수로 돈(money)과
 * 장바구니(cart)를 가지고 있다. 제품을 구입하는 기능의 buy메서드와 장바구니에 구입한 물건을 추가하는
 * add메서드, 구입한 물건의 목록과 사용금액, 그리고 남은 금액을 출력하는 summary메서드를 완성하시오.
 * 
 *  1. 메서드명 : buy
 *  기능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고, 장바구니(cart)에 담는다.
 *  만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
 *  반환타입 : 없음
 *  매개변수 : Product p - 구입한 물건
 *  2. 메서드명 : add
 *  기능 : 지정된 물건을 장바구니에 담는다.
 *  만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
 *  반환타입 : 없음
 *  매개변수 : Product p - 구입한 물건
 *  3. 메서드명 : summary
 *  기능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
 *  반환타입 : 없음
 *  매개변수 : 없음
 */
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
		}
			cart[i++] = p;
	}
	
	void summary() {
		String itemList = "";
		
		int totalPrice = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			}
			itemList += cart[i] + ", ";
			totalPrice += cart[i].price;
		}
		System.out.println("구입한 물건 : " + itemList);
		System.out.println("사용한 금액 : " + totalPrice);
		System.out.print("남은 금액 : " + money);
	}
}

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "TV"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}
public class Practice19 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}
