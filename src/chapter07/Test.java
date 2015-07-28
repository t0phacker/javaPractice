package chapter07;
class User {
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}

class Customer extends User {
	private int account;
	static String address = "주소";
	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}
}
class testStatic {
	static void showTest() {
		System.out.println("test");
	}
}
public class Test {

	public static void main(String[] args) {
		User user = new User();
		user.setName("noName");
		user.setNumber(1);
		
		Customer customer = new Customer();
		customer.setName("yesName");
		customer.setNumber(2);
		customer.setAccount(1234);
		
		user = customer; // 업캐스팅
		System.out.println(user.getName());
		
		customer = (Customer) user; // 커스터머에 유저 대입할 땐 캐스팅 필요?
		
		int a = 1;
		double b = 2;
		a = (int) b;
		int c = 3;
		double d = 4;
		d = c;
		
		testStatic.showTest();
	}

}
