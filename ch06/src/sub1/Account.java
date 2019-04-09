package sub1;

public class Account {

	// 특성(멤버변수)
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// 생성자
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// 기능(멤버메서드)
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withraw(int money) {
		this.money -= money;
	}
	
	public void show( ) {
		System.out.println("=========================");
		System.out.println("은   행   명 : " + bank);
		System.out.println("계 좌 번 호 : " + id);
		System.out.println("입   금   주 : " + name);
		System.out.println("잔         액 : " + money);
		System.out.println("=========================");
	}
}
