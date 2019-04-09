package sub2;

public class ArgTest {

	public static void main(String[] args) {
		
		Arg arg = new Arg(100);
		int[] arr = {1, 2, 3, 4, 5};
		
		arg.add(arg.x);
		System.out.println("arg.x : " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x : " + arg.x);
		
		arg.add(arr);
		System.out.println("arr[0] : " + arr[0]);
		
		arg = arg.addNew(arg);
		System.out.println("arr.x : " + arg.x);
	}
}
