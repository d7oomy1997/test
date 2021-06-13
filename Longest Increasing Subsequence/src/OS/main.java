package OS;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderStatistics Or =new OrderStatistics();
		int arr[]= {12,3,5,7,4,19,26};
		int n= arr.length,k=3;
		System.out.println("Kth smallest ele : "+ Or.KS(arr, 0, n-1, k));
	}

}
