package sub1;

public class Account {

	// Ư��(�������)
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// ������
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	// ���(����޼���)
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withraw(int money) {
		this.money -= money;
	}
	
	public void show( ) {
		System.out.println("=========================");
		System.out.println("��   ��   �� : " + bank);
		System.out.println("�� �� �� ȣ : " + id);
		System.out.println("��   ��   �� : " + name);
		System.out.println("��         �� : " + money);
		System.out.println("=========================");
	}
}
