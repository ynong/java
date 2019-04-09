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
		System.out.println(phone + "으로 전화 왔다!!");
	}
	
	// overloading 메서드
	public void calc(int x) {
		System.out.println("폰으로 계산 중 ...");
	}
	
	@Override
	public void info() {
		System.out.println("브랜드 : " + brand);
		System.out.println("폰번호 : " + phone);
	}
	
}
