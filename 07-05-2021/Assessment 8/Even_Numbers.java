import java.util.Scanner;

public class Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements : ");
		int[] arr = new int[10];
		for(int i = 1 ; i < arr.length ;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(getEvenNum(arr));

	}

	private static String getEvenNum(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i < arr.length ;i++) {
			if(arr[i] % 2 == 0) {	
				System.out.println(arr[i]);
			}
		}
		return "" ;
	}

}
