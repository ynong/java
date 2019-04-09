package sub1;

public class SmartPhone extends Computer{

	private String brand;
	private String phone;
	
	public SmartPhone(String cpu, String ram, int price, String brand, String phone) {
		super(cpu, ram, price);
		this.brand = brand;
		this.phone = phone;
	}
	
	public void call() {
		System.out.println(phone + "���� ��ȭ �Դ�!!");
	}
	
	// overloading �޼���
	public void calc(int x) {
		System.out.println("������ ��� �� ...");
	}
	
	@Override
	public void info() {
		System.out.println("�귣�� : " + brand);
		System.out.println("����ȣ : " + phone);
	}
	
}
