import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements : ");
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ;i++) {
			arr[i] =sc.nextInt();
		}
		
		System.out.println(getPrime(arr));
	}

	private static int getPrime(int[] arr) {
			int count = 0;
			
			for (int i = 2; i < arr.length; i++) {
				if (arr[i] % i == 0) {
					count++;
				}
			
			if (count == 0) {
				return arr[i];
			}
			System.out.println(arr[i]);
		}
			
			return 1;
			
		}

}
