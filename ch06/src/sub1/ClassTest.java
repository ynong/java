package sub1;

public class ClassTest {

	public static void main(String[] args) {
		
		// 기본타입 변수
		int var1 = 1;
		boolean var2 = true;
		double var3 = 1.23;
		
		// 참조형 변수(객체)
		Account kb = new Account("국민은행", "123-12-1111", "홍길동", 100000000);
		Account sh = new Account("신한은행", "123-12-3111", "홍길동", 100000000);
		
		kb.deposit(10000);
		kb.withraw(5000);
		kb.show();
		
		sh.deposit(35000);
		sh.withraw(7000);
		sh.show();
	}
}
