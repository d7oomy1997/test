
public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		char s='S';
		System.out.println("Value of s:"+s);
		int g=s;
		System.out.println("Value of g:"+g);
		long f=g;
		System.out.println("Value of f:"+f);
		
		
		System.out.println("Explicit Type Casting");
		long A=90;
		int B=(int)A;
		System.out.println("Value of A "+A);
		System.out.println("Value of B "+B);
	}

}
