import java.util.Scanner;

public class Smallest_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 10 values : ");
		int arr[] = new int[10];
		
		for(int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(getSmallestValue(arr));

	}

	private static int getSmallestValue(int[] arr) {
		// TODO Auto-generated method stub
		int small = arr[0];
		for(int i = 0 ; i < arr.length ; i ++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		return small;
	}

}
