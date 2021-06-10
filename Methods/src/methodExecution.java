
public class methodExecution {

	public int MulNum(int a, int b) {
		int d=a*b;
		return d;
	}
	public static void main(String[] args) {
		methodExecution ME=new methodExecution();
		int anser = ME.MulNum(20,3);
		System.out.println(anser);
	}
}
