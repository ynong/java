package sub1;

public class ClassTest {

	public static void main(String[] args) {
		
		// �⺻Ÿ�� ����
		int var1 = 1;
		boolean var2 = true;
		double var3 = 1.23;
		
		// ������ ����(��ü)
		Account kb = new Account("��������", "123-12-1111", "ȫ�浿", 100000000);
		Account sh = new Account("��������", "123-12-3111", "ȫ�浿", 100000000);
		
		kb.deposit(10000);
		kb.withraw(5000);
		kb.show();
		
		sh.deposit(35000);
		sh.withraw(7000);
		sh.show();
	}
}
