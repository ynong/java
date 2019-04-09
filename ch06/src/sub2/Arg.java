package sub2;

public class Arg {

	public int x;
	
	public Arg(int x) {
		this.x = x;
	}
	
	public void add(int x) {
		x = x + 50;
	}
	
	public void add(Arg arg) {
		arg.x = arg.x + 40;
	}
	
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public Arg addNew(Arg arg) {
		arg = new Arg(0);
		return arg;
	}
}
