package sub1;

public class Computer {

	private String cpu;
	private String ram;
	private int price;
	
	public Computer(String cpu, String ram, int price) {
		
		this.cpu = cpu;
		this.ram = ram;
		this.price = price;
	}
	
	public void calc() {
		System.out.println("��� �� ...");
	}
	
	public void booting() {
		System.out.println("���� ��...");
	}
	
	public void info() {
		System.out.println("==================");
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("��  �� : " + price);
		System.out.println("------------------");
	}
}
