package sub1;

public class InheritTest {

	public static void main(String[] args) {
		
		Computer com = new Computer("3.2GHz", "16G", 100);
		com.booting();
		com.calc();
		com.info();
		
		SmartPhone iphone = new SmartPhone("A10", "16G", 100, "아이폰", "010-1234-1111");
		SmartPhone gallaxy = new SmartPhone("2.6GHz", "16G", 100, "갤럭시", "010-1234-2222");
		
		iphone.booting();
		iphone.calc();
		iphone.calc(1);
		iphone.call();
		iphone.info();
		
		gallaxy.booting();
		gallaxy.calc();
		gallaxy.call();
		gallaxy.info();
	}
}
